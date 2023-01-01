package com.lvchao.parse;

import com.lvchao.parse.config.AppConfig;
import com.lvchao.parse.config.AppConfig_ImportBeanDefinitionRegister;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/27 23:53
 */
@Slf4j(topic = "e")
public class TestParse {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.asList(beanDefinitionNames).forEach(System.out::println);
	}

	@Test
	public void test02(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig_ImportBeanDefinitionRegister.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.asList(beanDefinitionNames).forEach(System.out::println);
	}

}
