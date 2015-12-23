package sorting;

import java.util.*;
public class QuickSortPartOne {
       
          static void partition(int[] ar) {
                    
                  ArrayList<Integer> left = new ArrayList<Integer>(),right = new ArrayList<Integer>();
                  
                  for( int i = 1; i < ar.length; i++)
                  {
                          if(ar[i] < ar[0])
                          {
                                  left.add(ar[i]);
                          }else 
                          {
                                  right.add(ar[i]);
                          }
                  }
                  
                  printArray(left);
                  System.out.print(ar[0] + " ");
                  printArray(right);
                  
                  
                  
       }   
 
 static void printArray(ArrayList<Integer> ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.print("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
