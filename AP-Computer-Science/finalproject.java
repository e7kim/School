import java.io.*;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int option;
		String keyword;
		String filename;
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
					option = in.nextInt();
				}while(option != 1 && option != 2 && option != 3 && option != 4);
				if (option == 1)
				{
					System.out.print("Enter keyword: ");
					keyword = in.next();
					System.out.print("Enter file name: ");
					filename = in.nextLine();
					newFile(filename, keyword);
				}
				if (option == 3 || option == 4)
				{
					do
					{
						System.out.println("Create and display the grid, encrypt the text, and save the result to file? (1. yes, 2. no)");
						option = in.nextInt();
					}while(option != 1 && option != 2);
				}
			}
			else if (option == 2)
			{
				do
				{
					System.out.println("1. Create a keyword and save to text file\n2. Load a keyword from a prompted file\n3. Enter text to decrypt and save to a file\n4. Load a file with text to decrypt and save");
					option = in.nextInt();
				}while(option != 1 && option != 2 && option != 3 && option != 4);
				if (option == 3 || option == 4)
				{
					do
					{
						System.out.println("Create and display the grid, decrypt the text, and save the result to file? (1. yes, 2. no)");
						option = in.nextInt();
					}while(option != 1 && option != 2);
				}
			}
		}while(option != 3);
		in.close();

	}
	static void newFile(String name, String text)
	{
		
	}

}
