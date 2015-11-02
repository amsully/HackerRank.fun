package strings;
import java.util.Scanner;


public class Pangrams {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String test = scan.nextLine().toLowerCase().replace(" ", "");
		
		int[] alphabetBucket = new int[26];
		
		for(int i = 0; i < test.length(); i++)
		{
			alphabetBucket[test.charAt(i)-'a']++;
		}
		System.out.println(printPanagram(alphabetBucket));

		
	}

	private static String printPanagram(int[] alphabetBucket) {
		// TODO Auto-generated method stub
		for(int v : alphabetBucket)
			if(v == 0) return "not panagram";
		
		return "panagram";
	}
	
}
