package com.lvchao.beanPostProcessor.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 13:52
 */
@Slf4j
@Data
@Component
public class A implements InitializingBean {

	private String name;

	public A(){
		log.info("A 的无参构造方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("A...InitializingBean#afterPropertiesSet...");
	}

	@PostConstruct
	public void AnnotationInit(){
		log.info("A...PostConstruct...");
	}
}
