package horse;

import java.util.Scanner;

public class Horses {
    // 2. Кони. Вводим 4 целых числа. это координаты двух коней на шахматной доске. Бьют ли они друг друга?

    // xyab - принимают значения от 1 до 8.
    // Если х увеличивается/уменьшается на 2, то у - на 1. а и в - соответственно


    private static int inputCoordinatesEachHorse(String message) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println(message);
        while (true) {
            input = scanner.nextInt();
            if (input > 0 && input < 9) {
                return input;
            }
            System.out.println("The value must be between 1 and 8. Try one more time: ");
        }
    }

    private static boolean checkOneCell (int x1, int y1, int x2, int y2) {
        if (x1==x2 && y1 == y2) {
            System.out.println("Horses are on one cell. Enter other coordinates");
        }
        return (x1==x2 && y1 == y2);
    }

    public static void main(String[] args) {
        int x, y, a, b;
        String answer = "The horses don't beat each other";

        do {
            x = inputCoordinatesEachHorse("Enter coordinate X First horses");
            y = inputCoordinatesEachHorse("Enter coordinate Y First horses");
            a = inputCoordinatesEachHorse("Enter coordinate X Second horses");
            b = inputCoordinatesEachHorse("Enter coordinate Y Second horses");
        } while (checkOneCell(x,y,a,b)); // надо выводить еще сообщение: "

        int[] arrayMoveFirstHorse = new int[8];

        arrayMoveFirstHorse[0] = (x + 2) * 10 + (y + 1);
        arrayMoveFirstHorse[1] = (x + 2) * 10 + (y - 1);
        arrayMoveFirstHorse[2] = (x - 2) * 10 + (y + 1);
        arrayMoveFirstHorse[3] = (x - 2) * 10 + (y - 1);
        arrayMoveFirstHorse[4] = (x + 1) * 10 + (y + 2);
        arrayMoveFirstHorse[5] = (x + 1) * 10 + (y - 2);
        arrayMoveFirstHorse[6] = (x - 1) * 10 + (y + 2);
        arrayMoveFirstHorse[7] = (x - 1) * 10 + (y - 2);

        for (int value : arrayMoveFirstHorse) {
            if (value == (a * 10 + b)) {
                answer = "The horses beat each other";
                break;
            }
        }
        System.out.println(answer);
    }
}
