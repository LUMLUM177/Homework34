package homework34.calculator.service;

import homework34.calculator.exception.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String getMain() {
        return "Добро пожаловать в калькулятор!";
    }

    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    public int minus(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public int divide(int number1, int number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new DivisionByZeroException("Делить на 0 нельзя!");
        }
        return number1 / number2;
    }
}
