// version 8.0
// author Manan Sharma
// UseCase 8 Linked List Palindrome

import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        LinkedList<Character> list = new LinkedList<>();

        for(char c : input.toCharArray()) {

            list.add(c);

        }

        boolean isPalindrome = true;

        while(list.size() > 1) {

            if(list.removeFirst() != list.removeLast()) {

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