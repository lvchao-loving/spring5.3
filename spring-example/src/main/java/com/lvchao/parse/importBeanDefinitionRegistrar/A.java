package com.lvchao.parse.importBeanDefinitionRegistrar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/29 18:02
 */
@Slf4j(topic = "e")
@Component
@Import({D.class})
public class A {

	public A(){
		log.debug("create a");
	}

}
