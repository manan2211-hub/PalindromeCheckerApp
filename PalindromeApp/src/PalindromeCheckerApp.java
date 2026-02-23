// version 3.0
// author Manan Sharma
// UseCase 3 String Reverse Palindrome

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--) {

            reversed = reversed + input.charAt(i);

        }

        System.out.println("Input: " + input);

        System.out.println("Reversed: " + reversed);

        if(input.equals(reversed))

            System.out.println("It is Palindrome");

        else

            System.out.println("It is not Palindrome");

    }

}