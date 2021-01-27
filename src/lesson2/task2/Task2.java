package lesson2.task2;

// 2-я задача:
//Числа a, b являюися ли оба четные или нет. Вывести Y (если оба четные), вывести N(если хотябы одно нечетное)

import java.util.Scanner;

public class Task2 {

    private static boolean badNumber(int number) {
        if (number <= 0) {
            System.out.println("Number not even and not odd. Enter other number.");
        }
        return number > 0;
    }

    public static void main(String[] args) {
        int a, b;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (!badNumber(a));

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}



