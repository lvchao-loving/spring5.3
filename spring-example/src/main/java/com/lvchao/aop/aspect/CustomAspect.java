package com.lvchao.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 自定义前面
 * </p>
 *
 * @author lvchao
 * @since 2022/12/30 17:40
 */
@Component
@Aspect
@Slf4j(topic = "e")
public class CustomAspect {
	/**
	 * 1、execution：用于匹配方法执行 join points 连接点，最小粒度方法；可以精确到方法的返回值、参数个数、修饰符、参数类型等，在aop中主要使用。
	 * 2、within：该表达式的最小粒度为类，within与execution相比，粒度更大，仅能实现到包和接口、类级别。
	 * 3、args：args表达式的作用是匹配指定参数类型和指定参数数量的方法与包名和类名无关。
	 * 	说明：args同execution不同的地方在于： args匹配的是运行时传递给方法的参数类型，而 execution(* * (java.io.Serializable))匹配的是方法在声明时指定的方法参数类型
	 * 4、JDK代理指向接口和代理类proxy，cglib代理指向接口和子类(不使用proxy)。
	 * 5、target 指向接口和子类。
	 */

	// 匹配 com.lvchao.aop.target 包下任意接口和类的任意方法
	// @Pointcut("execution(* com.lvchao.aop.target.*.*(..))")
	public void executionPointCut1(){}

	// 匹配 com.lvchao.aop.target 包下任意的方法
	// @Pointcut("execution(* com.lvchao.aop.target.*(..))")
	public void executionPointCut2(){}

	// 匹配 com.lvchao.aop.target 包及其子包中任意的方法
	// @Pointcut("execution(* com.lvchao.aop.target..*.*(..))")
	public void executionPointCut3(){}

	// 匹配 com.lvchao.aop.target 包下任意接口和类的public修饰的方法
	// @Pointcut("execution(public * com.lvchao.aop.target.*.*(..))")
	public void executionPointCut4(){}

	// 匹配 com.lvchao.aop.target 包下任意接口和类的无参方法
	// @Pointcut("execution(* com.lvchao.aop.target.*.*())")
	public void executionPointCut5(){}

	// 匹配 com.lvchao.aop.target 包下任意接口和类的第一个参数为Integer类型的接口
	// @Pointcut("execution(* com.lvchao.aop.target.*.*(java.lang.Integer,..))")
	public void executionPointCut6(){}

	// 匹配 com.lvchao.aop.target 包下任意接口和类只有一个参数并且参数类型为Integer
	// @Pointcut("execution(* com.lvchao.aop.target.*.*(java.lang.Integer))")
	public void executionPointCut7(){}

	// 匹配任意的public方法
	// @Pointcut("execution(public * *(..))")
	public void executionPointCut8(){}

	// 匹配任意的以methodIntegerArg开头的方法
	// @Pointcut("execution(* methodIntegerArg*(..))")
	public void executionPointCut9(){}

	// 匹配任意的以methodIntegerArg开头的方法
	@Pointcut("execution(* methodIntegerArg*(..))")
	public void executionPointCut10(){}

	@Before("executionPointCut10()")
	public void adviceBefore(JoinPoint joinPoint){
		log.debug("当前执行方法-->" + ((MethodInvocationProceedingJoinPoint) joinPoint).getSignature().getName() + " , before aop");
	}
}
