
/*
    ZADANIE 2:
    Kod obsługuje rejestrację użytkowników, ale jest nieczytelny i nieczyści spełnia zasad SRP.
    Popraw: nazwy zmiennych, klas i metod, przenieś walidację i tworzenie użytkownika do osobnych metod, zamień
    magiczne liczby na stałe, dodaj formatowanie i komentarze tam, gdzie potrzebne.
*/

import java.util.Scanner;

public class UserRegistration {

    // Stałe dla walidacji danych
    private static final int MIN_AGE = 13;
    private static final int MAX_AGE = 99;
    private static final int MIN_USERNAME_LENGTH = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę użytkownika:");
        String username = scanner.nextLine();

        System.out.println("Podaj wiek:");
        int age = Integer.parseInt(scanner.nextLine());

        if (isValidUserData(username, age)) {
            User user = createUser(username, age);
            System.out.println("Zarejestrowano!");
        } else {
            System.out.println("Błąd danych!");
        }
    }

    /**
     * Sprawdza, czy dane użytkownika są poprawne.
     */
    private static boolean isValidUserData(String username, int age) {
        return username.length() >= MIN_USERNAME_LENGTH && age >= MIN_AGE && age <= MAX_AGE;
    }

    /**
     * Tworzy i zwraca nowego użytkownika.
     */
    private static User createUser(String username, int age) {
        User user = new User();
        user.name = username;
        user.age = age;
        return user;
    }

    /**
     * Klasa reprezentująca użytkownika.
     */
    static class User {
        String name;
        int age;
    }
}
