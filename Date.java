/*
The point of this exercise is (1) to use string concatenation to display values with different types (int and String), and (2) to practice developing programs gradually by adding a few statements at a time.

Create a new program named Date.java. Copy or type in something like the Hello World program and make sure you can compile and run it.
Following the example in Section 2.4, write a program that creates variables named day, date, month, and year. The variable day will contain the day of the week (like Friday), and date will contain the day of the month (like the 13th). Assign values to those variables that represent today’s date.
Display the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far. Compile and run your program before moving on.
Modify the program so that it displays the date in standard American format; for example: Thursday, July 18, 2019.
Modify the program so it also displays the date in European format. The final output should be as follows:
    American format: Thursday, July 18, 2019
    European format: Thursday 18 July 2019
*/

public class Date {
	public static void main(String[] args) {
		String day = "Monday";
		int date = 28;
		String month = "August";
		int year = 2023;

		//American Format
		System.out.print(day + ", ");
		System.out.print(month + " ");
		System.out.print(date + ", ");
		System.out.println(year);

		//European Format
		System.out.print(day + " ");
		System.out.print(date + " ");
		System.out.print(month + " ");
		System.out.println(year);

		//want whitespace after so the command line isnt on the same line as the prints
	}
}
