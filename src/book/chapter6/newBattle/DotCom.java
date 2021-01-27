package book.chapter6.newBattle;

import java.util.ArrayList;

public class DotCom {

    private String name;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String nameSite) {
        name = nameSite;
    }

    public String checkYourself(String userInput) {
        String result = "Mimo";
        System.out.println(locationCells);
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Potopil";
            }else {
                result = "Popal";
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }
}
