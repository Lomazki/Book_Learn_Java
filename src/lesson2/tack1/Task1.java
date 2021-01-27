package lesson2.tack1;


import java.util.Scanner;

public class Task1 {

// 1-я задача:
//Число а является ли четным или нечетным. Вывести Y or N


    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Y");
        } else System.out.println("N");
    }
}
