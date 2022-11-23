package homework34.calculator.controller;

import homework34.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String getMain() {
        return calculatorService.getMain();
    }

    @GetMapping("plus")
    @ResponseBody
    public String sum(@RequestParam int num1, int num2) {
        return num1 + " + " + num2 + " = " + this.calculatorService.plus(num1, num2);
    }

    @GetMapping("minus")
    @ResponseBody
    public String dif(@RequestParam int num1, int num2) {
        return num1 + " - " + num2 + " = " + this.calculatorService.minus(num1, num2);
    }

    @GetMapping("multiply")
    @ResponseBody
    public String mult(@RequestParam int num1, int num2) {
        return num1 + " * " + num2 + " = " + this.calculatorService.multiply(num1, num2);
    }

    @GetMapping("divide")
    @ResponseBody
    public String div(@RequestParam int num1, int num2) {
        return num1 + " / " + num2 + " = " + this.calculatorService.divide(num1, num2);
    }


}
