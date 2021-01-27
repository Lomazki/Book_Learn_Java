package lesson2.mutants;

import java.util.Scanner;

public class Kosta {
    private static boolean determineWinner(int mutant, int killed) {
        return mutant >= killed;
    }

    private static int input(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    private static boolean checkInput(int m, int n, int p) {
        if (m <= 0) {
            System.out.println("Number mutants must be over zero");
        }
        if (p < 0) {
            System.out.println("Percent mutants must be zero and over");
        }
        if (n < 0) {
            System.out.println("Workers GKH don't breed mutants :)");
        }
        return (m > 0) && (p >= 0) && (n >= 0);
    }

    public static void main(String[] args) {

        int m, n, p;
        int counterDay = 0;

        do {
            m = input("How much will be mutants attacked city?");
            p = input("Enter percent increase mutants every night.");
            n = input("How much mutants kill GKH during the day?");
        } while (!checkInput(m, n, p));

        if (determineWinner((m * p / 100), n)) {
            System.out.println("GKH is never win. Need to enter other numbers");
        } else {
            while (m > 0) {
                m += m * p / 100;
                m -= n;
                counterDay++;
            }
            System.out.println("In " + counterDay + " days mutants will die out");
        }
    }

}
