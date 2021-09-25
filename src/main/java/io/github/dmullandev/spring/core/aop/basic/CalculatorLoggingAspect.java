package io.github.dmullandev.spring.core.aop.basic;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {
	private Logger LOG = Logger.getLogger(CalculatorLoggingAspect.class.getName());

	@Before("execution(* ArithmeticCalculator.multiplication(..))")
	public void logBefore() {
		LOG.info("Before multiplication method");
	}

	@After("execution(* ArithmeticCalculator.addition(..))")
	public void logAfter() {
		LOG.info("After addition method");
	}

	@AfterReturning
	public void logAfterReturning() {
		LOG.info("AfterReturning addition method");
	}
}
