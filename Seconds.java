/*
Write a program that converts a total number of seconds to hours, minutes, and seconds. It should (1) prompt the user for input, (2) read an integer from the keyboard, (3) calculate the result, and (4) use printf to display the output. For example, "5000 seconds = 1 hours, 23 minutes, and 20 seconds".

Hint: Use the remainder operator.
*/

import java.util.*;

public class Seconds {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an amount of seconds for me to convert: ");
   
    int sec = in.nextInt();
    int min = 0;
    int hour = 0;

    //while there is enough seconds to take up an hour, remove those seconds and add to hours
    while (sec > 3600) {
      sec -= 3600;
      hour++;
    }

    //while there is enough seconds to take up a minute, remove those seconds and add to minutes
    while (sec > 60) {
      sec -= 60;
      min++;
    }

    //output the times
    System.out.println(sec + " seconds = " + hour + " hours, " + min + " minutes, " + sec + " seconds");
  }
}
