import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciCalculatorTest {

    private FibonacciCalculator fibonacciCalculator;

    @BeforeEach
    public void setUp() {
        fibonacciCalculator = new FibonacciCalculator();
    }

    // We are testing for 0 input, the first 7 fibonacci numbers and also the 25th
    @Test
    public void testFibonacci() {
        assertEquals(0, fibonacciCalculator.calculateFibonacci(0));
        assertEquals(1, fibonacciCalculator.calculateFibonacci(1));
        assertEquals(1, fibonacciCalculator.calculateFibonacci(2));
        assertEquals(2, fibonacciCalculator.calculateFibonacci(3));
        assertEquals(3, fibonacciCalculator.calculateFibonacci(4));
        assertEquals(5, fibonacciCalculator.calculateFibonacci(5));
        assertEquals(8, fibonacciCalculator.calculateFibonacci(6));
        assertEquals(13, fibonacciCalculator.calculateFibonacci(7));
        // I output an error message as an example
        assertEquals(75025, fibonacciCalculator.calculateFibonacci(25), "incorrectly calculated 25th fibonacci number");
    }

    // We are testing whether isInFibonacci() can recognize fibonacci numbers 
    // and numbers that are not in the fibonacci sequence
    @Test
    public void testIsInFibonacci() {
        assertTrue(fibonacciCalculator.isInFibonacci(5)); // 5 is part of the fibonacci sequence
        assertTrue(fibonacciCalculator.isInFibonacci(13)); // 13 is part of the fibonacci sequence
        assertFalse(fibonacciCalculator.isInFibonacci(4)); // 4 is not part of the fibonacci sequence
        assertFalse(fibonacciCalculator.isInFibonacci(343)); // 343 is not part of the fibonacci sequence
    }

}
