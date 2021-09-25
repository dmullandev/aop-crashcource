package io.github.dmullandev.spring.core.aop.basic;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CalculatorLoggingAspect {
	private Logger LOG = Logger.getLogger(CalculatorLoggingAspect.class.getName());

	// @Before("execution(* ArithmeticCalculator.multiplication(..))")
	public void logBefore() {
		LOG.info("Before multiplication method");
	}

	// @After("execution(* ArithmeticCalculator.addition(..))")
	public void logAfter() {
		LOG.info("After addition method");
	}

	// @AfterReturning(pointcut = "execution(* ArithmeticCalculator.addition(..))",
	// returning = "result")
	public void logAfterReturning(Object result) {
		LOG.info("AfterReturning addition method");
		LOG.info("Addition Result is " + result);
	}

	@AfterThrowing(pointcut = "execution(* ArithmeticCalculator.division(..))", throwing = "exception")
	public void logAfterThrowing(IllegalAccessException exception) {
		LOG.info("AfterThrowing addition method");
		LOG.info("Exception is " + exception.getMessage());
	}

	// @Before("execution(* ArithmeticCalculator.multiplication(..))")
	public void joinPointInfo(JoinPoint joinPoint) {
		LOG.info("joinPointInfo Advice");
		LOG.info("Kind: " + joinPoint.getKind());
		LOG.info("Method Signature" + joinPoint.getSignature().getName());
		LOG.info("Declaring Type name: " + joinPoint.getSignature().getDeclaringTypeName());
		LOG.info("Method Arguments: " + Arrays.toString(joinPoint.getArgs()));
		LOG.info("Target Objects: " + joinPoint.getTarget());
		LOG.info("This objects: " + joinPoint.getThis());
	}

	@Around("execution(* ArithmeticCalculator.multiplication(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		LOG.info("Around Advice");
		LOG.info("Method arguments: " + Arrays.toString(pjp.getArgs()));
		Object result;
		try {
			result = pjp.proceed(new Object[] { 5.8, 9.2 });
		} catch(Throwable th) {
			throw th;
		}
		
		return result;
	}
}
