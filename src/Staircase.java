import java.util.*;
public class Staircase {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	
		int total = scan.nextInt();
		String stairCase = "";
		
		for(int i = total; i >= 0; i--)
		{
			if(i != total)
			{
				for(int k = 0; k < total; k ++)
				{
					if( k < i )
						stairCase += " ";
					else
						stairCase += "#";
				}
				if(i != 0)
					stairCase += "\n";

			}
		}
		System.out.println(stairCase);
	}
	
}
