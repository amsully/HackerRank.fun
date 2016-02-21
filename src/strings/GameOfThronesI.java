package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GameOfThronesI {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String val = br.readLine();

                char[] valArr = val.toCharArray();

                Arrays.sort(valArr);

                char prev = valArr[0];

                int count = 0; // count -1 for base case where prev = curr;
                boolean valid = true;

                for (char c : valArr) {
                        if (prev == c) {
                                count++;
                        } else {
                                if (count % 2 == 1) {
                                        if (valid) {
                                                valid = false;
                                        } else {

                                                System.out.println("NO");
                                                return;
                                        }
                                }else{
                                        count = 1;
                                }
                        }
                        prev = c;
                }
                System.out.println("YES");

        }

}
