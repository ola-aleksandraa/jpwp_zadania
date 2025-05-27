/*
    Zadanie 2:
    Funkcja obsługująca zamówienie klienta łamie zasadę pojedynczej odpowiedzialności.
    Popraw:
    - Podziel kod na metody: wyświetlanie, sumowanie, formatowanie danych,
    - Popraw nazwy zmiennych,
    - Usuń powtórzenia logiczne (np. pętla dla każdej akcji),
    - Zachowaj spójność formatowania.
*/

import java.util.*;

public class OrderSystem {

    public static void main(String[] args) {
        List<String[]> products = new ArrayList<>();
        products.add(new String[]{"Jabłko", "3", "2.5"});
        products.add(new String[]{"Pomarańcza", "2", "4.0"});

        System.out.println("Zamówienie:");
        double total = 0;
        for (String[] p : products) {
            System.out.println(p[0] + " x" + p[1]);
            total += Integer.parseInt(p[1]) * Double.parseDouble(p[2]);
        }
        System.out.println("SUMA: " + total);
    }
}

