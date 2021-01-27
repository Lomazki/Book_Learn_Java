package book.chapter6.oldBattle;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<Integer> locationCells;

    public void setLocationCells(ArrayList<Integer> loc) {
        locationCells = loc;
    }

    public ArrayList<Integer> LocationCells() {
        ArrayList<Integer> site = new ArrayList<>();
        int randomNum = (int) (Math.random() * 5);
        site.add(randomNum);
        site.add(randomNum + 1);
        site.add(randomNum + 2);
        for (int s : site) {
            System.out.println(s);
        }
        return site;
    }

    public String checkYourself(Integer userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        System.out.println(result);
        return result;
    }
}
