package implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		double sqrt = Math.sqrt(str.length());
		int rows = (int)Math.floor(sqrt);
		int cols = (int)Math.ceil(sqrt);

		if( rows * cols < str.length())
		{
			if(rows< cols)
				rows++;
			else
				cols++;
		}
		
		char[][] encryption = new char[rows][cols];
		
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				if(!str.isEmpty())
				{
					encryption[i][j] = str.charAt(0);
					str = str.substring(1);
				}
			}
		}
		
//		for(char[] i : encryption)
//			System.out.println(i);
		
		for(int i = 0; i < cols; i++)
		{
			for(int j = 0; j < rows; j++)
			{
				if(encryption[j][i] != '\u0000')		
					System.out.print(encryption[j][i]);
				
			}
			System.out.print(" ");
		}
		
		
		
	}
	
}
