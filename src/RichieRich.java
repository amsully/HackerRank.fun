import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class RichieRich {

        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String[] in = br.readLine().split(" ");
                long n = Integer.parseInt(in[0]);
                long k = Integer.parseInt(in[1]);

                String drome = br.readLine();

//                String val = solve(k, drome);

                String val = iterative(k, drome);
                
                System.out.println(val);

        }

        private static String iterative(long k, String drome) {
                // TODO Auto-generated method stub
                
                while( k >=  0 ){
                        
                }
                
                return null;
        }

        private static String solve(long k, String drome) {
                // TODO Auto-generated method stub

                if (k < 0) {
                        return "-1";
                }
                if (k == 0) {
                        if (isPalindrome(drome)) {
                                return drome;
                        } else {
                                return "-1";
                        }
                }
                if (drome.length() == 1) {
                        if (k > 0) {
                                return "9";
                        }
                }

                int begin = Integer.parseInt("" + drome.charAt(0));
                int end = Integer.parseInt("" + drome.charAt(drome.length() - 1));

                String temp = new String(drome);
                temp = temp.substring(1, temp.length() - 1);

                if (temp.isEmpty()) {
                        if (k > 1) {
                                return "99";
                        } else if (k == 1) {
                                if (begin > end) {
                                        return begin + "" + begin;
                                } else {
                                        return end + "" + end;
                                }
                        } else {
                                return "-1";
                        }
                }

                // System.out.println("Drome: " + temp);

                String doubleReplace = "-1";
                if (begin == 9 && end == 9) {
                        doubleReplace = solve(k, temp);

                        if (!doubleReplace.equals("-1")) {
                                doubleReplace = "9" + doubleReplace + "9";
                        }

                } 
                if (doubleReplace.equals("-1") && (begin == 9 || end == 9)) {
                        doubleReplace = solve(k - 1, temp);

                        if (!doubleReplace.equals("-1")) {
                                doubleReplace = "9" + doubleReplace + "9";
                        }

                } 
                if (doubleReplace.equals("-1") && k > 1) {
                        doubleReplace = solve(k - 2, temp);

                        if (!doubleReplace.equals("-1")) {
                                doubleReplace = "9" + doubleReplace + "9";
                        }

                } 
                if (doubleReplace.equals("-1") && begin == end) {
                        doubleReplace = solve(k, temp);
                        if (!doubleReplace.equals("-1")) {
                                doubleReplace = begin + doubleReplace + end;
                        }
                } 
                if (doubleReplace.equals("-1") && k == 1) {
                        doubleReplace = solve(k - 1, temp);
                        if (!doubleReplace.equals("-1")) {
                                if (begin > end) {
                                        doubleReplace = begin + doubleReplace + begin;
                                } else {
                                        doubleReplace = end + doubleReplace + end;
                                }
                        }
                }

                if (doubleReplace.equals("-1")) {
                        doubleReplace = solve(k - 1, temp);
                        if (!doubleReplace.equals("-1")) {
                                if (begin > end) {
                                        doubleReplace = begin + doubleReplace + begin;
                                } else {
                                        doubleReplace = end + doubleReplace + end;
                                }
                        }
                }

                // if (!doubleReplace.equals("-1")) {
                // doubleReplace = "9" + doubleReplace + "9";
                // }
                return doubleReplace;

                // return
                // Integer.toString(Math.max(Integer.parseInt(doubleReplace),
                // Integer.parseInt(singleReplace)));

        }

        private static boolean isPalindrome(String drome) {
                // TODO Auto-generated method stub
                int n = drome.length();

                for (int i = 0; i < (n / 2); i++) {
                        if (drome.charAt(i) != drome.charAt(n - i - 1)) {
                                return false;
                        }
                }
                return true;
        }

}

// 6 4
// 798892

// 7 3
// 1237321

// 3 1
// 040

// 10 3
// 1000100010

// 9 3
// 100010010
