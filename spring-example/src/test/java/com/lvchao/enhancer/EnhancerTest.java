package com.lvchao.enhancer;

import com.lvchao.enhancer.config.Appconfig;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/26 11:07
 */
public class EnhancerTest {
	@Test
	public void defaultTest(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

		/*BeanDefinition appconfig = context.getBeanDefinition("appconfig");
		Appconfig bean = context.getBean(Appconfig.class);
		System.out.println("");*/

		ConfigurableEnvironment environment = context.getEnvironment();
		Map<String, Object> systemProperties = environment.getSystemProperties();
		for (String key:systemProperties.keySet()) {
			System.out.println(key + "     " + systemProperties.get(key));
		}
	}
}
