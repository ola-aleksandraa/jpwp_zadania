/*
    ZADANIE 3:
    Program analizuje tablicę liczb całkowitych i wypisuje wartości minimalną,
    maksymalną oraz średnią. Zoptymalizuj kod tak, aby wykonać obliczenia w jednej pętli zamiast trzech, wydziel logikę
    do osobnej klasy/metody, dodaj odpowiedzi na pytania dotyczące działania kodu jako komentarze.
*/

public class StatsApp {

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4, 10, 5};

        // TODO 1: Ile razy poniższy kod przechodzi po tablicy i dlaczego?
        System.out.println("Odpowiedź 1: Kod przechodzi po tablicy <> razy, ponieważ <>");

        // TODO 2: Jakie ryzyko wiąże się z powtarzaniem tej samej pętli logicznej?
        System.out.println("Odpowiedź 2: <>");

        // TODO 3: Czy wersja zoptymalizowana ma mniejsze zużycie pamięci?
        System.out.println("Odpowiedź 3: <>");

        //TODO 4: ZAMIEŃ TE 3 PETLE W JEDNĄ
        // Klasa pomocnicza do obliczania statystyk tablicy

        // Znajdź maksymalną wartość (pierwsza pętla)
        int maxValue = numbers[0];
        for (int currentNumber : numbers) {
            if (currentNumber > maxValue) {
                maxValue = currentNumber;
            }
        }

        // Znajdź minimalną wartość (druga pętla)
        int minValue = numbers[0];
        for (int currentNumber : numbers) {
            if (currentNumber < minValue) {
                minValue = currentNumber;
            }
        }

        // Oblicz sumę i średnią (trzecia pętla)
        int totalSum = 0;
        for (int currentNumber : numbers) {
            totalSum += currentNumber;
        }
        double averageValue = (double) totalSum / numbers.length;

        // TODO 5: Użycie klasy pomocniczej do obliczenia statystyk
        System.out.println("Maksymalna wartość: " + maxValue);
        System.out.println("Minimalna wartość: " + minValue);
        System.out.println("Średnia wartość: " + averageValue);
    }

}