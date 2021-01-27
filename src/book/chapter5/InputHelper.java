package book.chapter5;

import java.util.Scanner;

public class InputHelper {

    int Input() {
        int move;
        System.out.println("Делайте ход");
        do {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            move = Integer.parseInt(input);
        }
        while (move < 1 || move > 10);
        return move;
    }
}
