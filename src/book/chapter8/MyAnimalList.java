package book.chapter8;

import java.util.Arrays;

public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal добавлен в ячейку" + nextIndex);
            nextIndex++;
        }
        System.out.println(Arrays.toString(animals));
    }
}
