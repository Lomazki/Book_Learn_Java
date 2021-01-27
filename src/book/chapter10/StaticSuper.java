package book.chapter10;

public class StaticSuper {
    static {
        System.out.println("Roditelskiy staticheskiy blok");
    }

    public StaticSuper() {
        System.out.println("Roditelskiy konstryctor");
    }
}
