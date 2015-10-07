import java.util.Scanner;


public class SimpleArraySum {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		long sum = 0;
		
		for(int i = 0; i < trials; i++)
		{
			sum += scan.nextInt();
		}
		
		System.out.println(sum);
		scan.close();
	}
	
}
