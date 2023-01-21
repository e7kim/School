import java.util.Scanner;

public class speeding {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		
		int N = scanIn.nextInt();
		int M = scanIn.nextInt();
		
		int[][] roadSegments = new int[N][2];
		int[][] bessieSegments = new int[M][2];
		
		for (int i = 0; i < N; i++)
		{
			roadSegments[i][0] = scanIn.nextInt();
			roadSegments[i][1] = scanIn.nextInt();
			
			if (i > 0)
			{
				roadSegments[i][0] = roadSegments[i-1][0] + roadSegments[i][0];
			}
			//System.out.print(roadSegments[i][0] + "     " + roadSegments[i][1]);
		}
		for (int i = 0; i < M; i++)
		{
			bessieSegments[i][0] = scanIn.nextInt();
			bessieSegments[i][1] = scanIn.nextInt();
			
			if (i > 0)
			{
				bessieSegments[i][0] = bessieSegments[i-1][0] + bessieSegments[i][0];
			}
			//System.out.print(bessieSegments[i][0] + "     " + bessieSegments[i][1]);
		}
		
		for ()
		
		
		scanIn.close();

	}

}
