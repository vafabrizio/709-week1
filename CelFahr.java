/*
Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. When it’s finished, it should work like this:

Enter a temperature in Celsius: 24
24.0 C = 75.2 F
Here is the formula to do the conversion:

F = C × (9/5) + 32 
Hint: Be careful not to use integer division!
*/
import java.util.*;

public class CelFahr {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a temperature in Celsius: ");
    double cel = in.nextDouble();

    double fahr = cel * (9.0/5.0) + 32.0;

    System.out.printf("%.1f C = %.1f F\n", cel, fahr);
  }
}
