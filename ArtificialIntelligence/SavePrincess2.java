import java.awt.Point;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SavePrincess2 {
        static void nextMove(int n, int r, int c, String[] grid) {
                
                Point p = getPrince(grid);
                
                if( p.x > r ){
                        System.out.println("DOWN");
                        return;
                }
                if( p.x < r){
                        System.out.println("UP");
                        return;
                }
                if( p.y < c ){
                        System.out.println("LEFT");
                        return;
                }
                if( p.y > c){
                        System.out.println("RIGHT");
                        return;
                }
        }

        private static Point getPrince(String[] grid) {
                // TODO Auto-generated method stub
                
                for(int i = 0; i < grid.length; i++){
                        if(grid[i].contains("p")){
                                return new Point(i, grid[i].indexOf('p'));
                        }
                }
                
                return null;
        }

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n, r, c;
                n = in.nextInt();
                r = in.nextInt();
                c = in.nextInt();
                in.useDelimiter("\n");
                String grid[] = new String[n];

                for (int i = 0; i < n; i++) {
                        grid[i] = in.next();
                }

                nextMove(n, r, c, grid);

        }
}
