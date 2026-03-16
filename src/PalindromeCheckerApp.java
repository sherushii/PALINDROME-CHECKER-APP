public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Record start time
        long startTime = System.nanoTime();

        // Palindrome check using two-pointer method
        boolean isPalindrome = checkPalindrome(input);

        // Record end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    // Palindrome checking logic
    public static boolean checkPalindrome(String input) {

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