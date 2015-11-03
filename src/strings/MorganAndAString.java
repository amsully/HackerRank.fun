package strings;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class MorganAndAString {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		int trials = scan.nextInt();
		
		for(int i = 0; i < trials; i++)
		{
			
			System.out.println( minimumOrder(scan.next(), scan.next()));
			
		}
		
	}

	public static String minimumOrder(String next, String next2) {
		// TODO Auto-generated method stub
		
		LinkedList<Character> nextStack = new LinkedList<Character>();
		LinkedList<Character> next2Stack = new LinkedList<Character>();
		
		for(Character c : next.toCharArray())
			nextStack.push(c);
		for(Character c: next2.toCharArray())
			next2Stack.push(c);
		
		return createLexographicalString(nextStack, next2Stack);
		
		
	}

	private static String createLexographicalString(LinkedList<Character> nextStack,
			LinkedList<Character> next2Stack) {
		// TODO Auto-generated method stub
		StringBuilder strBldr = new StringBuilder();
		
		while(!nextStack.isEmpty() && !next2Stack.isEmpty())
		{
			if(nextStack.getLast() == next2Stack.getLast())
			{
//				System.out.println(nextStack.getLast() + " " + next2Stack.getLast());
				if( popLeft(nextStack, next2Stack))
				{
					Character until = nextStack.getLast();
					
					while(!nextStack.isEmpty() && nextStack.getLast() == until)
						strBldr.append(nextStack.removeLast());

				}
				else
				{
					Character until = next2Stack.getLast();
					
					while(!next2Stack.isEmpty() && next2Stack.getLast() == until)
						strBldr.append(next2Stack.removeLast());
					
				}
			}
			else
			if(nextStack.getLast() < next2Stack.getLast())
				strBldr.append(nextStack.removeLast());
			else
				strBldr.append(next2Stack.removeLast());
		}
		
		
		while(!nextStack.isEmpty())
			strBldr.append(nextStack.removeLast());
		while(!next2Stack.isEmpty())
			strBldr.append(next2Stack.removeLast());		
		
		return strBldr.toString();
	}

	private static boolean popLeft(LinkedList<Character> nextStack, LinkedList<Character> next2Stack) {
		// TODO Auto-generated method stub
		ListIterator<Character> lstItr = nextStack.listIterator(nextStack.size());
		ListIterator<Character> lstItr2 = next2Stack.listIterator(next2Stack.size());		
		
		while(lstItr.hasPrevious() && lstItr2.hasPrevious())
		{
			Character left = lstItr.previous();
			Character right = lstItr2.previous();
			if(left == right)
				continue;
			else
				return (left < right);
		}
		
		if(lstItr.hasPrevious()) return true;
		else return false;
		
	}
	
}
