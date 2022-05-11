package upperbounds;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    //LowerBound
    public static void addToList(List<? super Number> numbers, Number number){
        numbers.add(number);
    }

    public static void printNumbers(List<? extends Number> numbers){
        for (Number number: numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Number> integers = new ArrayList<>();
        integers.add(1); integers.add(2);
        addToList(integers, 13);
        System.out.println(integers);

        List<Number> doubles = new ArrayList<>();
        doubles.add(11.0); doubles.add(12.0);
        addToList(doubles,13.0);

        List<String> strings = new ArrayList<>();
        strings.add("11.0"); strings.add("12.0");

        printNumbers(integers);
        printNumbers(doubles);
        //printNumbers(strings);


        Cage<Animal> cage = new Cage();
        cage.setAnimalOne(new Dog());
        cage.setAnimalTwo(new Lion());
//       cage.setAnimalOne(new Person());
    }
}
