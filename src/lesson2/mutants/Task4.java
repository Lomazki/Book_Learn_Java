package lesson2.mutants;

import java.util.Scanner;

public class Task4 {

    // 4 - я задача
    // Мутанты (smiley)
    // Ночью на Минск напало m мутантов. Каждую ночь они размножаются на p процентов.
    // Каждый день коммунальные службы Минска уничтожают n мутантов.
    // Через сколько суток работники ЖЭСа отпразднуют победу над мутантами?

    private static boolean whoWins(int mutant, int gkhKill) {
        return mutant >= gkhKill;
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
        return ((m <= 0 && p < 0 && n < 0));
    }

    public static void main(String[] args) {

        int m, n, p, increment, nightStrengthMutant;
        int counterDay = 0;

        do {
            m = input("How much will be mutants attacked city?");
            p = input("Enter percent increase mutants every night.");
            n = input("How much mutants kill GKH during the day?");
        } while (!checkInput(m,n,p));

        int dayStrengthMutant = 1;
        while (dayStrengthMutant > 0) {
            increment = m * p / 100;                            // Прирост мутантов каждую ночь
            nightStrengthMutant = m + increment;                // Количество мутантов к концу ночи
            dayStrengthMutant = nightStrengthMutant - n;        // Количество мутантов к началу ночи
            if (counterDay == 0) {
                if (whoWins(increment, n)) {
                    System.out.println("GKH is never win. Need to enter other numbers");
                    break;
                }
            }
            m = dayStrengthMutant;
            counterDay++;
        }
        if (m <= 0) {
            System.out.println("In " + counterDay + " days mutants will die out");
        }
    }
}


// проценты могут быть дабловыми
