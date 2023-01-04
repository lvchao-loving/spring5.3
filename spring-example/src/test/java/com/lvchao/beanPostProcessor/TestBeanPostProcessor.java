package com.lvchao.beanPostProcessor;

import com.lvchao.beanPostProcessor.bean.A;
import com.lvchao.beanPostProcessor.config.AppConfigBeanPostProcessor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 测试类
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 13:49
 */
@Slf4j
public class TestBeanPostProcessor {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigBeanPostProcessor.class);
		A a = applicationContext.getBean(A.class);
		a.setName("吕超");
		log.info(a.toString());
	}
}
