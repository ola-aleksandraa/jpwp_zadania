package animals;

/**
 * Klasa reprezentująca ssaka.
 */
public class Mammal extends Animal {

    public Mammal() {
        super(3);
    }

    public Mammal(int legs) {
        super(legs);
    }

    @Override
    public void myName() {
        System.out.println("My name is Mammal");
    }
}