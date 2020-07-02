import com.itstep.Today.DividedException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Task3 {
    public double divide(double firstNumber, double secondNumber) throws DividedException {
        double result = (firstNumber / secondNumber);
        if (secondNumber > 0 && secondNumber <= firstNumber) {
            return result;
        }
        if (secondNumber == 0)
            throw new DividedException();
        return 0;
    }

    @Test
    @DisplayName("Positive test: verify condition ")
    public void positiveTestDividedNumbers() throws DividedException {
        Assertions.assertEquals(100, divide(100, 1));
    }

    @ParameterizedTest(name = "Test value {0} > value {1} and are positive numbers")
    @CsvSource(value = {"-1, -10", "-1, 1", "2, -50", "2, 48"})
    void negativeTestWithDivided(double firstValue, double secondValue) throws DividedException {
        Assertions.assertEquals(0, divide(firstValue, secondValue));

        // MatcherAssert.assertThat(divide(firstValue,secondValue), Matchers.equalTo(0d));
    }

}
