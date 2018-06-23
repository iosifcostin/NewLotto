

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {


    private int getRandomNumber(Random myNumbersMachine) {

        int nr = myNumbersMachine.nextInt(49) + 1;
        return nr;


    }

    public static void main(String[] args) {

        Main m = new Main();
        Random myNumbersMachine = new Random();

        Set<Integer> agencyNumbers;
        Set<Integer> myNumbers;
        agencyNumbers = getU(m, myNumbersMachine);


        int counter = 0;
        int nrTickets = 0;
        while (counter < 6) {
            nrTickets++;
            counter = 0;
            // nr mele
            myNumbers = getU(m, myNumbersMachine);

            // compar
;
//            System.out.println(agencyNumbers);
//            System.out.println(myNumbers);
            Set<Integer> commonNumbers = new HashSet<>();
            commonNumbers.addAll(agencyNumbers);
            commonNumbers.retainAll(myNumbers);
            System.out.println(commonNumbers);
            if(commonNumbers.size() >= 5) {
                counter = 6;
            }

//            for (int j = 0; j < 6; j++) {
//                for (int k = 0; k < 6; k++) {
//                    if (agencyNumbers[j] == myNumbers[k])
//                        counter++;
//
//                }
//            }
        }

        System.out.println("");
        System.out.println("ionel ai nimerit 6 numere jucand:" + nrTickets);


    }

    private static int[] getUniqueNumbers(Main m, Random myNumbersMachine) {
        int[] a = new int[6];
        //nr agentiei
        for (int i = 0; i < 6; i++) {
            int number = m.getRandomNumber(myNumbersMachine);

            System.out.print(number + ":");
            a[i] = number;
        }
        return a;
    }


    private static Set<Integer> getU(Main m, Random myNumbersMachine) {
        Set<Integer> se = new HashSet<>();
        int[] a = new int[6];

        while (se.size() < 6) {
            int nr = myNumbersMachine.nextInt(49) + 1;
            se.add(nr);
        }


        // transform set in array, pls find a better one !!!
        int i = 0;
        for (Integer s : se) {
            // System.out.print(s+":");
            a[i] = s;
            i++;
        }
        //  System.out.println();
        return se;

    }

    private static Set<Integer> getU(Random myNumbersMachine) {
        Set<Integer> se = new HashSet<>();
        int[] a = new int[6];

        while (se.size() < 6) {
            int nr = myNumbersMachine.nextInt(49) + 1;
            se.add(nr);
        }


        // possible only in java 8 (using streams)
        a = se.stream().mapToInt(Integer::intValue).toArray();

        return se;

    }


}
