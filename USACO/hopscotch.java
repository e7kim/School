import java.util.*;
import java.io.*;

public class hopscotch {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("hopscotch.in"));
		PrintWriter out = new PrintWriter(new File("hopscotch.out"));
		int R = in.nextInt();
		int C = in.nextInt();
		int K = in.nextInt();
		int[][] board = new int[R][C];
		int[][] paths = new int[R][C];
		for (int i = 0; i < R; i++)
		{
			for (int j = 0; j < C; j++)
			{
				board[i][j] = in.nextInt();
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		in.close();
		
		paths[0][0] = 1;
		
		for (int i = 0; i < R; i++)
		{
			for (int j = 0; j < C; j++)
			{
				for (int k = i+1; k < R; k++)
				{
					for (int l = j+1; l < C; l++)
					{
						if (board[k][l] != board[i][j])
						{
							paths[k][l] += paths[i][j];
							paths[k][l] %= 1000000007;
						}
					}
				}
			}
		}
		
		
		for (int i = 0; i < R; i++)
		{
			for (int j = 0; j < C; j++)
			{
				System.out.print(paths[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println(paths[R-1][C-1]);
		out.println(paths[R-1][C-1]);
		
		out.close();
	}

}
