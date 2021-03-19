import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    static Fibonacci fibonacci;

    @BeforeEach
    public  void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldCalculateFibonacciNumberWithIntInput() {
        assertEquals(5, fibonacci.fibonacci(5));
    }

    @Test
    public void shouldCalculateFibonacciNumberWhenInputIs0() {
        assertEquals(0, fibonacci.fibonacci(0));
    }

    @Test
    public void shouldCalculateFibonacciNumberInputIsNegative() {
        assertEquals(0, fibonacci.fibonacci(-1));
    }

    @Test
    public void shouldCalculateFibonacciNumberWhenInputIsTooBig() {
        assertEquals(0, fibonacci.fibonacci(50));
    }

}

