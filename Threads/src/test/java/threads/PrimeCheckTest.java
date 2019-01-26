package threads;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckTest {

    @ParameterizedTest
    @MethodSource(value = "getPrimeNumbers")
    void isPrime(long number, boolean goodResult) {
        PrimeCheck check = new PrimeCheck();
        boolean result = check.isPrime(number);
        Assertions.assertEquals(result,goodResult);
    }

    static Stream<Arguments> getPrimeNumbers() {
        return Stream.of(
                Arguments.of(3,true)
                , Arguments.of(4,false)
                , Arguments.of(5,true)
                , Arguments.of(6,false)
                , Arguments.of(7,true)
        );
    }
}