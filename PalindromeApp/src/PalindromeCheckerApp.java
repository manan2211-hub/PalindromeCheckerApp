// version 5.0
// author Manan Sharma
// UseCase 5 Stack Palindrome

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {

            stack.push(c);

        }

        boolean isPalindrome = true;

        for(char c : input.toCharArray()) {

            if(c != stack.pop()) {

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