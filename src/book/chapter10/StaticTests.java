package book.chapter10;

public class StaticTests extends StaticSuper {
    static  int rand;

    static {
        rand = (int)(Math.random()*6);
        System.out.println("Staticheskiy blok " + rand);
    }

    public StaticTests() {
        System.out.println("Konstryctor");
    }

    public static void main(String[] args) {
        System.out.println("Vnytri main");
        StaticTests st = new StaticTests();
    }
}
