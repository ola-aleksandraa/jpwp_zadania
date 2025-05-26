
/*
    ZADANIE 2
    Eliminacja "magicznych liczb" - popraw kod zgodnie z zadadami poprwnego programownaia.
 */
public class StudentGrader {
    private static final int MIN_PASS_SCORE = 60;
    private static final int MAX_SCORE = 90;

    public String grade(int score) {
        if (score >= MAX_SCORE) {
            return "A";
        } else if (score >= MIN_PASS_SCORE) {
            return "B";
        } else {
            return "F";
        }
    }
}

