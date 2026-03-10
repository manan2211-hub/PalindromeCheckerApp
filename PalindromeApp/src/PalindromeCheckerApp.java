// version 10.0
// author Manan Sharma
// UseCase 10 Case-Insensitive & Space-Ignored Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        for(int i = 0; i < normalized.length() / 2; i++) {

            if(normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
    }
}