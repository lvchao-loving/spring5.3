package com.lvchao.enhancer.config;

import com.lvchao.enhancer.bean.X;
import com.lvchao.enhancer.bean.Y;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lvchao.enhancer.bean")
@Slf4j(topic = "e")
public class Appconfig {

	@Bean
	public X x(){
		log.debug("Appconfig#x() invoke");
		return  new X();
	}

	@Bean
	public Y y(){
		log.debug("Appconfig#y() invoke");
		return  new Y();
	}

}
