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
		Scanner input = new Scanner(System.in);

		int bridgeLength;
		do
		{
			System.out.print("Enter a bridge length (positive odd integer only please): ");
			bridgeLength = input.nextInt();
		}while(bridgeLength % 2 == 0);
		
		int numberOfTrials;
		do
		{
			System.out.print("Choose the number of trials (positive integer only please): ");
			numberOfTrials = input.nextInt();
		}while(numberOfTrials < 0);
		
		int option;
		int repeat;
		do
		{
			do
			{
				System.out.print("Please choose an option: " + "\n" + "1. graphic bridge for each step" + "\n" + "2. average number of steps" + "\n" + "3. total number of steps for x trials" + "\n" + "4. largest and smallest number of steps required to fall off" + "\n");
				option = input.nextInt(); 	
			}while(option != 1 && option != 2 && option != 3 && option != 4);
			if(option == 1)
			{
				graphBridge((bridgeLength + 1)/2, bridgeLength);
			}
			
			else if(option == 2)
			{
				System.out.println(averageNumberOfSteps(bridgeLength, (bridgeLength + 1)/2, 0, numberOfTrials));
			}
			
			else if(option == 3)
			{
				System.out.println(averageNumberOfSteps(bridgeLength, (bridgeLength + 1)/2, 0, numberOfTrials) * numberOfTrials);
			}
			
			else if(option == 4)
			{
				findMaxAndMin(bridgeLength, (bridgeLength + 1)/2, 0, numberOfTrials);
			}
			
			System.out.print("Would you like to choose another option?" + "\n" + "1. Yes" + "\n" + "2. No" + "\n");
			repeat = input.nextInt();
		}while(repeat == 1);
		input.close();
	}
	public static void graphBridge(int x, int y)
	{
		int counter = 0;
		do
		{
			System.out.print("Step " + counter + ":     ");
			counter++;
			System.out.print('|');
			for(int i = 1; i < y+1; i++)
			{
				if(i != x)
				{
					System.out.print('-');
				}
				else
				{
					System.out.print('*');
				}
			}
			System.out.print('|');
			System.out.print('\n');
			
			Random rand = new Random();
			int n = rand.nextInt(2);
			if(n == 0)
			{
				x--;
			}
			else
			{
				x++;
			}
		}while(x <= y && x >= 1);
	}

	public static double averageNumberOfSteps(int w, int x, int y, int z)
	{
		int[] numberOfTrials = new int[z];
		for(int i = 0; i < z; i++)
		{
			numberOfTrials[i] = countSteps(w, x, y);
		}
		
		double sum = 0;
		for(int i = 0; i < z; i++)
		{
			sum += numberOfTrials[i];
		}
		
		return sum / z;
	}
	
	public static int countSteps(int x, int y, int z)
	{
		do
		{
			Random rand = new Random();
			int n = rand.nextInt(2);
			if(n == 0)
			{
				y--;
			}
			else
			{
				y++;
			}
			
			z++;
			
		}while(y <= x && y >= 1);

		return z;
	}
	
	public static void findMaxAndMin(int w, int x, int y, int z)
	{
		int[] numberOfTrials = new int[z];
		for(int i = 0; i < z; i++)
		{
			numberOfTrials[i] = countSteps(w, x, y);
		}
		
		int maximum = numberOfTrials[0];
		int minimum = numberOfTrials[0];
		
		for(int i = 0; i < z; i++)
		{
			if(numberOfTrials[i] > maximum)
			{
				maximum = numberOfTrials[i];
			}
		
			if(numberOfTrials[i] < minimum)
			{
				minimum = numberOfTrials[i];
			}
		}
		System.out.println("The maximum number of steps required to fall off is " + maximum);
		System.out.println("The minimum number of steps required to fall off is " + minimum);
	}
	
}
