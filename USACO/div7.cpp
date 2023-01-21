import java.util.*;
import java.io.*;

public class div7 {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("div7.in"));
		PrintWriter out = new PrintWriter(new File("div7.out"));

		int N = in.nextInt();
		
		int[] ID = new int[N];
		
		for (int i = 0; i < N; i++)
		{
			ID[i] = in.nextInt();
		}
		
		in.close();
		
		int group = 0;
		int max = 0;
		
		for (int i = N - 1; i >= 0; i--)
		{
			if (max > i)
				break;
			group = prefixSum(ID, i);
			if (group > max)
				max = group;
		}
		
		
		System.out.print(max);
		
		out.println(max);
		
		out.close();
	}

	public static int prefixSum(int[] array, int end)
	{
		int sum = 0;
		int diff = 0;
		for (int i = end; i >= 0; i--)
		{
			sum += array[i];
			sum = sum % 7;
			if (sum == 0)
			{
				diff = end - i + 1;
			}
		}
		return diff;
	}
}
