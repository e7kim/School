/* Name: Eugene Kim
 * Lab 8: Binary Search
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 11/29/16
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Lab8_EK {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		
		int arraySize = rand.nextInt(31) + 20;
		
		int array[] = new int[arraySize];
		
		for(int i = 0; i < arraySize; i++)
		{
			int num = rand.nextInt(100);
			array[i] = num;
		}
		
		System.out.println("Original array of " + arraySize + " elements:");
		
		displayArray(array, arraySize);
		
		Arrays.sort(array);
		System.out.println("\n");
		
		System.out.println("Sorted array of " + arraySize + " elements:");
		displayArray(array, arraySize);
		
		System.out.println("\n\nPart 2:\n");
		int entry, option;
		do 
		{
			System.out.print("What entry? ");
			entry = in.nextInt();
			if (Arrays.binarySearch(array, entry) < 0)
				System.out.println("     status: not found.");
			else
				System.out.println("     status : found at index " + Arrays.binarySearch(array, entry) + ".");
			do
			{
				System.out.println("Continue in Part 2? (1. Yes 2. No)");
				option = in.nextInt();
			}while (option != 1 && option != 2);
		}while (option != 2);
		
		System.out.println("\nPart 3\n");
		
		int probes;
		do
		{
			System.out.print("What entry? ");
			entry = in.nextInt();
			probes = binarySearch(array, entry);
			System.out.println(" after " + probes + " probes.");
			do
			{
				System.out.println("Continue in Part 3? (1. Yes 2. No)");
				option = in.nextInt();
			}while (option != 1 && option != 2);
		}while (option != 2);
		
		
		in.close();
		
	}
	public static void displayArray(int[] array, int arraySize)
	{
		for(int i = 0; i < arraySize; i++)
		{
			if (i != 0 && i%10 == 0)
				System.out.println();
			System.out.printf("%3d", array[i]);
		}
	}
	public static int binarySearch(int[] array, int entry)
	{
		int L = 0, R = array.length-1;
		int probes = 0;
		while(L <= R)
		{
			int M = L + (R-L)/2;
			if (array[M] == entry)
			{
				System.out.print("     status: found at index " + M + " ");
				return probes;
			}
			else if (array[M] < entry)
			{
				L = M + 1;
				probes++;
			}
			else if (array[M] > entry)
			{
				R = M - 1;
				probes++;
			}
		}
		System.out.print("     status: not found ");
		return probes;
	}
}
