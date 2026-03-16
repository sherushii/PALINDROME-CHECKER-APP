public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Call recursive method
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    // Recursive method to check palindrome
    private static boolean isPalindrome(String str, int start, int end) {

        // Base case: if start >= end
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}