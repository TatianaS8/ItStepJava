import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Multiply Test")
public class Task1 {


    public static double multiply(double firstNumber, double secondNumber) {
        double prod = (firstNumber * secondNumber);
        if ((firstNumber >= 0 && firstNumber <= 100) && (secondNumber >= 0 && secondNumber <= 100)) {
            return prod;
        } else {
            return 0;
        }
    }

    @Test
    @DisplayName("Positive test: verify the range ")
    public void numbersFromTheRange() {
        Assertions.assertEquals(100, multiply(1, 100));
    }

    @Test
    @DisplayName("Negative test: verify the range ")
    public void numbersOutsideTheRange() {
        Assertions.assertEquals(0, multiply(-1, 100));
    }

    @ParameterizedTest(name = "Test value {0} and {1} in the given range 0-100")
    @CsvSource(value = {"-1, 101", "101, -1", "-1, 50", "101, 48", "53, -6", "64, 200"})
    void negativeTestWithValueSources(double firstValue, double secondValue) {
        // Assertions.assertEquals(0,multiply(firstValue, secondValue));
        MatcherAssert.assertThat(multiply(firstValue, secondValue), Matchers.equalTo(0d));
    }
}
