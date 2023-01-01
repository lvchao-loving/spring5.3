package com.lvchao.aop;

import com.lvchao.aop.config.AppConfig_Aop;
import com.lvchao.aop.target.A;
import com.lvchao.aop.target.subpackage.A_SubPackage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
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
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig_Aop.class);
		A a = applicationContext.getBean(A.class);
		a.publicMethod();
		a.methodIntegerArgs(1);
		a.methodIntegerMultiArgs1(1,"a");
		a.methodIntegerMultiArgs2("a",1);
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
		log.info("test3");
	}
}
