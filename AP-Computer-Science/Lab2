 /* Name: Eugene Kim
 * Lab 2: Middle Earth Base Math
 * AP Computer Science
 * E Block
 * Teacher: Mr. Harris
 * 10/3/16
 */

import java.util.Scanner;

public class Lab2_EK 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
       
        String race;
        int num1, num2;
        char operator;
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Input " + (i+1) + ":");
            race = in.next();
            num1 = in.nextInt();
            num2 = in.nextInt();
            operator = in.next(".").charAt(0);
            
            System.out.println("\n" + "Output " + (i+1) + ":");
            
            int base = 0; //Setting base to 0 to initialize and avoid error
            
			if (race.equals("human"))
				base = 10;
			else if (race.equals("elf"))
				base = 8;
			else if (race.equals("dwarf"))
				base = 5;
			else if (race.equals("wizard"))
				base = 2;
			else
				System.out.println("Invalid race!" + "\n");
            
            if (operator == '+')
                printAddition(num1, num2, base);
            else if (operator == '*')
                printMultiplication(num1, num2, base);
            else
                System.out.println("Invalid operator!" + "\n");
        }
        in.close();
    }
   
    public static void printAddition(int num1, int num2, int base)
    {
        System.out.println(num1);
        System.out.println("+ " + num2);
        
        int sum = addNumbers(num1, num2, base);

        for(int i = 0; i < countDigits((double) sum) + 1; i++)
            System.out.print("=");
        
        System.out.print("\n");
        System.out.println(sum);
        System.out.println("\n");            
    }
   
    public static void printMultiplication(int num1, int num2, int base)
    {
        System.out.println(num1);
        System.out.println("* " + num2);
        int[] partialResults = getPartialResults(num1, num2, base);
        int max = num1;
        if (num1 < num2)
            max = num2;
        for(int i = 0; i <= countDigitsInBase(max, 10) + 1; i++)
            System.out.print("-");
        System.out.print("\n");
        for(int i = 0; i < partialResults.length; i++)
            System.out.println(partialResults[i]);
        int sum = 0;
        for(int i = 0; i < partialResults.length; i++)
            sum = addNumbers(sum, power(10, i)*partialResults[i], base);
        if (countDigits((double) sum) <= 3)
        {
        	for (int i = 0; i < 3; i++)
        		System.out.print("=");
        }
        else
        {
	        for(int i = 0; i < countDigits((double) sum) - 1; i++)
	            System.out.print("=");
        }
        System.out.print("\n");
        System.out.println(sum);
        System.out.println("\n");
    }
    
    public static int[] getPartialResults(int num1, int num2, int base)
    {
        int[] partialResults = new int[countDigitsInBase(num2, 10)];
        for(int i = 0; i < countDigitsInBase(num2, 10); i++)
            partialResults[i] = convertToBase((convertToDecimal(findDigitInBase(num2, i+1, 10), base) * convertToDecimal(num1, base)), base);
        return partialResults;
    }
    
    public static int mostDigits(int[] array)
    {
        int max = countDigitsInBase(array[0], 10);
        for(int i = 1; i < array.length; i++)
        {
            if (countDigitsInBase(array[i], 10) > max)
                max = countDigitsInBase(array[i], 10);
        }
        return max;
    }
    public static int addNumbers(int num1, int num2, int base)
    {
        int sum = convertToDecimal(num1, base) + convertToDecimal(num2, base);
        return convertToBase(sum, base);
    }
    
    public static int convertToDecimal(int num, int base)
    {
        int sum = 0;
        for(int i = 1; i <= countDigitsInBase(num, 10); i++)
            sum += power(base, i-1)*findDigitInBase(num, i, 10);
        return sum;
    }
    
    public static int convertToBase(int num, int base)
    {
	    int sum = 0;
	    for(int i = 1; i <= countDigitsInBase(num, base); i++)
	        sum += power(10, i-1)*findDigitInBase(num, i, base);
	    return sum;
    }
    
    public static int findDigitInBase(int num, int n, int base)
    {
            return ((num / power(base, n-1)) % base);
    }
    
    public static int countDigitsInBase(int num, int base)
    {
        int counter = 0;
        do
        {
            num = num / base;
            counter++;
        }while (num >= 1);
        return counter;
    }
    
	public static int countDigits(double num)
	{
	    int digits = 1;
	    while (num > 10)
	    {
	        num = num / 10;
	        digits = digits + 1;
	    }
	    return digits;
	}
	
    public static int power(int base, int exp)
    {
        int power = base;
        if (exp > 0)
        {
            for(int i = 1; i < exp; i++)
                power = power * base;
        }
        else if (exp == 0)
        {
            if (base != 0)
                power = 1;
        }
        else if (exp < 0)
        {
            for(int i = 1; i < exp; i++)
                power = power * base;
            power = 1 / power;
        }
        return power;
    }
    
}
