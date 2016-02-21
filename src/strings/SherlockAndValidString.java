package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class SherlockAndValidString {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String main = br.readLine() + "Z"; // easy eol detector
                char[] c = main.toCharArray();
                Arrays.sort(c);

                HashSet<Integer> sizes = new HashSet<Integer>();
                HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();

                int count = 0; // account for initial prev.
                char prev = c[0];

                for (char ch : c) {
                        if (ch == prev) {
                                count++;
                        } else {
                                sizes.add(count);
                                if (sizes.size() == 3) {
                                        System.out.println("NO");
                                        return;
                                }

                                if (!counts.containsKey(count)) {
                                        counts.put(count, 1);
                                } else {
                                        counts.put(count, counts.get(count) + 1);
                                }

                                if (counts.size() == 2) {
                                        Iterator<Integer> itr = counts.values().iterator();

                                        int val1 = itr.next();
                                        int val2 = itr.next();
                                        if (val1 > 1 && val2 > 1) {
                                                System.out.println("NO");
                                                return;
                                        }
                                }
                                count = 1;

                        }
                        prev = ch;

                }
                System.out.println("YES");
        }

}
