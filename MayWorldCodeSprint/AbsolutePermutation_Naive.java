import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbsolutePermutation_Naive {

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int trials = Integer.parseInt(br.readLine());

                for (int t = 0; t < trials; t++) {
                        String[] in = br.readLine().split(" ");
                        int N = Integer.parseInt(in[0]);
                        int K = Integer.parseInt(in[1]);

                        int[] arr = new int[N + 1];
                        boolean[] set = new boolean[N + 1];
                        boolean poss = true;
                        for (int i = 1; i <= N; i++) {

                                for (int j = 1; j <= N; j++) {
                                        if (!set[i] && (Math.abs(j - i) == K)) {
                                                arr[i] = j;
                                                set[i] = true;
                                                break;
                                        }

                                        if (j == N) {
                                                poss = false;
                                        }

                                }
                        }

                        // Output
                        if (poss) {

                                String o = "";
                                for (int i = 1; i < arr.length; i++) {
                                        o += arr[i] + " ";
                                }
                                System.out.println(o.trim());

                        } else {
                                System.out.println(-1);
                        }

                }

        }

}
