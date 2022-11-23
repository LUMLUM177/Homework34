package homework34.calculator.service;

import homework34.calculator.exception.DivisionByZeroException;
import org.junit.jupiter.api.Test;

import static homework34.calculator.service.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne () {
        int result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenSumTwoAndOne () {
        int result = calculatorService.plus(TWO, ONE);
        assertEquals(TWO + ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenMinusOneAndOne () {
        int result = calculatorService.minus(ONE, ONE);
        assertEquals(ONE - ONE, result);
    }

    @Test
    public void shouldReturnThreeWhenMinusTwoAndOne () {
        int result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
    public void shouldReturnOneWhenMultiplyOneAndOne () {
        int result = calculatorService.multiply(ONE, ONE);
        assertEquals(ONE * ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenMultiplyTwoAndOne () {
        int result = calculatorService.multiply(TWO, ONE);
        assertEquals(TWO * ONE, result);
    }

    @Test
    public void shouldReturnTwoWhenDivideTwoAndOne () {
        int result = calculatorService.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);
    }

    @Test
    public void shouldReturnOneWhenDivideOneAndOne () {
        int result = calculatorService.divide(ONE, ONE);
        assertEquals(ONE / ONE, result);
    }

    @Test
    public void shouldThrowDivisionByZeroExceptionWhenDivideByZero() {
        assertThrows(DivisionByZeroException.class,() -> calculatorService.divide(ONE, ZERO));
    }

}