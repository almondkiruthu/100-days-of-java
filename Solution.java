
public class Solution {

    // CHALLENGE: print It is cool being a programmer

    // SOLUTION

    public static void main(String[] args) {
        System.out.println("It Is Cool being a programmer");

        // WELCOME TO DAY 2 LEARN ABOUT VARIABLES
        // Challenge: Write a program that displays "Ellie is very smart" 5 times. Each
        // time, on a new line.

        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");
        System.out.println("Ellie is very smart");

        // CHALLENGE:It's currently 3126. My friend was born 8 years ago.
        // Write a program that displays my friend's birth year

        int year = 3126;
        int birthyear = year - 8;

        System.out.print("My friend's birth year is: " + birthyear);

        // CHALLENGE:Write a program that declares the following variables in the main
        // method:
        // String name, int age, and String city.

        String name;
        int age;
        String city;

        // CHALLENGE:Uncomment one line so that the program displays the numbers 12 and
        // 2 (first 12, and then 2).

        // Solution

        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
        // CHALLENGE-2 FOR THE COMMENT LEARNING SECTION:Comment out a few lines to
        // display "2 plus 3 is equal to 5" on the screen.

        // SOLUTION:

        int a = 3;
        int b = 2;

        // System.out.print("two");
        System.out.print(b);
        System.out.print(" plus ");
        // System.out.print(" minus ");
        System.out.print(a);
        // System.out.print("three");
        System.out.print(" is equal to ");
        // System.out.print(" equals ");
        // System.out.print("five");
        System.out.print(a + b);

        // CHALLENGE 3 FOR THE COMMENT LEARNING SECTION: Remove comments from part of
        // the code so that "Happy New Year" appears on the screen.

        // SOLUTION:
        // String s = "Merry";
        // System.out.println("Christmas");
        // System.out.println("Merry New");
        // System.out.println("weekend");
        System.out.print("Happy New");
        // System.out.println("weekend");
        // System.out.println(s);
        // System.out.print("Merry New!");
        System.out.print(" ");
        System.out.println("Year");

        // CHALLENGE 4 FOR THE COMMENT SECTION: Comment out some code so that "sum = 12"
        // appears on the screen.

        // SOLUTION:
        int c = 3;
        // int a = 10;
        int e = 6;
        // int b = 12;
        // int sum = 1 + a + b;
        // int sum = 2 + a + b;
        int sum = 3 + a + b;
        // int sum = 4 + a + b;

        System.out.println("sum = " + sum);


        // LEARN CHARACTER VARIABLES
        char f = 'A';
        System.out.println(f);

        // variables
        String name1 = "Toyota";
        double engine = 4.7;
        int year1 = 2019;
       
        System.out.println("Name: " + name1);
        System.out.println("Engine: " + engine);
        System.out.println("Year: " + year1);

    }

}
