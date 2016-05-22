package dynamic_programming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibonacciModified {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] in = br.readLine().split(" ");
        
        BigInteger A = new BigInteger(in[0]);
        BigInteger B = new BigInteger(in[1]);
        int N = Integer.parseInt(in[2]);
        
        BigInteger solution = A;
        for(int i = 2; i < N; i++){
                solution = A.add((B.multiply(B)));
                A = B;
                B = solution;
        }
        System.out.println(solution.toString());                
    }
}