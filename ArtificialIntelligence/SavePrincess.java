import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclEntry.Builder;

public class SavePrincess {

        static Point mario;
        static Point peach;

        static String[] board;

        static String verticalMovement;
        static String horizontalMovement;

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int N = Integer.parseInt(br.readLine());

                board = new String[N];

                for (int i = 0; i < N; i++) {
                        board[i] = br.readLine();
                }

                peach = getPeachPoint(board);
                mario = getMarioPoint(board);
                
//                System.out.println("p: " + peach.toString());
//                System.err.println("m: " + mario.toString());
                
                verticalMovement = (mario.x > peach.x) ? "UP" : "DOWN";
                horizontalMovement = (mario.y > peach.y) ? "LEFT":"RIGHT";
                
                StringBuilder bldr = new StringBuilder();
                
                for(int i = 0; i < Math.abs(peach.y-mario.y); i++){
                        bldr.append(horizontalMovement);
                        bldr.append("\n");
                }
                for(int i = 0; i < Math.abs(peach.x-mario.x); i++){
                        bldr.append(verticalMovement);
                        bldr.append("\n");
                }                
                System.out.println(bldr.toString());
        }

        private static Point getMarioPoint(String[] board2) {
                // TODO Auto-generated method stub
                int mid = board2.length/2;
                
                if(board[mid].contains("m")){
                        return new Point(mid, board[mid].indexOf('m'));
                }else if(board[mid-1].contains("m")){
                        return new Point(mid-1, board[mid-1].indexOf('m'));
                }
                
                
                return null;
        }

        private static Point getPeachPoint(String[] board2) {
                // TODO Auto-generated method stub
                if ( pAt(0,0) ) {
                        return new Point(0, 0);
                } else if ( pAt(board.length-1, 0) ) {
                        return new Point(board.length - 1, 0);
                } else if (pAt(0, board.length-1) ) {
                        return new Point(0, board.length-1);
                }else if(pAt(board.length-1, board.length-1)){
                        return new Point(board.length-1, board.length-1);
                }
                System.out.println("ERROR");
                return new Point();
        }

        private static boolean pAt(int i, int j) {
                // TODO Auto-generated method stub
                return (board[i].charAt(j) == 'p');
        }

}
