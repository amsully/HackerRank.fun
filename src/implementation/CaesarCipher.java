package implementation;

import java.util.*;

public class CaesarCipher {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int stringLength = scan.nextInt();
		String str = scan.next();
		int cipher = scan.nextInt()%26;
		
		StringBuilder bldr = new StringBuilder();
		
		for(int i = 0; i < stringLength; i++)
		{
			
			int ascii = (int)str.charAt(i);
			
			if( ascii >='a' && ascii <= 'z' )
			{
				ascii += cipher;
				
				if(ascii > 'z')
					ascii = 64 + (ascii-90);
			}
			
			if( ascii >='A' && ascii <= 'Z')
			{
				ascii += cipher;
				
				if(ascii > 'Z')
					ascii = 96 + (ascii-122);
			}
			
			bldr.append((char)ascii);
			
		}
		
		System.out.println(bldr.toString());
		
		
		
	}
	
}
