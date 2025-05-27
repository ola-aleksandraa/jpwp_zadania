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
        // Odpowiedź 1: 3 razy (3 osobne pętle for)
        System.out.println("Odpowiedź 1: Kod przechodzi po tablicy 3 razy, ponieważ są 3 oddzielne pętle.");

        // TODO 2: Jakie ryzyko wiąże się z powtarzaniem tej samej pętli logicznej?
        // Odpowiedź 2: Powtarzanie tej samej pętli zwiększa czas wykonania oraz ryzyko błędów
        // jeśli logika w pętli wymaga zmiany, trzeba ją poprawić w wielu miejscach,
        // co utrudnia utrzymanie kodu i zwiększa ryzyko niespójności.
        System.out.println("Odpowiedź 2: Powtarzanie pętli zwiększa czas wykonania i ryzyko błędów przy modyfikacjach.");

        // TODO 3: Czy wersja zoptymalizowana ma mniejsze zużycie pamięci?
        // Odpowiedź 3: Tak, bo zmniejszamy liczbę obiektów/pętli i przechowujemy wyniki w jednej strukturze.
        System.out.println("Odpowiedź 3: Tak, optymalizacja zmniejsza zużycie pamięci i poprawia wydajność.");

        // Użycie klasy pomocniczej do obliczenia statystyk
        StatisticsCalculator calculator = new StatisticsCalculator();
        StatisticsResult result = calculator.calculateStats(numbers);

        System.out.println("Maksymalna wartość: " + result.max);
        System.out.println("Minimalna wartość: " + result.min);
        System.out.println("Średnia wartość: " + result.average);
    }
}
//TODO 4: ZAMIEŃ TE 3 PETLE W JEDNĄ
// Klasa pomocnicza do obliczania statystyk tablicy
class StatisticsCalculator {

    public StatisticsResult calculateStats(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
            sum += number;
        }

        double average = (double) sum / numbers.length;
        return new StatisticsResult(min, max, average);
    }
}

// Klasa przechowująca wynik statystyczny
class StatisticsResult {
    public final int min;
    public final int max;
    public final double average;

    public StatisticsResult(int min, int max, double average) {
        this.min = min;
        this.max = max;
        this.average = average;
    }
}