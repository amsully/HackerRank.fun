package sorting;

import java.util.Scanner;

public class CountingSortOne {

        static int[] arr;
        static int[] count;
        static int elementCount;
        
        public static void main(String[] args)
        {
                Scanner scan = new Scanner(System.in);
              
                elementCount = scan.nextInt();
              
                arr = new int[elementCount];
                count = new int[100];
                
                for(int i = 0; i < elementCount; i++)
                {
                        arr[i] = scan.nextInt();
                }
                
                for(int i = 0; i < elementCount; i++)
                {
                        count[arr[i]] = count[arr[i]]+1;
                }
                
                for(int i = 0; i < 100; i++)
                {
                        System.out.print(count[i] + " ");
                }
                
        }
        
} 
