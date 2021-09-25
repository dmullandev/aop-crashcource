package io.github.dmullandev.spring.core.aop.basic;

/**
 * Calculator Interface
 * 
 * @author dmullandev
 *
 */
public interface IBasicCalculator {

	/**
	 * Add two numbers
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	double addition(double number1, double number2);

	/**
	 * Subtract two numbers
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	double subtraction(double number1, double number2);

	/**
	 * Multiply two numbers
	 * @param number1
	 * @param number2
	 * @return
	 */
	double multiplication(double number1, double number2);

	/**
	 * Divide two numbers
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	double division(double number1, double number2);
}
