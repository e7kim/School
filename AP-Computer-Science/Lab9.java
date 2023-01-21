/* Name: Eugene Kim
 * Lab 9: Cabbages
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 12/9/16
 */

import java.util.*;
import java.io.*;

public class Lab9_EK {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Scanner text = readIn("Cabbages.txt");
		int wordCount = wordEcho(text);
		Scanner text2 = readIn("Cabbages.txt");
		sortWords(text2, wordCount);
		char choice;
		do
		{
			System.out.println("Which phrase would you like to grep?");
			String phrase = in.next();
			grep(phrase);
			do
			{
				System.out.println("Continue? (Y/N)");
				choice = in.next().charAt(0);
			}while (choice != 'Y' && choice != 'N');
		}while (choice != 'N');
		in.close();
	}
	public static int wordEcho(Scanner text)
	{
		System.out.println("Words found in text --");
		int wordCount = 0;
		String maxWord = "";
		while(text.hasNext())
		{
			wordCount++;
			String word = text.next();
			System.out.println("    " + wordCount + " " + word);
			if (word.length() > maxWord.length())
				maxWord = word;
		}
		System.out.println("    The longest word in the text is <" + maxWord + ">.\n");
		return wordCount;
	}
	public static void sortWords(Scanner text, int wordCount)
	{
		System.out.println("Words sorted alphabetically with duplicates removed --");
		String[] words = new String[wordCount];
		for (int i = 0; i < wordCount; i++)
		{
			String word = text.next();
			words[i] = noPunc(word.toLowerCase());
		}
		Set<String> wordSet = new HashSet<String>(Arrays.asList(words));
		String[] sortedWords = wordSet.toArray(new String[wordSet.size()]);
		Arrays.sort(sortedWords);
		for (int i = 0; i < sortedWords.length; i++)
		{
			System.out.println("    " + i + " " + sortedWords[i]);
		}
	}
	public static void grep(String phrase)
	{
		Scanner text = readIn("Cabbages.txt");
		int count = 0;
		while (text.hasNextLine())
		{
			text.nextLine();
			count++;
		}
		text = readIn("Cabbages.txt");
		String line;
		boolean found = false;
		boolean anyFound = false;
		for (int i = 0; i < count; i++)
		{
			line = text.nextLine();
			found = findAllInstances(line, phrase, i + 1);
			//System.out.println("Line " + (i + 1) + ": " + line.substring(0, index) + "<" + phrase + ">" + line.substring(index + phrase.length(), line.length()));
			if (found == true)
				anyFound = true;
		}
		if (anyFound == false)
			System.out.println("The phrase does not appear in any line.");
	}
	public static boolean findAllInstances(String line, String phrase, int lineNumber)
	{
		int searchFrom = 0;
		int foundIndex;
		boolean found = false;
		if (line.indexOf(phrase) != -1)
		{
			found = true;
			System.out.print("Line " + lineNumber + ": ");
			while(line.indexOf(phrase, searchFrom) != -1)
			{
				foundIndex = (line.indexOf(phrase, searchFrom));
				System.out.print(line.substring(searchFrom, foundIndex) + "<" + phrase + ">");
				searchFrom = line.indexOf(phrase, searchFrom) + phrase.length();
			}
			System.out.println(line.substring(searchFrom, line.length()));
		}
		return found;
	}
	public static Scanner readIn(String pathname)
	{
		File file = new File(pathname);
		Scanner input = null;
		try
		{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("*** Cannot open " + pathname + " ***");
			System.exit(1); // quit the program
		}
		return input;
	}
	public static String noPunc(String word)
	{
		String newWord = "";
		for (Character ch : word.toCharArray())
		{
			if (Character.isLetterOrDigit(ch))
				newWord += ch;
		}
		return newWord;
	}
}
