package com.lvchao.environment;

import com.lvchao.environment.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

/**
 * <p>
 * 环境变量配置
 * </p>
 *
 * @author lvchao
 * @since 2022/12/27 21:24
 */
@Slf4j
public class TestEnvironment {
	@Test
	public void test1() throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		// 从 classpath 路径下读取配置文件，并添加到 environment 环境中
		ResourcePropertySource resourcePropertySource = new ResourcePropertySource("classpath:environment.properties");
		environment.getPropertySources().addLast(resourcePropertySource);

		log.info(environment.getProperty("lvchao.name"));
		log.info(environment.getProperty("lvchao.age"));
	}
}
