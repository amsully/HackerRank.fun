import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class AbsolutePermutation {

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int trials = Integer.parseInt(br.readLine());

                for (int t = 0; t < trials; t++) {
                        String[] in = br.readLine().split(" ");
                        int N = Integer.parseInt(in[0]);
                        int K = Integer.parseInt(in[1]);

                        HashSet<Integer> collision = new HashSet<Integer>();

                        int arr[] = new int[N + 1];
                        boolean poss = true;
                        
                        StringBuilder strBldr = new StringBuilder();
                        
                        for (int i = 1; i <= N; i++) {
                                int valHigh = i + K;
                                int valLow = i - K;

                                if (valLow > 0 && !collision.contains(valLow)) {
                                        collision.add(valLow);
                                        arr[i] = valLow;
                                        strBldr.append(valLow);
                                        strBldr.append(" " );
                                        continue;
                                }

                                if (valHigh <= N && !collision.contains(valHigh)) {
                                        collision.add(valHigh);
                                        arr[i] = valHigh;
                                        strBldr.append(valHigh);
                                        strBldr.append(" " );
                                        continue;
                                }

                                poss = false;

                        }
                        // Output
                        if (poss) {

                                System.out.println(strBldr.toString());
//                                String o = "";
//                                for (int i = 1; i < arr.length; i++) {
//                                        o += arr[i] + " ";
//                                }
//                                System.out.println(o.trim());

                        } else {
                                System.out.println(-1);
                        }
                }

        }

}
