/*
   ZADANIE 1
   Stórz 4 metody kalkulatora (dodawania, odejmowania, mnożenia i dzielenia), nazwij je zgodnie z konwencja uzywana w
   Javie, zadbaj o odpowiednie formatowanie kodu (wcięcia, nawiasy, odstępy).
 */


import java.util.Scanner;

public class Calculator {
    // TODO: DODAJ 4 METODY KALKULATORA I POPRAWNIE JE NAZWIJ
    // TODO: DODAJ STAŁĄ O, KTÓRA WYKORZYSTASZ PODCZAS WARUNKU PRZY DZIELENIU

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Wynik dodawania: " + calculator.add(firstNumber, secondNumber));
        System.out.println("Wynik odejmowania: " + calculator.subtract(firstNumber, secondNumber));
        System.out.println("Wynik mnożenia: " + calculator.multiply(firstNumber, secondNumber));

        try {
            System.out.println("Wynik dzielenia: " + calculator.divide(firstNumber, secondNumber));
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
    public static final String DIVIDE_BY_ZERO_ERROR = "Divisor cannot be zero.";
    public static final int DEFAULT_ZERO = 0;

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    public double divide(int dividend, int divisor) {
        if (divisor == DEFAULT_ZERO) {
            throw new IllegalArgumentException(DIVIDE_BY_ZERO_ERROR);
        }
        if (dividend == 0) {
            throw new IllegalArgumentException(DIVIDE_BY_ZERO_ERROR);
        }
        return (double) dividend / divisor;
    }
}


