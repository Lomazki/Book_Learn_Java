package book.chapter6.newBattle;

import java.util.ArrayList;

public class DotComBust {

    private ArrayList<DotCom> dotComsList = new ArrayList<>();
    private GameHelper helper = new GameHelper();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three = new DotCom();

        one.setName("Pets.com");
        two.setName("Go2.com");
        three.setName("eToys.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
        System.out.println("Цель потопить три сайта: " + one.getName() + ", " + three.getName() + ", "
                + three.getName() + ". ");
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "Mimo";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Popal")) {
                break;
            }
            if (result.equals("Potopil")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все сайты ушли ко дну! \n Потребовалось попыток " + numOfGuesses);
    }


    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
