import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testFactorialZero() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    void testFactorialOne() {
        assertEquals(1, MathUtils.factorial(1));
    }

    @Test
    void testFactorialFive() {
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }
}
