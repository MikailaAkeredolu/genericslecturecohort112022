package upperbounds;

public class Cage<E extends Animal> {

    private E animalOne;
    private E animalTwo;

    public E getAnimalOne() {
        return animalOne;
    }

    public void setAnimalOne(E animalOne) {
        this.animalOne = animalOne;
    }

    public E getAnimalTwo() {
        return animalTwo;
    }

    public void setAnimalTwo(E animalTwo) {
        this.animalTwo = animalTwo;
    }
}
