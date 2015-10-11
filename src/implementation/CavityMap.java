package implementation;

import java.lang.reflect.Array;
import java.util.*;

public class CavityMap {

	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		int N = scan.nextInt();
		
		int[][] map = new int[N][N];
		
		for(int i = 0; i < N; i++)
		{
			
			String arr = scan.next();
//			System.out.println(arr);
			for(int j = 0; j < N; j++)
			{
				
				map[i][j] = Integer.parseInt(arr.substring(j, j+1));
				
			}
		}
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				
				int left = j - 1;
				int right = j + 1;
				int above = i + 1;
				int below = i - 1;
				
				if( i != (N-1) && j != (N-1) && i != 0 && j!= 0 )
				{
					
					if( map[above][j] < map[i][j]
							&& map[below][j] < map[i][j]
									&& map[i][left] < map[i][j]
											&& map[i][right] < map[i][j])
					{
						
						map[i][j] = 11;
						
					}
					
				}
				
			}
		}
		
//		System.out.println(Arrays.deepToString(map));
		
		StringBuilder bldr = new StringBuilder();
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(map[i][j] == 11 )
				{
					bldr.append("X");
				}else
					bldr.append(Integer.toString(map[i][j]));
				
			}
			bldr.append("\n");
		}
		
		System.out.println(bldr.toString());
		
	}
	
	
}
