package implementation;

import java.util.*;


public class CutTheSticks {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int N = scan.nextInt();
//		int T = scan.nextInt();
		LinkedList<Integer >sticks = new LinkedList<Integer>();
		
		for(int i = 0; i < N; i++)
		{
			sticks.add(scan.nextInt());
		}
		Collections.sort(sticks);
		cutTheSticks(sticks, sticks.getFirst());
	}
	
	
	public static void cutTheSticks(LinkedList<Integer> sticks, int minimum)
	{
//		if(sticks.isEmpty()) return;
		
		System.out.println(sticks.size());
		
		LinkedList<Integer > smallerSticks = new LinkedList<Integer>();

		Iterator<Integer> itr = sticks.iterator();
		
		
		while(itr.hasNext())
		{
			Integer val = itr.next();
			
			if(val != minimum)
			{
				smallerSticks.add( val - minimum );
			}
		}
		
		Collections.sort(smallerSticks);
		
		if(!smallerSticks.isEmpty())
			cutTheSticks(smallerSticks, smallerSticks.getFirst());
		
	}
	
	
}
