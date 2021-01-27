package book.chapter5;

import java.util.Scanner;

public class SimpleDotCom {

    int numOfHits;

    public String checkYourself(int[] location, int move) {
        String result = "Мимо";
        for (int cell : location) {
            if (move == cell) {
                result = "Попал!";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == location.length) {
            result = "Затоплен!";
        }
        System.out.println(result);
        return result;
    }


}

