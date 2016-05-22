import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTheTriplets {

        public static void main(String[] args) throws IOException{
                
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                String[] A = br.readLine().split(" " );
                String[] B = br.readLine().split(" " );
                
                int a = 0;
                int b = 0;
                for(int i = 0; i < A.length; i++){
                        if( Integer.parseInt(A[i]) > Integer.parseInt(B[i])){
                                a++;
                        }else if(Integer.parseInt(A[i]) < Integer.parseInt(B[i]) ){
                                b++;
                        }
                }
                System.out.println(a + " " + b);
        }
        
}
