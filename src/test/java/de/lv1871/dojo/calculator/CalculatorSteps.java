package de.lv1871.dojo.calculator;

import static org.junit.Assert.assertEquals;

import java.util.stream.IntStream;

import cucumber.api.java8.En;

public class CalculatorSteps implements En {

	private Operation operation;
	private Calculator calc = new Calculator();

	public CalculatorSteps() {
		Given("^user adds (.*) times the value (.*)$", (Integer times, Double value) -> {
		    IntStream.range(1, times).forEach(v -> calc.addOperand(value));
		});

		When("^(.*) is calculated$", (Operation op) -> {
			this.operation = op;
		});

		Then("^the result should be: (.*)", (Double result) -> {
			assertEquals(result, Double.valueOf(calc.calculate(operation)));
		});
	}

}
