package strings;

import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numberOfRocks = scan.nextInt();

		boolean[] rockIdentifier = new boolean[26];
		
		for(int i = 0; i < 26; i++)
			rockIdentifier[i] = true;
		
		for (int i = 0; i < numberOfRocks; i++) {
			String rock = scan.next();

			for (int j = 0; j < 26; j++) {
				
				int charIndex = 'a'+j;
				char charVal = (char)(charIndex);
				String strVal = String.valueOf(charVal);
				rockIdentifier[j] = (rockIdentifier[j] && rock.contains(strVal));
				
				
			}
		}
		
		int count = 0;
		for(int i = 0; i < 26; i++)
		{
			if(rockIdentifier[i] == true)
				count++;
		}
		System.out.println(count);
	}
}
