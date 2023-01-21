/* Name: Eugene Kim
 * Final Exam Project: Cryptography
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 5/26/17
 */

import java.io.*;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int option, option2, option3;
		String keyword = null;
		String filename;
		String plaintext;
		String ciphertext;
		do
		{
			do
			{
				System.out.println("1. Encryption\n2. Decryption\n3. Exit the program.");
				option = in.nextInt();
			}while(option != 1 && option != 2 && option != 3);
			if (option == 1)
			{
				do
				{
					System.out.println("1. Create a keyword and save to text file\n2. Load a keyword from a prompted filename\n3. Enter text to encrypt and save to a file\n4. Load a file with text to encrypt and save");
					option2 = in.nextInt();
				}while(option2 != 1 && option2 != 2 && option2 != 3 && option2 != 4);
				if (option2 == 1)
				{
					System.out.print("Enter keyword: ");
					keyword = in.next();
					System.out.print("Enter file name: ");
					in.nextLine();
					filename = in.nextLine();
					writeFile(filename, keyword);
				}
				else if (option2 == 2)
				{
					System.out.print("Enter file name: ");
					in.nextLine();
					filename = in.nextLine();
					keyword = readFile(filename);
				}
				else if (option2 == 3)
				{
					System.out.print("Enter plaintext: ");
					in.nextLine();
					plaintext = in.nextLine();
					System.out.print("Enter file name: ");
					filename = in.nextLine();
					writeFile(filename, plaintext);
					do
					{
						System.out.println("Create and display the grid, encrypt the text, and save the result to file? (1. yes, 2. no)");
						option3 = in.nextInt();
					}while(option3 != 1 && option3 != 2);
					if (option3 == 1)
					{
						Encryption e = new Encryption(keyword, plaintext);
						System.out.println(e.toString());
						ciphertext = e.getCiphertext();
						System.out.println("Ciphertext: " + ciphertext);
						System.out.print("Enter file name: ");
						in.nextLine();
						filename = in.nextLine();
						writeFile(filename, ciphertext);
					}
				}
				else if (option2 == 4)
				{
					System.out.print("Enter file name: ");
					in.nextLine();
					filename = in.nextLine();
					plaintext = readFile(filename);
					do
					{
						System.out.println("Create and display the grid, encrypt the text, and save the result to file? (1. yes, 2. no)");
						option3 = in.nextInt();
					}while(option3 != 1 && option3 != 2);
					if (option3 == 1)
					{
						Encryption e = new Encryption(keyword, plaintext);
						System.out.println(e.toString());
						ciphertext = e.getCiphertext();
						System.out.println("Ciphertext: " + ciphertext);
						System.out.print("Enter file name: ");
						in.nextLine();
						filename = in.nextLine();
						writeFile(filename, ciphertext);
					}
				}
			}
			else if (option == 2)
			{
				do
				{
					System.out.println("1. Create a keyword and save to text file\n2. Load a keyword from a prompted file\n3. Enter text to decrypt and save to a file\n4. Load a file with text to decrypt and save");
					option2 = in.nextInt();
				}while(option2 != 1 && option2 != 2 && option2 != 3 && option2 != 4);
				if (option2 == 1)
				{
					System.out.print("Enter keyword: ");
					keyword = in.next();
					System.out.print("Enter file name: ");
					in.nextLine();
					filename = in.nextLine();
					writeFile(filename, keyword);
				}
				else if (option2 == 2)
				{
					System.out.print("Enter file name: ");
					in.nextLine();
					filename = in.nextLine();
					keyword = readFile(filename);
				}
				else if (option2 == 3)
				{
					System.out.print("Enter ciphertext: ");
					in.nextLine();
					ciphertext = in.nextLine();
					System.out.print("Enter file name: ");
					filename = in.nextLine();
					writeFile(filename, ciphertext);
					do
					{
						System.out.println("Create and display the grid, decrypt the text, and save the result to file? (1. yes, 2. no)");
						option3 = in.nextInt();
					}while(option3 != 1 && option3 != 2);
					if (option3 == 1)
					{
						Decryption d = new Decryption(keyword, ciphertext);
						System.out.println(d.toString());
						plaintext = d.getPlaintext();
						System.out.println("Plaintext: " + plaintext);
						System.out.print("Enter file name: ");
						in.nextLine();
						filename = in.nextLine();
						writeFile(filename, ciphertext);
					}
				}
				else if (option2 == 4)
				{
					System.out.print("Enter file name: ");
					in.nextLine();
					filename = in.nextLine();
					ciphertext = readFile(filename);
					do
					{
						System.out.println("Create and display the grid, decrypt the text, and save the result to file? (1. yes, 2. no)");
						option3 = in.nextInt();
					}while(option3 != 1 && option3 != 2);
					if (option3 == 1)
					{
						Decryption d = new Decryption(keyword, ciphertext);
						System.out.println(d.toString());
						plaintext = d.getPlaintext();
						System.out.println("Plaintext: " + plaintext);
						System.out.print("Enter file name: ");
						in.nextLine();
						filename = in.nextLine();
						writeFile(filename, ciphertext);
					}
				}
			}
		}while(option != 3);
		in.close();
	}
	static void writeFile(String name, String text)
	{
		File file = new File(name);
		PrintWriter out = null;
		try
		{
			out = new PrintWriter(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Cannot create " + name);
			System.exit(1);
		}
		out.println(text);
		out.close();
	}
	static String readFile(String name)
	{
		File file = new File(name);
		Scanner in = null;
		try
		{
			in = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("*** Cannot open " + name + " ***");
			System.exit(1);
		}
		String s = "";
		while (in.hasNextLine())
		{
			s += in.nextLine();
		}
		in.close();
		return s;
	}

}
