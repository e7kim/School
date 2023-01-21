/* Name: Eugene Kim
 * Final Exam Project: Cryptography
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 5/26/17
 */

public class Decryption extends Grid{
	private String ciphertext;
	private int columns;
	
	public Decryption(String keyword, String ciphertext)
	{
		super(keyword, ciphertext);
		this.ciphertext = ciphertext;
		columns = configureGrid(getText());
		Decrypt();
	}

	public void Decrypt()
	{
		char[][] grid = getGrid();
		int index = 0;
		for (int i = 1; i <= columns; i++)
		{
			for (int k = 2; k < grid.length; k++)
			{
				for (int j = 0; j < grid[0].length; j++)
				{
					if (grid[1][j] == '0' + i)
					{
						grid[k][j] = ciphertext.charAt(index);
						index++;
					}
				}
			}
		}
	}
	public String getPlaintext()
	{
		char[][] grid = getGrid();
		String s = "";
		for (int i = 2; i < grid.length; i++)
		{
			for (int j = 0; j < grid[0].length; j++)
			{
				s += grid[i][j];
			}
		}
		return s;
	}
}
