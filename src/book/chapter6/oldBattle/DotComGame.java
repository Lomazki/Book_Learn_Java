package book.chapter6.oldBattle;

public class DotComGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        DotCom theDotCom = new DotCom();

        theDotCom.setLocationCells(theDotCom.LocationCells());

        boolean isAlive = true;
        while (isAlive) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(Integer.valueOf(guess));
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
