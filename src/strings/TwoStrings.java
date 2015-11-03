package strings;

import java.util.HashSet;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			System.out.println( containsSubstring(scan.next(), scan.next()));
		}
		
	}

	private static String containsSubstring(String next, String next2) {
		// TODO Auto-generated method stub
		
		HashSet<Character> hashNext = new HashSet<Character>();
		HashSet<Character> hashNext2 = new HashSet<Character>();
		
		for(int i = 0; i < next.length(); i++)
			hashNext.add(next.charAt(i));
		for(int i = 0; i < next2.length(); i++)
			hashNext2.add(next2.charAt(i));		

		for(Character c : hashNext)
		{
			if(hashNext2.contains(c)) return "YES";
		}
		return "NO";
	}
	
}
