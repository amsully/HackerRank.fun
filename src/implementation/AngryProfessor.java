package implementation;

import java.util.*;

public class AngryProfessor {

	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args)
	{
		
		int numberOfTrials = 0;
		
		numberOfTrials = scan.nextInt();
		
		for(int i = 0; i < numberOfTrials; i++)
		{
			
			System.out.println( cancelledClass() );
			
		}
		
		scan.close();
		
	}
	
	public static String cancelledClass()
	{
		
		int numberOfStudents = scan.nextInt();
		
		int minimumNumberOfStudents = scan.nextInt();
		
		int[] students = getStudents(numberOfStudents);
		
		return notEnoughStudents(minimumNumberOfStudents, students);
	}
	
	public static int[] getStudents(int numberOfStudents)
	{
		int[] studentsArray = new int[numberOfStudents];
		
		for(int i = 0; i < numberOfStudents; i++)
			studentsArray[i] = scan.nextInt();
		
		return studentsArray;	
	}
	
	public static String notEnoughStudents(int minStudents, int[] students)
	{
		int numberOfStudents = students.length;
		
		for(int i = 0; i < students.length; i++)
		{
			if( students[i] > 0 )
				numberOfStudents = numberOfStudents -1;
		}
		return (numberOfStudents < minStudents) ? "YES" : "NO";
		
	}
	
	
	
}
