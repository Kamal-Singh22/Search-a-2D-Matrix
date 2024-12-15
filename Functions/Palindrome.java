public class Palindrome {

    public static boolean isPalindrome(int n) {
        int reverseNumber = 0;
        int originalNumber = n;
        
        while (n != 0) {
            int remainder = n % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            n /= 10;
        }
        
        return originalNumber == reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
    }
}
