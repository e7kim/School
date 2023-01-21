package arrayhomework;
import java.util.Scanner;


public class arrayhomework {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.nextInt();
		
		int length = array.length;
		
//		if (isIncreasing(array, length))
//			System.out.print("true");
//		else if (!isIncreasing(array, length))
//			System.out.print("false");
		
		System.out.print(finalValue(array));
		
		in.close();
	}
	public static double finalValue(int[] list)
	{
		int minimum = list[0];
		double total = 0;
		for (int i = 0; i < list.length; i++)
		{
			total += list[i];
			if (list[i] < minimum)
				minimum = list[i];
		}
		
		
//		
//		System.out.println(total - minimum);
//		System.out.println(list.length - 1);
		
		return (total - minimum)/(list.length - 1);
	}
	public static int Inversion(int[] list, int n)
	{
		int start = 0;
		int inversions = 0;
		while (start < n)
		{
			for (int i = start; i < n; i++)
			{
				if (list[i] < list[start])
					inversions += 1;
			}
			start += 1;
		}
		return inversions;
	}
	public static boolean isIncreasing(int[] list, int length)
	{
		if (length == 0 || length == 1)
			return true;
		boolean increasing = true;
		int i = 0;
		while (increasing != false && i < length - 1)
		{
			if (list[i] >= list[i+1])
				increasing = false;
			i += 1;
		}
		//System.out.println(i);
		return increasing;
	}
}
