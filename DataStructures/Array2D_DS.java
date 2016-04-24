import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2D_DS {
        
        static int grid[][] = new int[6][6];
        static int max = 6;
        static int res = Integer.MIN_VALUE;
        
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                for(int i = 0 ; i < max; i++){
                        String[] line = br.readLine().split(" " );
                        for(int j = 0; j < max; j++){
                                grid[i][j] = Integer.parseInt(line[j]);
                        }   
                }
                
                for(int i = 0; i < max-2; i++){
                        for(int j = 0; j < max -2; j++){
                                
                             int top = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                             int mid = grid[i+1][j+1];
                             int bot = grid[i+2][j] + grid[i+2][j+1]+ grid[i+2][j+2];
                             
                             int tot = top+mid+bot;
                            
                             if(res < tot)
                                     res = tot;
                        }
                }
                System.out.println(res);
        }
        
        
}
