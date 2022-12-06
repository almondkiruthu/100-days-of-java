import java.util.Scanner;

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

        // /*Introducing how to get a User input using the scanner class
        // * First I imported the Scanner class check above the Main class.
        // */

        // // NOW WE DECLARE THE SCANNER CLASS INSTANCE.

        // Scanner myVar = new Scanner(System.in);

        // // let us try to get some input from the user

        // System.out.println(myVar.nextLine());

        /* PRIMITIVE OPERATIONS SECTION */

        /* Challenge & Solution */

        int beer = 64;
        int whisky = 23;
        // calculate the sum and output it
        int bottlesSold = beer + whisky;

        System.out.println("Bottles sold are: " + bottlesSold);

        // Modulo operator
        int value = 23;
        int res = value % 6;

        System.out.println(res);

        // Increment operator
        int test = 5;
        ++test;

        System.out.println(test);

        // Decrement operator
        int test1 = 5;
        --test1;

        System.out.println(test1);

        // Increment & Decrement CHALLENGE

        // Tom and Bob are playing a board game, in which both players start with the
        // same number of points. Tom won the first game and got 1 point, while Bob lost
        // the game, and therefore lost 1 point.

        // You are given a program that is intended to take the initial score and
        // increase Tom's score by 1 and decrease Bob's score by 1.
        // But something is wrong: the program outputs the scores without the change.

        // Task
        // Fix the program to result in the expected outputs.

        // Sample Input
        // 5

        // Sample Output
        // Round 1 results:
        // 6
        // 4

        // Explanation
        // Both players had 5 points at the start of the game. After the first game, Tom
        // gained 1 point (6, the first outputted number), and Bob lost 1 point (4, the
        // second outputted number).


        // Remember the difference between prefix and postfix operators. It will help
        // you a lot in this task.

        // SOLUTION: 
        Scanner scanner = new Scanner(System.in);
       //taking initial score
       int initScore = scanner.nextInt();
       int scoreTom = initScore;
       int scoreBob = initScore;
       
       System.out.println("Round 1 results:");
       //fix
       System.out.println(++scoreTom);
       System.out.println(--scoreBob);

    }

}
