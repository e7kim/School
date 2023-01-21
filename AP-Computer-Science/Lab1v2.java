/* Name: Eugene Kim
 * Lab 1: Simple Algorithms
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 9/10/16
 */

import java.util.Scanner;

public class Lab1_EK
{

	public static void main(String[] args) 
	{
		Scanner scanIn = new Scanner(System.in);
		
		int option;
		int posint;
		
		do
		{
			System.out.print("Please enter an integer to choose a simple algorithm from below: " + "\n");
			System.out.print("1. Find all the factors of a positive integer." + "\n");
			System.out.print("2. Find the greatest common divisor of two positive integer parameters." + "\n");
			System.out.print("3. Determine if a given integer greater than one is prime." + "\n");
			System.out.print("4. Raise a given real number to a given integer power." + "\n");
			System.out.print("5. Return the nth digit (a positive integer) from the right of a given integer" + "\n");
			System.out.print("6. List the digits of a positive integer in one column." + "\n");
			System.out.print("7. Return the number of digits to the left of the decimal point of a valid decimal point number." + "\n");
			option = scanIn.nextInt();
		}while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option !=6 && option != 7);
		if (option == 1)
		{
			System.out.print("Please enter a positive integer: " + "\n");
			do
			{
			posint = scanIn.nextInt();
			}while (posint <= 0);
		}
		
		
		scanIn.close();
	}

}
