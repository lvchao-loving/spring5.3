package com.lvchao.parse.config;

import com.lvchao.parse.bean.component.B;
import com.lvchao.parse.bean.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * 配置类解析部分源码测试类
 * </p>
 *
 * @author lvchao
 * @since 2022/12/27 23:49
 */
@Configuration
@ComponentScan("com.lvchao.parse.bean")
public class AppConfig {
	@Import(C.class)
	class MemberAppConfig1{
	}

	/*@Bean
	public B getB(){
		return new B();
	}*/
}



