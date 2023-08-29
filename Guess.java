/*
The goal of this exercise is to program a Guess My Number game. When it’s finished, it should work like this:

I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31

The definition of GuessStarter is in a file called GuessStarter.java, in the directory called ch03, in the repository for this book.
Compile and run this program.
Modify the program to prompt the user; then use a Scanner to read a line of user input. Compile and test the program.
Read the user input as an integer and display the result. Again, compile and test.
Compute and display the difference between the user’s guess and the number that was generated.
*/

import java.util.*;

public class Guess {
  public static void main(String[] args) {
    // pick a random number
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.println(number);

    //scanner
    Scanner in = new Scanner(System.in);

    System.out.print("I'm thinking of a number between 1 and 100 (including both).\nCan you guess what it is?\n\nType a number: ");
    int guess = in.nextInt();
    System.out.println("You guessed: " + guess);

    System.out.println("The number I was thinking was: " + number);

    int diff = 0;
    // make sure that the difference doesn't come out negative
    if (guess >= number) { diff = guess - number; }
    else { diff = number - guess; }
    
    System.out.println("You were off by: " + diff);
  }
}
