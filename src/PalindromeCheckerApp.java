public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original input string
        String input = "A man a plan a canal Panama";

        // Normalize the string
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Normalized : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}