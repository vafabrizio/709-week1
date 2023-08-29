/*
The point of this exercise is to (1) use some of the arithmetic operators, and (2) start thinking about compound entities (like time of day) that are represented with multiple values.

Create a new program called Time.java. From now on, we won’t remind you to start with a small, working program, but you should.
Following the example program in Section 2.4, create variables named hour, minute, and second. Assign values that are roughly the current time. Use a 24-hour clock so that at 2:00 PM the value of hour is 14.
Make the program calculate and display the number of seconds since midnight.
Calculate and display the number of seconds remaining in the day.
Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.
Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time since you started working on this exercise.
Hint: You might want to use additional variables to hold values during the computation. Variables that are used in a computation but never displayed are sometimes called “intermediate” or “temporary” variables.
*/

public class Time {
  public static void main(String[] args) {
    int hour = 21;
    int minute = 17;
    int second = 41;
    System.out.println("Current time: " + hour + ":" + minute + ":" second);

    int secondsSinceMidnight = second + (minute*60) + (hour*60*60);
    System.out.println("Seconds since midnight: " + secondsSinceMidnight);
    
    int secondsToMidnight = (60 - second) + ((60 - 1 - minute)*60) + ((24 - 1 - hour)*60*60);
    System.out.println("Seconds until midnight: " + secondsToMidnight);

    double percentageOfDay = (double) secondsSinceMidnight / 86400.0;
    System.out.println("Percentage of the Day Passed: " + percentageOfDay);

    int newHour = 21;
    int newMinute = 27;
    int newSecond = 11;
    System.out.println("New time: " + newHour + ":" + newMinute + ":" newSecond);

    int timeSinceHour = 0;
    int timeSinceMinute = 0;
    int timeSinceSecond = 0;

    if (newSecond >= second) { timeSinceSecond = newSecond - second; }
    else { 
      timeSinceSecond = 60 - second + newSecond;
      timeSinceMinute--; 
    }

    if (newMinute >= minute) { timeSinceMinute += newMinute - minute; }
    else { 
      timeSinceMinute = 60 - minute + newMinute;
      timeSinceHour--; 
    }

    if (newHour >= hour) { timeSinceHour += newHour - hour; }
    else { timeSinceHour = 24 - hour + newHour; }

    System.out.println("Elapsed Time: " + timeSinceHour + ":" + timeSinceMinute + ":" timeSinceSecond);
  }
}
