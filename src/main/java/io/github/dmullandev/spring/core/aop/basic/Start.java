package io.github.dmullandev.spring.core.aop.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);
		appContext.getBean("arithmeticCalculator", IBasicCalculator.class).multiplication(2, 5);
		appContext.getBean("arithmeticCalculator", IBasicCalculator.class).addition(2, 9);
	}

}
