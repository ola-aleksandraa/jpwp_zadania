
/*
    ZADANIE 4
    W projekcie znajduje się klasa MathUtils z metodą int factorial(int n).
    Dodaj plik testowy (np. MathUtilsTest.java) i napisz testy jednostkowe dla metody factorial,
    sprawdzając poprawność dla kilku wybranych przypadków (np. 0, 1, 5).
 */

public class MathUtils {
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
