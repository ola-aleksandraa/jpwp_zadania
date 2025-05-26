
import animals.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Główna klasa aplikacji symulującej zoo.
 */
public class Main {

    public static void main(String[] args) {
        int countLegs = 0;
        List<Animal> animals = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Animal animal = getRandomAnimal();
            animals.add(animal);
            animal.myName();
            System.out.println("Liczba nóg: " + animal.getLegs());
            countLegs += animal.getLegs();
        }

        System.out.println("SUMA NÓG WSZYSTKICH ZWIERZĄT: " + countLegs);
    }

    /**
     * Losuje i zwraca losowe zwierzę.
     * @return instancja klasy Animal
     */
    private static Animal getRandomAnimal() {
        int random = (int) (4 * Math.random());
        return switch (random) {
            case 0 -> new Bird();
            default -> new Bird(); // fallback
        };
    }
}