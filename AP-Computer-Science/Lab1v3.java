/* Name: Eugene Kim
 * Lab 1: Simple Algorithms
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 9/16/16
 */

import java.util.Scanner;

public class Lab1_EK
{
	public static void main(String[] args) 
	{
		Scanner scanIn = new Scanner(System.in);
		
		int option;
		int posint1;
		int posint2;
		double posdoub1;
		int repeat;
		
		do
		{
			do
			{
				System.out.print("Please enter an integer to choose a simple algorithm from below: " + "\n");
				System.out.print("1. Find all the factors of a positive integer." + "\n");
				System.out.print("2. Find the GCD of two positive integer parameters." + "\n");
				System.out.print("3. Determine if a given integer greater than one is prime." + "\n");
				System.out.print("4. Raise a given real number to a given integer power." + "\n");
				System.out.print("5. Return the nth digit (a positive integer) from the right of a given integer" + "\n");
				System.out.print("6. List the digits of a positive integer in one column." + "\n");
				System.out.print("7. Return the number of digits to the left of the decimal point of a valid decimal point number." + "\n");
				option = scanIn.nextInt();
			}while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option !=6 && option != 7);
			if (option == 1)
			{
				do
				{
					System.out.print("Please enter a positive integer: " + "\n");
					posint1 = scanIn.nextInt();
				}while (posint1 <= 0);
				factors(posint1);
			}
			else if (option == 2)
			{
				do
				{
					System.out.print("Please enter two positive integers: " + "\n");
					posint1 = scanIn.nextInt();
					posint2 = scanIn.nextInt();
				}while (posint1 <= 0 || posint2 <= 0);
				System.out.print("The GCD of " + posint1 + " and " + posint2 + " is " + gcd(posint1, posint2) + ".");
			}
			else if (option == 3)
			{
				do
				{
					System.out.print("Please enter a positive integer: " + "\n");
					posint1 = scanIn.nextInt();
				}while (posint1 <= 1);
				if (prime(posint1) == true)
					System.out.print(posint1 + " is a prime number.");
				else
					System.out.print(posint1 + " is not a prime number.");
			}
			else if (option == 4)
			{
				do
				{
					System.out.print("Please enter a real number base and an integer exponent: " + "\n");
					posdoub1 = scanIn.nextDouble();
					posint1 = scanIn.nextInt();
				}while (posdoub1 == 0 && posint1 <= 0);
					System.out.print(posdoub1 + " raised to the " + posint1 + " power is " + power(posdoub1, posint1));
			}
			else if (option == 5)
			{
				do
				{
					System.out.print("Please enter a number and the nth digit from the right you would like to return: " + "\n");
					posint1 = scanIn.nextInt();
					posint2 = scanIn.nextInt();
				}while (posint2 <= 0);
				System.out.print("The " + posint2 + "th digit from the right of " + posint1 + " is " + findDigit(posint1, posint2) + ".");
			}
			else if (option == 6)
			{
				do
				{
					System.out.print("Please enter a positive integer: " + "\n");
					posint1 = scanIn.nextInt();
				}while (posint1 <= 0);
				downDigits(posint1);
			}
			else if (option == 7)
			{
				System.out.print("Please enter a valid decimal point number: " + "\n");
				posdoub1 = scanIn.nextDouble();
				System.out.print("There is/are " + countDigits(posdoub1) + " digit(s) to the left of " + posdoub1 + ".");
			}
			
			do
			{
				System.out.print("\n" + "Would you like to choose another option?" + "\n" + "1. Yes" + "\n" + "2. No" + "\n");
				repeat = scanIn.nextInt();
			}while (repeat != 1 && repeat != 2);
		}while (repeat == 1);
		
		scanIn.close();
	}
	
	public static void factors(int num)
	{
		System.out.print("The factors of " + num + " are:");
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0 && i != num)
				System.out.print(" " + i + ",");
			else if (i == num)
				System.out.print(" " + i + ".");
		}
	}
	
	public static int gcd(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return gcd(b, a%b);
	}
	
	public static boolean prime(int num)
	{
		boolean prime = true;
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				prime = false;
			}
		}
		return prime;
	}
	
	public static double power(double base, int exponent)
	{
		double power = 1;
		if (exponent > 0)
		{
			for (int i = 0; i < exponent; i++)
				power = power * base;
		}
		else if (exponent < 0)
		{
			for (int i = 0; i > exponent; i--)
			{
				power = power / base;
			}
		}
		else if (exponent == 0)
			power = 1;
		return power;
	}
	
	public static int findDigit(int num, int n)
	{
		if (num < 0)
			num = -num;
		else if (n > countDigits((double) num) || num == 0)
			return 0;
		for (int i = 1; i < n; i++)
			{
				num = num / 10;
			}
		return num % 10;
	}
	
	public static void downDigits(int num)
	{
		int numberOfDigits = countDigits((double) num);
		for (int i = 0; i < numberOfDigits; i++)
		{
			System.out.print(findDigit(num, numberOfDigits - i) + "\n");
		}
	}
	
	public static int countDigits(double num)
	{
		int digits = 1;
		if (num < 0)
			num = -num;
		while (num >= 10)
		{
			num = num/10;
			digits = digits + 1;
		}
		return digits;
	}
}
