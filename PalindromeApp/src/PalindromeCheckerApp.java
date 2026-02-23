// version 4.0
// author Manan Sharma
// UseCase 4 Character Array Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        char[] chars = input.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while(start < end) {

            if(chars[start] != chars[end]) {

                isPalindrome = false;
                break;

            }

            start++;
            end--;

        }

        System.out.println("Input: " + input);

        if(isPalindrome)

            System.out.println("It is Palindrome");

        else

            System.out.println("It is not Palindrome");

    }

}