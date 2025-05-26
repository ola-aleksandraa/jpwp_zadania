
/*
   ZADANIE 1
   Popraw nazwy zmiennych i metody tak, aby były czytelne i zgodne z dobrymi praktykami.
   Zadbaj o odpowiednie formatowanie kodu (wcięcia, nawiasy, odstępy).
 */

public class Calculator {

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
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return (double) dividend / divisor;
    }
}

