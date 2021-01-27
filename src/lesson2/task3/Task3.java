package lesson2.task3;

import java.util.Scanner;

public class Task3 {

    // 3-я задача:
    //Числа a,b имеют ли одинаковую четность. Вывести Y or N

    private static boolean badNumber(int number) {
        if (number <= 0) {
            System.out.println("Number not even and not odd. Enter other number.");
        }
        return number>0;
    }

    public static void main(String[] args) {
        int a, b;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            a = scanner.nextInt();
            b = scanner.nextInt();
        } while (!badNumber(a));

        if ((a%2==0 && b%2==0) || (a%2!=0 && b%2!=0)){
            System.out.println("Y");
        }else System.out.println("N");
    }
}
