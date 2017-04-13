package de.lv1871.dojo.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

	private List<Double> operands = new ArrayList<>();
	
	public void addOperand(Double... operands){
		this.operands.addAll(Arrays.asList(operands));
	}
	
	public double calculate(Operation operation){
		switch (operation) {
		case MAX:
			return operands.stream().max(Double::compareTo).get();
		case MIN:
			return operands.stream().min(Double::compareTo).get();
		case AVERAGE:
			return operands.stream().collect(Collectors.averagingDouble(Double::doubleValue));
		case SUM:
			return operands.stream().mapToDouble(Double::doubleValue).sum();
		default:
			throw new RuntimeException("Unknown operand");
		}
	}
	
}
