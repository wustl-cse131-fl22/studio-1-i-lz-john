package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, what is the first integer number that your want to find the average of?");
		int n1 = in.nextInt();
		System.out.println("Hello, what is the second integer number that your want to find the average of?");
		double n2 = in.nextInt();
		double average = (n1 + n2) / 2;
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average + ".");

	}

}
