package com.lvchao.lvchao;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/2 10:49
 */
public class TestLvchao {
	@Test
	public void test01() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AutomaticInjectionPostProcessor.class);
		context.register(A.class);
		context.register(B.class);
		context.refresh();
	}

	@Test
	public void test02() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AutomaticInjectionPostProcessor.class);
		context.register(A.class);
		context.register(C.class);
		context.refresh();

		A a = context.getBean(A.class);
		a.showA();
	}
}
