package sorting;

import java.util.LinkedList;
import java.util.Scanner;

public class QuickSortPartTwo
{

        public static void main(String[] args)
        {
                Scanner scan = new Scanner(System.in);

                int n = scan.nextInt();
                LinkedList<Integer> arr = new LinkedList<Integer>();
                for (int i = 0; i < n; i++)
                {
                         arr.add(scan.nextInt());
                }

                quickSort(arr);

        }

        private static LinkedList<Integer> quickSort(LinkedList<Integer> arr)
        {
                // TODO Auto-generated method stub
                
                if(arr.size() == 1 || arr.isEmpty()) return arr;

                int pivot = arr.getFirst();

                LinkedList<Integer> left = new LinkedList<Integer>();
                LinkedList<Integer> right = new LinkedList<Integer>();
                
                for(int i = 1; i < arr.size(); i++)
                {
                        if(arr.get(i) < pivot)
                                left.add(arr.get(i));
                        else
                                right.add(arr.get(i));
                }
                                
                left = quickSort(left);
                right = quickSort(right);
                
                left.add(pivot);
                left.addAll(right);
                printArray(left);
                return left;
        }

        static void printArray(LinkedList<Integer> ar)
        {
                for (int n : ar)
                {
                        System.out.print(n + " ");
                }
                System.out.println("");
        }

}
