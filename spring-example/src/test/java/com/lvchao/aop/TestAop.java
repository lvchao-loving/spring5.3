package com.lvchao.aop;

import com.lvchao.aop.advice.BeforeAdvice;
import com.lvchao.aop.config.AppConfig_Aop;
import com.lvchao.aop.proxy.ProxyInterface;
import com.lvchao.aop.proxy.ProxyInterfaceImpl;
import com.lvchao.aop.service.AService;
import com.lvchao.aop.service.subpackage.A_SubPackage;
import com.lvchao.environment.MyStandardEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * aop 测试类
 * </p>
 *
 * @author lvchao
 * @since 2022/12/30 17:47
 */
@Slf4j
public class TestAop {

	@Test
	public void test1(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.setEnvironment(new MyStandardEnvironment());
		applicationContext.register(AppConfig_Aop.class);
		applicationContext.refresh();
		AService aService = applicationContext.getBean(AService.class);
		aService.publicMethod();

		/*a.methodIntegerArgs(1);
		a.methodIntegerMultiArgs1(1,"a");
		a.methodIntegerMultiArgs2("a",1);*/
	}

	@Test
	public void test2(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig_Aop.class);
		A_SubPackage a_SubPackage = applicationContext.getBean(A_SubPackage.class);
		a_SubPackage.publicMethod();
		a_SubPackage.methodIntegerArgs(1);
		a_SubPackage.methodIntegerMultiArgs1(1,"a");
		a_SubPackage.methodIntegerMultiArgs2("a",1);
	}

	@Test
	public void test3(){
		ProxyFactory pf = new ProxyFactory();
		pf.setInterfaces(ProxyInterface.class);
		pf.addAdvice(new BeforeAdvice());
		pf.setTarget(new ProxyInterfaceImpl());
		//pf.setProxyTargetClass(true);
		// createAopProxy()  jdk  cglib
		ProxyInterface proxyInterface = (ProxyInterface) pf.getProxy();
		String method = proxyInterface.method("测试名称");
		log.info("method {}",method);
	}

	@Test
	public void test4(){
		System.out.println(null instanceof String);
		System.out.println("null" instanceof String);
		System.out.println("" instanceof String);
	}
}
