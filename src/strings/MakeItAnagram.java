package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeItAnagram {
        
        public static void main(String[] args) throws IOException{
                
                
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                char[] one = br.readLine().toCharArray();
                char[] two = br.readLine().toCharArray();
                
                int[] arrOne = new int[26];
                int[] arrTwo = new int[26];
                
                for(int i = 0; i < Math.max(one.length, two.length); i++){
                        
                        if(one.length > i){
                                arrOne[one[i]- 97] += 1;
                        }
                        if(two.length > i){
                                arrTwo[two[i]- 97] += 1;

                        }
                        
                }
                
                int sum = 0;
                for(int i = 0; i < arrOne.length; i++){
                        sum += Math.abs(arrOne[i] - arrTwo[i]);
                }
                System.out.println(sum);
        }
        
}
