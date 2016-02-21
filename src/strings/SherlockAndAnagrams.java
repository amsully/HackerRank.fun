package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class SherlockAndAnagrams {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int trials = Integer.parseInt(br.readLine());

                for (int i = 0; i < trials; i++) {

                        String main = br.readLine();

                        System.out.println(unorderedAnagrammaticPairs(main));

                }

        }

        private static int unorderedAnagrammaticPairs(String main) {

                HashSet<String> hs = new HashSet<String>();
                int count = 0;

                for (int i = 1; i < main.length(); i++) { // TODO length - 1?

                        for (int z = 0; z <= main.length(); z++) {
                                if (z + i <= main.length()) {

                                        String subStr = main.substring(z, z + i);
                                        char[] s = subStr.toCharArray();
                                        Arrays.sort(s);
                                        subStr = String.valueOf(s);


                                        for (int j = z+1; j <= main.length(); j++) {

                                                if (j + i <= main.length()) {
                                                        String subStrCompare = main.substring(j, j + i);
                                                        char[] ss = subStrCompare.toCharArray();
                                                        Arrays.sort(ss);
                                                        subStrCompare = String.valueOf(ss);

                                                        if (subStr.equals(subStrCompare)) {
                                                                count++;
                                                        }
                                                }

                                        }
                                }
                        }
                }

                return count;
        }

}
