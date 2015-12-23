package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortPartTwo
{
        public static void main(String[] args)
        {

                Scanner scan = new Scanner(System.in);

                int trials = scan.nextInt();
                int[] arr = new int[trials];
                for (int i = 0; i < trials; i++)
                {

                        arr[i] = scan.nextInt();

                }

                insertionPrint(arr);
        }

        private static void insertionPrint(int[] arr)
        {
                // TODO Auto-generated method stub
                int count = 0;
                for (int i = 1; i < arr.length; i++)
                {
                        int moveVal = arr[i];
                        for (int j = i-1; j >= 0; j--)
                        {
                                if (arr[j] > moveVal)
                                {

                                        count++;
                                        
                                        arr[j + 1] = arr[j];

                                } else
                                {
                                        arr[j + 1] = moveVal;
                                        break;
                                }

                                if (j == 0)
                                        arr[0] = moveVal;
                        }
//                        System.out.println(print(arr));

                }

//                System.out.println(print(arr));
                System.out.println(count);
        }

        public static String print(int[] arr)
        {
                return Arrays.toString(arr).replace(", ", " ").replace("[", "").replace("]", "");
        }

}
