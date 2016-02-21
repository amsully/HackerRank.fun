package implementation;

import java.util.Scanner;

public class ACMICPCTeam {

        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int numberOfPeople = scan.nextInt();

                int numberOfTopics = scan.nextInt();

                String[] people = new String[numberOfPeople];
                scan.nextLine();
                for (int i = 0; i < numberOfPeople; i++) {
                        people[i] = scan.nextLine();
                }

                int max = 0;
                int count = 0;
                for (int i = 0; i < numberOfPeople; i++) {
                        String person1 = people[i];

                        for (int j = 0; j < numberOfPeople; j++) {
                                String person2 = people[j];
                                int tempCount = 0;

                                for (int k = 0; k < numberOfTopics; k++) {
                                        if (person1.charAt(k) == '1' || person2.charAt(k) == '1') {
                                                tempCount++;
                                        }
                                }
                                if (tempCount > max) {
                                        max = tempCount;
                                        count = 1;
                                } else if (tempCount == max) {
                                        count++;
                                }

                        }

                }

                System.out.println(max);
                System.out.println(count / 2);
                scan.close();
        }

}
