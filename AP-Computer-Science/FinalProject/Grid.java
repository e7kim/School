/* Name: Eugene Kim
 * Final Exam Project: Cryptography
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 5/26/17
 */

public class Grid {
	private String keyword;
	private String text;
	private char[][] grid;
	
	public Grid(String keyword, String text)
	{
		this.keyword = keyword;
		this.text = text;
	}
	
	public String getText()
	{
		return text;
	}
	
	public char[][] getGrid()
	{
		return grid;
	}
	
	public int configureGrid(String text)
	{
		int rows = text.length()/keyword.length()+2;
		if (text.length()%keyword.length() != 0)
			rows++;
		grid = new char[rows][keyword.length()];
		for (int i = 0; i < keyword.length(); i++)
		{
			grid[0][i] = keyword.charAt(i);
		}
		int n = 0;
		while (keyword.length() > 0)
		{
			n++;
			char minchar = keyword.charAt(0);
			for (int i = 0; i < keyword.length(); i++)
			{
				if (keyword.charAt(i) < minchar)
				{
					minchar = keyword.charAt(i);
				}
			}
			for (int i = 0; i < grid[0].length; i++)
			{
				if (grid[0][i] == minchar)
				{
					grid[1][i] = (char) ('0' + n);
				}
			}
			keyword = keyword.replace(String.valueOf(minchar), "");
		}
		return n;
	}
	

	public String toString()
	{
		String s = "";
		for (char[] row : grid)
		{
			for (char c : row)
			{
				s += c + " ";
			}
			s += "\n";
		}
		return s;
	}
}
