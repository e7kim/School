import java.util.*;
import java.io.*;

public class cowfind {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("cowfind.in"));
		PrintWriter out = new PrintWriter(new File("cowfind.out"));
		String N = in.next();
		
		in.close();
		
		int hind = 0, front = 0;
		
		for (int i = 0; i < N.length() - 1; i++)
		{
			if (N.charAt(i) == '(' && N.charAt(i + 1) == '(')
				hind += 1;
			else if (N.charAt(i) == ')' && N.charAt(i + 1) == ')')
				front += hind;
		}
		
		System.out.print(front);
		
		out.println(front);
		
		out.close();
	}

}
