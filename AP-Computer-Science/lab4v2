/* Name: Eugene Kim
 * Lab 4: Black Box
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 10/20/16
 */

import java.util.Scanner;
import java.util.Random;

public class Lab4_EK {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    
		char[][] board = new char[10][10];
		
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				board[i][j] = '.';
			}
		}
		
		set(board);
		
		
		for (int i = 9; i > -1; i--)
		{
			for (int j = 0; j < 10; j++)
			{
				System.out.print(" " + board[j][i]);;
			}
			System.out.println();
		}
		
		
		
		int choice=1;
		int x=0, y=0;
		int direction=1, shots=0;
		int guessright=0, guesswrong=0;
		do
		{
			print(board);
			System.out.println("Choose:\n   (1) Shoot a Laser\n   (2) Guess at a mirror location\n   (0) Quit the game\n\nEnter choice: ");
			choice=in.nextInt();
			if(choice==1)
			{
				do
				{
				System.out.print("Where does the laser begin? ");
				x=in.nextInt();
				if(x<10)
				{
					y=0;
					direction=1;
				}
				else if(x<20)
				{
					y=x-10;
					x=0;
					direction=2;
				}
				else if(x<30)
				{
					x=x-20;
					y=9;
					direction=3;
				}
				else if(x<40)
				{
					y=39-x;
					x=9;
					direction=4;
				}
				}while(x<0||x>39);
				System.out.println("The shot comes out at " + shoot(board,x,y,direction) + ".");
				shots++;
				System.out.println("You have taken " + shots + " shot(s) with " + guessright + " correct guess(es) and " + guesswrong + " incorrect guess(es).");
			}
			else if(choice==2)
			{
				do
				{
				System.out.println("What are the coordinates of the point? (x, y)");
				
				x=in.nextInt();
				if(x>10)
					x=x-20;
				
				y=in.nextInt();
				if(y>20)
					y=39-y;
				else
					y=y-10;
				}while(x<0||x>9||y<0||y>9);
				
				if(board[x][y]=='.')
					guesswrong++;
				else if(board[x][y]=='/'||board[x][y]=='\\')
					guessright++;
				check(board,x,y);
				System.out.println("You have taken " + shots + " shot(s) with " + guessright + " correct guess(es) and " + guesswrong + " incorrect guess(es).");
			}
			
		}while((choice!=0)&&(completed(board)==false));
		
		print(board);

		if(completed(board)==true)
			System.out.println("You completed the board with " + shots + " shot(s) and made " + guessright + " correct guess(es) and " + guesswrong + " incorrect guess(es).");
		else if(choice == 0)
			System.out.println("You quit the game with " + shots + " shot(s) and " + guessright + " correct guess(es) and " + guesswrong + " incorrect guess(es).");
		
		in.close();
		
	}
	
	public static void set(char[][] board)
	{
	    Random rand = new Random();
		int x, y;
		for(int i=0;i<10;i++)
		{
			x=rand.nextInt(10);
			y=rand.nextInt(10);
			if(board[x][y]== '.')
			{
				if(rand.nextInt(2)==1)
					board[x][y]= '/';
				else
					board[x][y]= '\\';
			}
			else
				i--;
		}
	}
	public static void print(char[][] board)
	{
		System.out.println("   20212223242526272829");
		for(int y=9;y>-1;y--)
		{
			System.out.print(y+10);
			for(int x=0;x<10;x++)
			{
				if(board[x][y] == '1')
					System.out.print(" /");
				else if(board[x][y] == '2')
					System.out.print(" \\");
				else
					System.out.print(" .");
			}
			System.out.println(" " + (39-y));
		}
		System.out.println("   0 1 2 3 4 5 6 7 8 9");
	}
	public static int shoot(char[][] board, int x, int y, int direction)
	{
		if(y==-1 && direction==3)
			return x;
		else if(x==-1 && direction==4)
			return y+10;
		else if(y==10 && direction==1)
			return x+20;
		else if(x==10 && direction==2)
			return 39-y;
		
		if(board[x][y]=='/'||board[x][y]=='1')
		{
			if(direction==1)
				return shoot(board, x+1, y, 2);
			else if(direction==2)
				return shoot(board, x, y+1, 1);
			else if(direction==3)
				return shoot(board, x-1, y, 4);
			else if(direction==4)
				return shoot(board, x, y-1, 3);
		}
		else if(board[x][y]=='\\'||board[x][y]=='2')
		{
			if(direction==1)
				return shoot(board, x-1, y, 4);
			else if(direction==2)
				return shoot(board, x, y-1, 3);
			else if(direction==3)
				return shoot(board, x+1, y, 2);
			else if(direction==4)
				return shoot(board, x, y+1, 1);
		}
		else
		{
			if(direction==1)
				return shoot(board,x,y+1,1);
			else if(direction==2)
				return shoot(board,x+1,y,2);
			else if(direction==3)
				return shoot(board,x,y-1,3);
			else if(direction==4)
				return shoot(board,x-1,y,4);
		}
		return 0;
	}
	public static void check(char[][] board, int x, int y)
	{
		if(board[x][y]=='/')
		{
			board[x][y]= '1';
			System.out.println("There is a mirror.");
		}
		else if(board[x][y]=='\\')
		{
			board[x][y]= '2';
			System.out.println("There is a mirror.");
		}
		else if(board[x][y] == '1' || board[x][y] == '2')
			System.out.println("This mirror was already found.");
		else
			System.out.println("There is no mirror.");
	}
	public static boolean completed(char[][] board)
	{
		for(int x=0;x<10;x++)
		{
			for(int y=0;y<10;y++)
			{
				if(board[x][y]== '/'||board[x][y]== '\\')
				{
					return false;
				}
			}
		}
		return true;
	}
}
