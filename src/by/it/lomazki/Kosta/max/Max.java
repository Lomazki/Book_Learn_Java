package by.it.lomazki.Kosta.max;

import java.util.Scanner;

public class Max {

    // 3. Макс. из трех переменных

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double c = scanner.nextDouble();
        double b = scanner.nextDouble();
        if ((a > b) && (a > c)) {
            System.out.println("a = " + a);
        } else if ((b > c)) {
            System.out.println("b = " + b);
        } else System.out.println("c = " + c);
    }
}