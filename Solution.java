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
        // taking initial score
        int initScore = scanner.nextInt();
        int scoreTom = initScore;
        int scoreBob = initScore;

        System.out.println("Round 1 results:");
        // fix
        System.out.println(++scoreTom);
        System.out.println(--scoreBob);

        // DAYS TO SECONDS CALCULATOR
        Scanner scanner1 = new Scanner(System.in);
        int days = scanner1.nextInt();

        // your code goes here

        int seconds = days * 24 * 60 * 60;

        System.out.println(seconds);

        // INRODUCING: CONTROL FLOW SYSTEMS IN JAVA
        // Emotion Detector program

        Scanner scanner2 = new Scanner(System.in);
        int emotion = scanner2.nextInt();
        /*
         * 1 - "You are happy!"
         * 2 - "You are sad!"
         * 3 - "You are angry!"
         * 4 - "You are surprised!"
         * other - "Unknown emotion."
         */

        // your code goes here
        switch (emotion) {
            case 1:
                System.out.println("You are happy!");
                break;
            case 2:
                System.out.println("You are sad!");
                break;
            case 3:
                System.out.println("You are angry!");
                break;
            case 4:
                System.out.println("You are surprised!");
                break;
            default:

                System.out.println("Unknown emotion.");
        }

        // CHALLENGE: TO DESIGN A PROGRAM THAT CALCULATE THE FACTORIAL OF ANY NUMBER

        // Section to input the given number
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // SOLUTION:
        int fact = 1;
        // your code goes here
        while (number > 0) {
            fact *= number;
            number--;

        }
        System.out.println(fact);

        // INTRODUCING THE FOR LOOP CHALLENGE
        // For Loops

        // You are given code that takes the number of students who enter the university
        // as input. Let's greet them!

        // Task
        // Complete the program to output "Welcome" for each student.

        // Sample Input
        // 2

        // Sample Output
        // Welcome
        // Welcome

        // #TAKES AN INPUT FROM THE USER

        Scanner scanner = new Scanner(System.in);

        for (int n = scanner.nextInt(); n > 0; n--) {
            System.out.println("Welcome");
        }

        // INTRODUCING THE DO WHILE LOOP CHALLENGE

        // You're creating a bank security system. The user must insert the correct
        // password in order to access payments.
        // The password is 8819.

        // Task
        // Write a program that will continuously take a password as input and output
        // Write password, until the client inserts the correct password.

        // Sample Input
        // 3332
        // 8819

        // Sample Output
        // Write password
        // Write password

        // #TAKES AN INPUT FROM THE USER

        Scanner scanner = new Scanner(System.in);

        int password;

        do {
            System.out.println("Write password");
            password = read.nextInt();
        } while (password != 8819);

        // AWESOME CHALLENGE LOAN CALCULATOR CHALLENGE

        // Loan Calculator

        // You take a loan from a friend and need to calculate how much you will owe him
        // after 3 months.
        // You are going to pay him back 10% of the remaining loan amount each month.
        // Create a program that takes the loan amount as input, calculates and outputs
        // the remaining amount after 3 months.

        // Sample Input:
        // 20000

        // Sample Output:
        // 14580

        // Here is the monthly payment schedule:
        // Month 1
        // Payment: 10% of 20000 = 2000
        // Remaining amount: 18000
        // Month 2
        // Payment: 10% of 18000 = 1800
        // Remaining amount: 16200
        // Month 3:
        // Payment: 10% of 16200 = 1620
        // Remaining amount: 14580

        // SOLUTION:
        int amount23;
        int months23 = 3;

        for (int i = 0; i < months23; i++) {
            amount23 = amount23 - amount23 * 10 / 100;

            System.out.println(amount23);
        }

        // ARRAYS:
        // TO CALCULATE THE SUM OF THE ELEMENTS IN AN ARRAY
        int[] myArr = { 6, 42, 3, 7 };
        int sumXS = 0;
        for (int xZ = 0; xZ < myArr.length; xZ++) {
            sumXS += myArr[x];
        }
        System.out.println(sum);
        // ....

        // THE ENHANCED FOR LOOP

        // CHALLENGE:
        // Enhanced for Loop

        // Your company is writing a program for a geometry course.
        // The program takes the number of squares as the first input, creates an array,
        // and then takes the sides of squares as its elements.
        // Write the part of the program that receives a list of square sides and prints
        // the area of those squares for the user.

        // Sample Input
        // 2
        // 3
        // 4

        // Output
        // 9
        // 16

        // Explanation
        // In this example we have 2 squares (the first input) and their sides
        // accordingly - 3 and 4 (the second and the third inputs). The area of the
        // first square is 9 (3*3), the second one 16 (4*4).

        // SOLUTION:

        // TAKES THE INPUT FROM THE USER
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides = new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }
        // your code goes here
        for (int t : sides) {
            t = t * t;
            System.out.println(t);
        }

        // THE REVERSE STRING ARRAY CHALLENGE:
        // Reverse a String

        // Write a program to take a string as input and output its reverse.
        // The given code takes a string as input and converts it into a char array,
        // which contains letters of the string as its elements.

        // Sample Input:
        // hello there

        // Sample Output:
        // ereht ollehs

        // SOLUTION: 
        Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		for(int x = arr.length-1; x >= 0; x--){
			System.out.print(arr[x]);
		}
    //    CHALLENGE: INRODUCING THE METHODS, PARAMETER TYPE METHODS AND RETURN TYPE METHODS 
    // Method Return Types


    // You are an assistant on a TV show where celebrities are dancing and 4 judges evaluate their performance and give them a score between 1 and 10.
   // The program you are given takes the scores as input.
   // Complete the method to take them as parameters, then calculate and return the average score.

   // Sample Input
   // 6.0
  // 4.0
  // 5.0
  // 3.0

  // Sample Output
  // 4.5


    // SOLUTION: 
       Scanner read = new Scanner(System.in);
       double score1 = read.nextDouble();
       double score2 = read.nextDouble();
       double score3 = read.nextDouble();
       double score4 = read.nextDouble();
       double avgScore = getAverageScore(score1, score2, score3, score4);
       System.out.println(avgScore);
       
       // create your method here
    public static double getAverageScore(double x, double y, double z, double e) {
        return (x + y + z + e) / 4;
    }
    // codeeee come and code the fun bit

    //  Declaring classes 
    public class Animal {
        void bark() {
          System.out.println("Woof-Woof");
        }
      }
    //   f 
    // f 
    // f /

    // f 

    // h ?

    // clasees 
    // clasees 
    // clasees 
    // clasees 
}

}
