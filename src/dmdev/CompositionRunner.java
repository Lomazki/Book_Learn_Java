package dmdev;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(90);
        Computer computer = new Computer(ram);
        computer.printState();
    }
}
