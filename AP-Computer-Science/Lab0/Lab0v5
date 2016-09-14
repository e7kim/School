/* Name: Eugene Kim
 * Lab 0: Bridgewalk
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 9/10/16
 */

import java.util.Scanner;
import java.util.Random;

public class Lab0_EK 
{

	public static void main(String[] args) 
	{
		Scanner scanIn = new Scanner(System.in);

		int bridgeLength;
		do
		{
			System.out.print("Enter a bridge length (positive odd integer only please): ");
			bridgeLength = scanIn.nextInt(); 
		}while(bridgeLength % 2 == 0 || bridgeLength <= 0);
		
		int numberOfTrials;
		do
		{
			System.out.print("Choose the number of trials (positive integer only please): ");
			numberOfTrials = scanIn.nextInt();
		}while(numberOfTrials <= 0);
		
		int option;
		int repeat;
		do
		{
			do
			{
				System.out.print("Please choose an option: " + "\n" + "1. graphic bridge for each step" + "\n" + "2. average number of steps" + "\n" + "3. total number of steps for x trials" + "\n" + "4. largest and smallest number of steps required to fall off" + "\n");
				option = scanIn.nextInt(); 	
			}while (option != 1 && option != 2 && option != 3 && option != 4);
			if(option == 1)
				graphBridge((bridgeLength + 1)/2, bridgeLength);
			else if(option == 2)
				System.out.println(totalNumberOfSteps(bridgeLength, (bridgeLength + 1)/2, numberOfTrials) / numberOfTrials + " Steps");
			else if(option == 3)
				System.out.println(totalNumberOfSteps(bridgeLength, (bridgeLength + 1)/2, numberOfTrials) + " Steps");
			else if(option == 4)
				findMaxAndMin(bridgeLength, (bridgeLength + 1)/2, numberOfTrials);
			do
			{
			System.out.print("Would you like to choose another option?" + "\n" + "1. Yes" + "\n" + "2. No" + "\n");
			repeat = scanIn.nextInt();
			}while (repeat != 1 && repeat != 2);
		}while (repeat == 1);
		scanIn.close();
	}
	public static void graphBridge(int pos, int length)
	{
		int counter = 0;
		do
		{
			System.out.print("Step " + counter + ":     ");
			counter++;
			System.out.print('|');
			for(int i = 0; i < length; i++)
			{
				if (i != pos - 1)
					System.out.print('-');
				else if (i == pos - 1)
					System.out.print('*');
			}
			System.out.print("|" + "\n");
			Random rand = new Random();
			int rng = rand.nextInt(2);
			if (rng == 0)
				pos++;
			else if (rng == 1)
				pos--;
		}while(pos >= 1 && pos <= length);
	}

	public static double totalNumberOfSteps(int length, int pos, int trials)
	{
		int[] trialTest = new int[trials];
		for(int i = 0; i < trials; i++)
			trialTest[i] = countSteps(length, pos);
		
		double totalSteps = 0;
		for(int i = 0; i < trials; i++)
			totalSteps += trialTest[i];
		return totalSteps;
	}

	public static void findMaxAndMin(int length, int pos, int trials)
	{
		int[] numberOfSteps = new int[trials];
		for(int i = 0; i < trials; i++)
			numberOfSteps[i] = countSteps(length, pos);
		int maximum = numberOfSteps[0];
		int minimum = numberOfSteps[0];
		for(int i = 0; i < trials; i++)
		{
			if(numberOfSteps[i] > maximum)
				maximum = numberOfSteps[i];
		}
		System.out.println("The maximum number of steps required to fall off is " + maximum + ".");
		for(int j = 0; j < trials; j++)
		{
			if(numberOfSteps[j] < minimum)
				minimum = numberOfSteps[j];
		}
		System.out.println("The minimum number of steps required to fall off is " + minimum + ".");
	}
	
	public static int countSteps(int length, int pos)
	{
		int steps = 0;
		do
		{
			Random rand = new Random();
			int n = rand.nextInt(2);
			if (n == 0)
				pos++;
			else if (n == 1)
				pos--;
			steps++;
		}while(pos <= length && pos >= 1);
		return steps;
	}
	
}
