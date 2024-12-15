public class Reverse_No {
    public static void main(String[] args) {
        int number=123456780;
        while (number>0){
           int lastDigit= number%10;
            System.out.print(lastDigit+" ");
            number=number/10;

        }
    }
}
