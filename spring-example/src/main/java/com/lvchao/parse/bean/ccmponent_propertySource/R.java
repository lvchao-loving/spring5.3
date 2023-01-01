package com.lvchao.parse.bean.ccmponent_propertySource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/28 20:12
 */
@Component
@PropertySource("classpath:application.properties")
@Slf4j(topic = "e")
public class R {
	@Value("${k1}")
	String k1;

	@PostConstruct
	public void init(){
		log.debug("k1:[{}]",k1);
	}
}
