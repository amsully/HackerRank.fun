package warm_up;
import java.util.*;


public class LibraryFine {

	
	
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		String returnDate = scan.nextLine();
		String expectedDate = scan.nextLine();
		
		LinkedList<Integer> returnDateArray = new LinkedList<Integer>();
		
		for(String str : returnDate.split(" "))
		{
			returnDateArray.add(Integer.parseInt(str));
		}
		
		LinkedList<Integer> expectedDateArray = new LinkedList<Integer>();
		
		for(String str : expectedDate.split(" "))
		{
			expectedDateArray.add(Integer.parseInt(str));
		}
//		System.out.println(returnDateArray.get(1) );
//		System.out.println(expectedDateArray.get(1));
//		System.out.println(returnDateArray.get(1).equals(expectedDateArray.get(1)) );
		
		if(returnDateArray.get(2).compareTo(expectedDateArray.get(2)) < 0)
			System.out.println(0);
		else
		if( returnDateArray.get(2).compareTo(expectedDateArray.get(2)) < 1 
				&& returnDateArray.get(1).compareTo(expectedDateArray.get(1)) < 0)
			System.out.println(0);
		else
		if( returnDateArray.get(2).compareTo(expectedDateArray.get(2)) < 1
				&& returnDateArray.get(1).compareTo(expectedDateArray.get(1)) < 1
				&& returnDateArray.get(0).compareTo(expectedDateArray.get(0)) < 1)
			System.out.println(0);
		else
		if( !returnDateArray.get(2).equals(expectedDateArray.get(2)) )
		{
			System.out.println(10000);
		}else
		if( !returnDateArray.get(1).equals(expectedDateArray.get(1)) )
		{
			System.out.println(500 * (returnDateArray.get(1) - expectedDateArray.get(1)));
		}else
		if( !returnDateArray.get(0).equals(expectedDateArray.get(0)) )
		{
			System.out.println(15 * (returnDateArray.get(0) - expectedDateArray.get(0)));
		}else
			System.out.println(0);
	}
	
	
}
