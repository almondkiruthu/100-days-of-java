
public class Solution {

    // CHALLENGE: print It is cool being a programmer

    // SOLUTION

    public static void main(String[] args) {
        System.out.println("It Is Cool being a programmer");

        // WELCOME TO DAY 2 LEARN ABOUT VARIABLES
        // Challenge: Write a program that displays "Ellie is very smart" 5 times. Each time, on a new line.

        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");
        
        // CHALLENGE:It's currently 3126. My friend was born 8 years ago.
        // Write a program that displays my friend's birth year

        int year = 3126;
        int birthyear = year-8;
        
        System.out.print("My friend's birth year is: " + birthyear);

        // CHALLENGE:Write a program that declares the following variables in the main method:
        // String name, int age, and String city.

        String name;
        int age;
        String city;

        // CHALLENGE:Uncomment one line so that the program displays the numbers 12 and 2 (first 12, and then 2).
         

        // Solution

        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

    }

}
