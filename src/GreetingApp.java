
/*
    ZADANIE 4:
    Uprość i zoptymalizuj kod zgodnie z zasadą KISS, zastap powtarzające się instrukcje if-else HashMapą (dodajemy link
    jeżeli nie pamiętasz jak ona działa: https://www.w3schools.com/java/java_hashmap.asp). ZAchowaj wszytskie warunki poprawmego
    pisania kodu (unikaj powtórzeń, zachowaj poprawne naazwy zmiennych).

 */

public class GreetingApp {

    public static void main(String[] args) {
        String language = "fr";

        // TODO 1: STWÓRZ OSOBNA METODĘ I ZAMIEŃ WARUNKI NA HASHMAPE

        if (language.equals("en")) {
            System.out.println("Hello!");
        } else if (language.equals("pl")) {
            System.out.println("Cześć!");
        } else if (language.equals("de")) {
            System.out.println("Hallo!");
        } else if (language.equals("es")) {
            System.out.println("¡Hola!");
        } else if (language.equals("fr")) {
            System.out.println("Bonjour!");
        } else {
            System.out.println("Unknown language");
        }
    }

}
