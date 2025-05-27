
/*
    ZADANIE 2:
    Kod obsługuje rejestrację użytkowników, ale jest nieczytelny i nieczyści spełnia zasad SRP.
    Popraw: nazwy zmiennych, klas i metod, przenieś walidację i tworzenie użytkownika do osobnych metod, zamień
    magiczne liczby na stałe, dodaj formatowanie i komentarze tam, gdzie potrzebne.
*/

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        // TODO: ZMIEŃ NAZWY ZMIENNYCH JEŻELI UWAŻASZ ŻE KOD JEST NIEZROZUMIAŁY DLA INNYCH
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj nazwę użytkownika:");
        String a = s.nextLine();
        System.out.println("Podaj wiek:");
        int b = Integer.parseInt(s.nextLine());

        // TODO: ZAMIAST "MAGICZNYCH LICZB" REPREZENTUJĄCYCH PRZEDZIAŁY WIEKOWE UŻYJ STAŁYCH
        if (b > 12 && b < 100 && a.length() > 3) {
            User u = new User();
            u.n = a;
            u.a = b;
            System.out.println("Zarejestrowano!");
        } else {
            System.out.println("Błąd danych!");
        }

        // TODO: WYDZIEL OSOBNO TWORZENIE UZYTKOWNIKA ORAZ JEGO WALIDACJE (CZY MA ODPOWIEDNI WIEK)

    }

    static class User {
        String n;
        int a;
    }
}
