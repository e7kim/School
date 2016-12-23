/* Name: Eugene Kim
 * Lab 10: Cipher
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 12/19/16
 */

import java.util.*;
import java.io.*;

public class Cipher 
{
	public static void main(String[] args) 
	{
		Record[] frequencies = new Record[26];
		for (int i = 0; i < 26; i++)
			frequencies[i] = new Record((char)('A' + i));
		File file = new File("cipher.txt");
		Scanner cipher = null;
		try
		{
			cipher = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("*** Cannot open cipher.txt ***");
			System.exit(1);  // quit the program
		}
		while (cipher.hasNext())
		{
			String word = cipher.next().replaceAll("[^A-Za-z]+", "");
			for(int i = 0; i < word.length(); i++)
			{
				char c = word.charAt(i);
				int frequency = frequencies[(int)c-65].getFrequency();
				frequencies[(int)c-65].setFrequency(frequency+1);
			}
		}
		System.out.println("Letters with frequencies: ");
		for(int i = 0; i < 26; i++)
			System.out.println(frequencies[i].getLetter() + " -> " + frequencies[i].getFrequency());
		Arrays.sort(frequencies, Collections.reverseOrder());
		System.out.println("\nSorted by frequency (descending): ");
		for(int i = 0; i < 26; i++)
			System.out.println(frequencies[i].getLetter() + " -> " + frequencies[i].getFrequency());
		
		file = new File("replace.txt");
		Scanner replace = null;
		try
		{
			replace = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("*** Cannot open replace.txt ***");
			System.exit(1);  // quit the program
		}
		for(int i = 0; i < 26; i++)
		{
			char c = replace.next().charAt(0);
			frequencies[i].setSubstitution(c);
		}
		
		file = new File("cipher.txt");
		cipher = null;
		try
		{
			cipher = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("*** Cannot open cipher.txt ***");
			System.exit(1);  // quit the program
		}
		while (cipher.hasNext())
		{
			String line = cipher.nextLine();
			for(int i = 0; i < line.length(); i++)
			{
				if(!Character.isLetter(line.charAt(i)))
					System.out.print(line.charAt(i));
				else
				{
					for(int j = 0; j < 26; j++)
						if(line.charAt(i) == frequencies[j].getLetter())
						{
							System.out.print(frequencies[j].getSubstitution());
							break;
						}
				}
			}
			System.out.println();
		}
		int option;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.print("Would you like to switch letters? (1. yes, 2. no) ");
			option = in.nextInt();
			if(option == 1)
			{
				System.out.print("Please enter two letters: ");
				char c1 = Character.toUpperCase(in.next().charAt(0));
				char c2 = Character.toUpperCase(in.next().charAt(0));
				for(int i = 0; i < 26; i++)
				{
					if(frequencies[i].getSubstitution() == c1)
						frequencies[i].setSubstitution(c2);
					else if(frequencies[i].getSubstitution() == c2)
						frequencies[i].setSubstitution(c1);
				}
				file = new File("cipher.txt");
				cipher = null;
				try
				{
					cipher = new Scanner(file);
				}
				catch (FileNotFoundException ex)
				{
					System.out.println("*** Cannot open cipher.txt ***");
					System.exit(1);  // quit the program
				}
				while (cipher.hasNext())
				{
					String line = cipher.nextLine();
					for(int i = 0; i < line.length(); i++)
					{
						if(!Character.isLetter(line.charAt(i)))
							System.out.print(line.charAt(i));
						else
						{
							for(int j = 0; j < 26; j++)
								if(line.charAt(i) == frequencies[j].getLetter())
								{
									System.out.print(frequencies[j].getSubstitution());
									break;
								}
						}
					}
					System.out.println();
				}
			}
		}while(option != 2);
		
		file = new File("output.txt");
		PrintWriter output = null;
		try
		{
			output = new PrintWriter(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Cannot create output.txt");
			System.exit(1); // quit the program
		}
		file = new File("cipher.txt");
		cipher = null;
		try
		{
			cipher = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("*** Cannot open cipher.txt ***");
			System.exit(1);  // quit the program
		}
		while (cipher.hasNext())
		{
			String line = cipher.nextLine();
			for(int i = 0; i < line.length(); i++)
			{
				if(!Character.isLetter(line.charAt(i)))
					output.print(line.charAt(i));
				else
				{
					for(int j = 0; j < 26; j++)
						if(line.charAt(i) == frequencies[j].getLetter())
						{
							output.print(frequencies[j].getSubstitution());
							break;
						}
				}
			}
			output.println();
		}
		in.close();
		output.close();
	}
}
