/* Name: Eugene Kim
 * Lab 1: Simple Algorithms
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 9/16/16
 */

import java.util.Scanner;

public class Lab3_EK 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to recursion Lab 3!" + "\n");
		

		int repeat;
		do
		{
			int option;
			do
			{
				System.out.println("Please choose a recursive method below:");
				System.out.println("1. Display sequence of letters from 'a' to a given letter");
				System.out.println("2. Calculate the number of factors of 2 in the number");
				System.out.println("3. Determine if a number is a power of three");
				System.out.println("4. Reverse the digits of a number");
				System.out.println("5. Display the base 5 equivalent of a decimal number");
				System.out.println("6. Print a number with commas inserted properly.");
				option = in.nextInt();
			}while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6);
			
			if (option == 1)
			{
				char letter;
				System.out.println("Please enter a letter from the alphabet:");
				letter = in.next().charAt(0);
				letters(letter);
			}
			else if (option == 2)
			{
				int number;
				System.out.println("Please enter an integer:");
				number = in.nextInt();
				System.out.println("There are " + twos(number) + " factors of 2 in " + number + ".");
			}
			else if (option == 3)
			{
				int number;
				do
				{
					System.out.println("Please enter a positive integer:");
					number = in.nextInt();
				}while (number <= 0);
				if (powerOf3(number))
					System.out.println(number + " is a power of 3.");
				else
					System.out.println(number + " is not a power of 3");
			}
			else if (option == 4)
			{
				System.out.println("Please enter an integer:");
				int number = in.nextInt();
				System.out.println(");
			}
	
			else if (option == 5)
			{
				
			}
	
			else if (option == 6)
			{
				
			}
			
			do
			{
				System.out.println("Would you like to continue?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				repeat = in.nextInt();
			}while (repeat != 1 && repeat != 2);
			
		}while (repeat == 1);

	}
	public static void letters(char letter)
	{
		if (letter == 'a')
			System.out.print(letter);
		else
		{
			letters((char) (letter - 1));
			System.out.print(letter);
		}
	}
	public static int twos(int num)
	{
		if (num % 2 != 0)
			return 0;
		else
			return 1 + twos(num / 2);
	}
	public static boolean powerOf3(int num)
	{
		if (num % 3 == 0)
			return powerOf3(num/3);
		else if (num == 1)
			return true;
		else
			return false;
	}
	public static int reverse(int num)
	{
		//int digits;
		if (num < 10)
			System.out.println(num);
		else
			//digits = helperTotalDigits(num);
			System.out.println(num % 10);
			return reverse(num/10);
	}
	public static void base5(int num)
	{
		if (num < 5)
			System.out.print(num);
		else
			System.out.print((num/5) % 10);
			base5(num/5);
	}
	public static void printWithCommas(int num)
	{
		int digits = 0;
		if (num < 1000)
			System.out.println(num);
		else
			digits = helperTotalDigits(num);
			System.out.println(num / (digits / 3) + ",");
			printWithCommas(num % (digits / 3));
	}
	public static int helperTotalDigits(int num)
	{
		if (num < 10)
			return 1;
		else
			return 1 + helperTotalDigits(num/10);
	}
}
