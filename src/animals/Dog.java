package animals;

public class Dog extends Mammal {

    public Dog() {
        super(4);
    }

    @Override
    public void myName() {
        System.out.println("My name is Dog");
    }
}
