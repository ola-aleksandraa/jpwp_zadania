package animals;

    /**
     * Klasa reprezentująca ptaka.
     */
    public class Bird extends Animal {

        public Bird() {
            super(2);
        }

        @Override
        public void myName() {
            System.out.println("My name is Bird");
        }
    }
