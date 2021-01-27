package horse;

import java.util.Scanner;

public class Revision_Kosta {

    public static void main(String[] args) {
        int x, y, a, b;
        int[] array = new int[8];
        do {
            x = inputCoordinate("Enter please coordinates of first horse in x");
            y = inputCoordinate("Enter please coordinates of first horse in y");
            a = inputCoordinate("Enter please coordinates of second horse in x");
            b = inputCoordinate("Enter please coordinates of second horse in x");
            if (x == a && y == b) {
                System.out.print("Coordinates of your horses are the same. That can't be, " +
                        "so try to enter them again...\r\n");
            }
        } while (x == a && y == b);

        initArrayWithAllMoves(array, x, y);
        determineBeatEachOther(array, a, b);
    }

    private static void determineBeatEachOther(int[] array, int a, int b) {
        boolean beatable = false;
        for (int value : array) {
            if (value == (a * 10 + b)) {
                System.out.println("The horses beat each other!!!");
                beatable = true;
                break;
            }
        }
        if (!beatable) {
            System.out.println("The horses don't beat each other!!!");
        }
    }

    private static void initArrayWithAllMoves(int[] array, int x, int y) {
        array[0] = (x + 2) * 10 + (y + 1);
        array[1] = (x + 2) * 10 + (y - 1);
        array[2] = (x + 1) * 10 + (y + 2);
        array[3] = (x + 1) * 10 + (y - 2);
        array[4] = (x - 2) * 10 + (y + 1);
        array[5] = (x - 2) * 10 + (y - 1);
        array[6] = (x - 1) * 10 + (y + 2);
        array[7] = (x - 1) * 10 + (y - 2);
    }

    private static boolean checkCoordinate(int coordinate) {
        return coordinate > 0 && coordinate <= 8;
    }

    private static int inputCoordinate(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg + ": ");
        while (true) {
            int value = scanner.nextInt();
            if (checkCoordinate(value)) {
                return value;
            }
            System.out.print(msg + " again: ");
        }
    }
}
