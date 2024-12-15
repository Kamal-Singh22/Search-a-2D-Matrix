import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class SecretSharing {

    // Function to convert a value from any base to base 10
    public static BigInteger convertToBase10(String value, int base) {
        return new BigInteger(value, base);
    }

    // Lagrange interpolation to calculate the constant term f(0)
    public static BigDecimal lagrangeInterpolation(Map<Integer, BigInteger> shares, int k) {
        BigDecimal secret = BigDecimal.ZERO;
        Integer[] xValues = shares.keySet().toArray(new Integer[0]);
        BigInteger[] yValues = shares.values().toArray(new BigInteger[0]);

        for (int i = 0; i < k; i++) {
            BigDecimal li = BigDecimal.ONE;

            for (int j = 0; j < k; j++) {
                if (i != j) {
                    int xi = xValues[i];
                    int xj = xValues[j];
                    li = li.multiply(BigDecimal.valueOf(-xj)).divide(BigDecimal.valueOf(xi - xj), MathContext.DECIMAL128);
                }
            }

            secret = secret.add(li.multiply(new BigDecimal(yValues[i])));
        }

        return secret;
    }

    public static void main(String[] args) {
        // Replace with your JSON input
        String jsonData = "{ \"keys\": { \"n\": 4, \"k\": 3 }, \"1\": { \"base\": \"10\", \"value\": \"4\" }, \"2\": { \"base\": \"2\", \"value\": \"111\" }, \"3\": { \"base\": \"10\", \"value\": \"12\" }, \"6\": { \"base\": \"4\", \"value\": \"213\" }}";

        // Manual parsing of JSON
        int n = 4; // Number of shares
        int k = 3; // Minimum number of shares needed

        // Map to store the decoded shares (x, y)
        Map<Integer, BigInteger> shares = new HashMap<>();

        // Extract and decode shares
        String[] parts = jsonData.split("\"");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].matches("\\d+")) { // Check if the part is a digit (key)
                int key = Integer.parseInt(parts[i]);

                // Check for base and value in the subsequent parts
                if (i + 2 < parts.length && parts[i + 2].equals("base")) {
                    int base = Integer.parseInt(parts[i + 4]); // Get the base
                    String value = parts[i + 6]; // Get the value
                    BigInteger decodedValue = convertToBase10(value, base);
                    shares.put(key, decodedValue);
                }
            }
        }

        // Perform Lagrange interpolation with the first k shares
        BigDecimal constantTerm = lagrangeInterpolation(shares, k);

        // Print the recovered constant term (the secret)
        System.out.println("The constant term (secret) is: " + constantTerm);
    }
}
