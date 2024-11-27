import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionCalculatorTest {

    @Test
    public void testAdditionWithPositiveNumbers() {
        double number1 = 10.5;
        double number2 = 20.3;
        double expected = 30.8;

        double result = number1 + number2;

        assertEquals(expected, result, 0.0001, "Addition with positive numbers failed");
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        double number1 = -10.5;
        double number2 = -20.3;
        double expected = -30.8;

        double result = number1 + number2;

        assertEquals(expected, result, 0.0001, "Addition with negative numbers failed");
    }

    @Test
    public void testAdditionWithMixedNumbers() {
        double number1 = 10.5;
        double number2 = -5.5;
        double expected = 5.0;

        double result = number1 + number2;

        assertEquals(expected, result, 0.0001, "Addition with mixed numbers failed");
    }

    @Test
    public void testAdditionWithZero() {
        double number1 = 0;
        double number2 = 15.5;
        double expected = 15.5;

        double result = number1 + number2;

        assertEquals(expected, result, 0.0001, "Addition with zero failed");
    }
}
