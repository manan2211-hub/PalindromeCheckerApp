// version 2.0
// UseCase 2 Hardcoded Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = true;

        for(int i = 0; i < input.length()/2; i++) {

            if(input.charAt(i) != input.charAt(input.length()-1-i)) {

                isPalindrome = false;
                break;

            }

        }

        System.out.println("Input: " + input);

        if(isPalindrome)
            System.out.println("It is Palindrome");

        else
            System.out.println("It is not Palindrome");

    }

}