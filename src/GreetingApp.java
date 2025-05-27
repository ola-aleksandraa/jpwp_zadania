
/*
    ZADANIE 4:
    Uprość i zoptymalizuj kod zgodnie z zasadą KISS, zastap powtarzające się instrukcje if-else HashMapą (dodajemy link
    jeżeli nie pamiętasz jak ona działa: https://www.w3schools.com/java/java_hashmap.asp). ZAchowaj wszytskie warunki poprawmego
    pisania kodu (unikaj powtórzeń, zachowaj poprawne naazwy zmiennych).

 */
import java.util.HashMap;
import java.util.Map;

public class GreetingApp {

    public static void main(String[] args) {
        String languageCode = "fr";
        printGreeting(languageCode);
    }

    /**
     * Wypisuje powitanie na podstawie kodu języka.
     */
    private static void printGreeting(String languageCode) {
        Map<String, String> greetings = new HashMap<>();
        greetings.put("en", "Hello!");
        greetings.put("pl", "Cześć!");
        greetings.put("de", "Hallo!");
        greetings.put("es", "¡Hola!");
        greetings.put("fr", "Bonjour!");

        String greeting = greetings.getOrDefault(languageCode, "Unknown language");
        System.out.println(greeting);
    }
}
