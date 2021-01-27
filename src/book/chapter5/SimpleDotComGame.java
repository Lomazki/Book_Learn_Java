package book.chapter5;

public class SimpleDotComGame {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();
        InputHelper number = new InputHelper();

        int random_number1 = 1 + (int) (Math.random() * 7);
        int[] location = {random_number1, random_number1 + 1, random_number1 + 2};
        int move;
        int counter = 0;
        String result = "";

        while (!result.equals("Затоплен!")) {
            move = number.Input();
            counter++;
            result = dot.checkYourself(location, move);
        }
        System.out.println("Попыток " + counter);
    }


}
