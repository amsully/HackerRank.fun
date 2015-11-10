package strings;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials;i++)
		{
			
			String anagram = scan.next();
			
			if(anagram.length()%2== 1) System.out.println(-1);
			else
			{

				int replaceCount = 0;
				
				char[] S1 = anagram.substring(0, (anagram.length()/2)).toCharArray();
				char[] S2 = anagram.substring((anagram.length()/2)).toCharArray();

				int[] hash1 = new int[26];
				int[] hash2 = new int[26];
				
				for(int j = 0; j < S1.length; j++)
				{
					
					hash1[S1[j]-'a']++;
					hash2[S2[j]-'a']++;					
				}
				
				for(int j = 0; j < 26; j++)
				{
					
					replaceCount += ((hash1[j]>hash2[j])? hash1[j]-hash2[j] : 0);
					
				}
				System.out.println(replaceCount);
			}
			
			
		}
	}
}
