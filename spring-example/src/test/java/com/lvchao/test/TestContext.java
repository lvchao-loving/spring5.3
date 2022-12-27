package com.lvchao.test;

import com.lvchao.context.bfpp.B;
import com.lvchao.context.bfpp.C;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/29 11:14
 */
@Slf4j
public class TestContext {

	@Test
	public void test01(){

		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext();
		context.addBeanFactoryPostProcessor(new B());
		context.addBeanFactoryPostProcessor(new C());
	//	context.register(ContextConfig.class);
		context.refresh();
	//	System.out.println(context.getBean(X.class));

	}

	@Test
	public void test02(){
		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext();
		context.scan("com.lvchao.context.bean");
		context.refresh();

	}

	@Test
	public void test03(){
		log.info("测试");
	}
}
