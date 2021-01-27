package lesson2.triangle;

import java.util.Scanner;

public class Task5 {

    // 5-я задача
    // Треугольник. Заданы три числа. Выясните,
    // 1) можно ли построить треугольник с такими длинами сторон?
    // 2) является ли он равносторонним? и
    // 3) является ли он прямоугольным?

    private static int input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean checkBuildTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("One of side don't positive. Triangle build impracticable!");
            return false;
        } else if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            System.out.println("The triangle can build");
            return true;
        } else {
            System.out.println("With this sides triangle build impracticable!");
            return false;
        }
    }

    private static void checkEquilateral(int a, int b, int c) {             // Равносторонний
        if (a == b && b == c) {
            System.out.println("Triangle is equilateral\n " + "Triangle is not rectangular");
        }
    }

    private static void checkRectangular(int a, int b, int c) {             // Прямоугольный
        if (((a * a + b * b) == c * c) || ((b * b + c * c) == a * a) || ((a * a + c * c) == b * b)) {
            System.out.println("Triangle is rectangular\n " + "Triangle is not equilateral");
        }
    }

    public static void main(String[] args) {

        int a, b, c;
        System.out.println("Enter triangle dimensions");
        do {
            a = input();
            b = input();
            c = input();
        }while (!checkBuildTriangle(a, b, c));
        checkEquilateral(a, b, c);
        checkRectangular(a, b, c);
    }
}
