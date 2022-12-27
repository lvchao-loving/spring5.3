package com.lvchao.scan.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@ComponentScan("com.lvchao.scan.other")
@Slf4j
public class Y {

	@PostConstruct
	public void  init(){
		log.debug("y init");
	}


	@Bean
	public Z z(){
		return  new Z();
	}
}
