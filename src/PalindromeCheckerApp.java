public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Create strategies
        PalindromeStrategy reverseStrategy = new ReverseStrategy();
        PalindromeStrategy twoPointerStrategy = new TwoPointerStrategy();

        // Execute strategies
        System.out.println("Input : " + input);

        System.out.println("Reverse Strategy Result : " +
                reverseStrategy.checkPalindrome(input));

        System.out.println("Two Pointer Strategy Result : " +
                twoPointerStrategy.checkPalindrome(input));
    }
}

/**
 * Strategy Interface
 * Defines common method for palindrome algorithms
 */
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/**
 * Strategy 1: Reverse String Method
 */
class ReverseStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String reversed = new StringBuilder(input).reverse().toString();

        return input.equals(reversed);
    }
}

/**
 * Strategy 2: Two Pointer Method
 */
class TwoPointerStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}