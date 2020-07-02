import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Task2 {
    public static int subtract(int firstNumber, int secondNumber) {
        int result = (firstNumber - secondNumber);
        if ((secondNumber >= 0) && (secondNumber <= firstNumber)) {
            return result;
        } else {
            return -1;
        }
    }

    @Test
    @DisplayName("Positive test: verify the condition ")
    public void positiveNumbers() {
        Assertions.assertEquals(100, subtract(100, 0));
    }

    @ParameterizedTest(name = "Test value {0} > value {1} and are positive numbers")
    @CsvSource(value = {"-1, -10", "-1, 1", "2, -50", "2, 48"})
    void negativeTestWithValueSources(int firstValue, int secondValue) {

        MatcherAssert.assertThat(subtract(firstValue, secondValue), Matchers.equalTo(-1));
    }
}
