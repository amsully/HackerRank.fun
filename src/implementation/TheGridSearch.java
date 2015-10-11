package implementation;

import java.util.*;


public class TheGridSearch {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
		
			int bigRows = scan.nextInt();
			
			int bigCols = scan.nextInt();
			
			LinkedList<String> grid = new LinkedList<String>();
			
			for( int j = 0 ; j < bigRows ; j ++ )
			{
				
				String row = scan.next();
				
				grid.add(row);
				
			}
			
			int smallRows = scan.nextInt();
			int smallCols = scan.nextInt();
			String start = scan.next();
			boolean foundAMatch = false;
			for(int j = 0; j < bigRows; j++)
			{
				
//				System.out.println(grid.get(j).toString() + " " + start);
//				System.out.println(grid.get(j).contains(start));
//				System.out.println("Last Index: " + (grid.get(j).indexOf(start)+smallCols));
//				System.out.println("First Index: " + grid.get(j).indexOf(start));
				
				if( grid.get(j).contains(start) )
				{
					String container = grid.get(j);
					
					while(container.contains(start))
					{
						foundAMatch = true;
						findGrid(j+1, grid.get(j).indexOf(start), grid.get(j).indexOf(start)+smallCols, grid, smallRows);
						container = container.substring(container.indexOf(start));  
					}
				}
			}
			if(!foundAMatch)
			{
				System.out.println("NO");
			}
			
		}
	}

	private static void findGrid(int i, int indexOf, int lastIndexOf,
			LinkedList<String> grid, int smallRows) {
		// TODO Auto-generated method stub
		int rowsCovered = 1;
		
		for( int k = i; k < grid.size(); k++ )
		{
			if( !grid.get(k).substring(indexOf, lastIndexOf).contains(scan.next()))
			{
				System.out.println("NO");
				
				for( int z = rowsCovered+1; z < smallRows; z++)
				{
					scan.next();
//					System.out.println(z);
//					System.out.println("REMOVING " + scan.next());
				}
				return;
			}
			else
			{
				rowsCovered++;
				if(rowsCovered == smallRows)
				{
					System.out.println("YES");
					return;
				}
			}
		}
		
		
	}
	
}
