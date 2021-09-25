package io.github.dmullandev.spring.core.aop.basic;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculator implements IBasicCalculator {


	public double addition(double number1, double number2) {
		double result = number1 + number2;
		System.out.println(result);
		return result;
	}

	public double subtraction(double number1, double number2) {
		double result = number1 - number2;
		System.out.println(result);
		return result;
	}

	public double multiplication(double number1, double number2) {
		double result = number1 * number2;
		System.out.println(result);
		return result;
	}

	public double division(double number1, double number2) {
		if (number2 == 0)
			throw new IllegalArgumentException("Divisor can't be zero");
		double result = number1 / number2;
		System.out.println(result);
		return result;
	}

}
