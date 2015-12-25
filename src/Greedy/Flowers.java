package Greedy;

/* Sample program illustrating input/output methods */
import java.util.*;

public class Flowers {
        public static void main(String args[]) {

                // helpers for input/output

                Scanner in = new Scanner(System.in);

                int N, K;
                N = in.nextInt();
                K = in.nextInt();

                int Kfriends[] = new int[K];
                int C[] = new int[N];
                for (int i = 0; i < N; i++) {
                        C[i] = in.nextInt();
                }

                int result = 0;

                Arrays.sort(C);

                for (int i = N - 1; i >= 0; i--) {
                        Kfriends[i % K]++;

                        result = result + (Kfriends[i % K] * C[i]);

                }

                System.out.println(result);

        }
}
