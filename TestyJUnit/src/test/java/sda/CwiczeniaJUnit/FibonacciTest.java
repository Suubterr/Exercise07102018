package sda.CwiczeniaJUnit;

import org.junit.Before;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FibonacciTest {
    private Fibonacci fbncc;

    @Before
    public void setup() {fbncc = new Fibonacci();}

    static Stream<Arguments> parameters() {
        return Stream.of(
                arguments(1,1)
                , arguments(2,1)
                , arguments(3,2)
                , arguments(4,3)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void fibonacciTest(int a, int b) {
        long result = fbncc.fibonacci(a);
        assertEquals(result,b);
    }
}
