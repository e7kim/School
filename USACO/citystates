import java.io.*;
import java.util.*;

public class citystate2 {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new File("citystate.in"));
		PrintWriter out = new PrintWriter(new File("citystate.out"));
		int n = in.nextInt();
		String[] cityStates = new String[n];
		String[] stateCities = new String[n];
		for (int i = 0; i < n; i++)
		{
			String city = in.next().substring(0, 2);
			String state = in.next();
			cityStates[i] = city + state;
			stateCities[i] = state + city;
		}
		Arrays.sort(cityStates);
		Arrays.sort(stateCities);
		
//		for (int i = 0; i < n; i++)
//			System.out.println(i + " " + cityStates[i] + " " + stateCities[i]);
		
		int count = 0;
		
		for (int i = 0; i < n; i++)
		{
			int search = Arrays.binarySearch(cityStates, stateCities[i]);
			int back = search;
			int forward = search;
			if (search >= 0)
			{
//				System.out.println(search);
				if (!cityStates[search].substring(2).equals(stateCities[i].substring(0, 2)))
					count++;
//				System.out.println(cityStates[search] + " " + stateCities[i]);
				while (back - 1 != -1 && cityStates[back - 1].equals(stateCities[i]))
				{
					back -= 1;
					if (!cityStates[back].substring(2).equals(stateCities[i].substring(0, 2)))
						count++;
//					System.out.println(cityStates[back] + " " + stateCities[i]);
				}
				while (forward + 1 != n && cityStates[forward + 1].equals(stateCities[i]))
				{
					forward += 1;
					if (!cityStates[forward].substring(2).equals(stateCities[i].substring(0, 2)))
						count++;
//					System.out.println(cityStates[forward] + " " + stateCities[i]);
				}
			}
		}
		out.println(count/2);
		out.close();

	}

}
