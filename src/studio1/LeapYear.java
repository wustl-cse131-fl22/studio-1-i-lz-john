package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean result;
		boolean exception;
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, what is the year that you want to check?");
		int year = in.nextInt();
		a = (year % 4) == 0;
		b = (year % 100) != 0;
		exception = (year % 400) == 0;
		result = (a == b || (a != b & a == exception));
		System.out.println(year + " is a leap year: " + result);
		

	}

}
