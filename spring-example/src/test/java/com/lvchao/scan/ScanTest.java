package com.lvchao.scan;

import com.lvchao.config.ComponentScanConfig;
import com.lvchao.scan.config.ScanConfig;
import com.lvchao.scan.util.MyBeanNameGenerator;
import com.lvchao.scan.util.MySpringInterfaceScaner;
import com.lvchao.scan.util.ScanBeanDefinitionRegistyPostProcessor;
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
 * @since 2022/12/8 20:20
 */
@Slf4j
public class ScanTest {

	@Test
	public void defaultScan(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.asList(beanDefinitionNames).forEach(item->{
			System.out.println(item);
		});
	}

	@Test
	public void interfaceScan(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.addBeanFactoryPostProcessor(new ScanBeanDefinitionRegistyPostProcessor());
		applicationContext.refresh();
	}


	@Test
	public void customBeanNameTest(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.setBeanNameGenerator(new MyBeanNameGenerator());
		applicationContext.scan("com.lvchao.scan.bean");
		applicationContext.refresh();

		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		Arrays.asList(beanDefinitionNames).forEach(item->{
			System.out.println(item);
		});
	}
}
