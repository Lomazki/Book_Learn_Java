package dmdev;

public class Computer {

    private Ram ram;

    public Computer(Ram ram) {
        this.ram = ram;
    }

    public  void printState () {
        System.out.println("Computer ram: " + ram.getValue());
    }


}
