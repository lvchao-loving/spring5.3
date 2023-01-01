package com.lvchao.parse.importBeanDefinitionRegistrar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/29 18:03
 */
@Slf4j(topic = "e")
@Import(E.class)
public class C {

	public C(){
		log.debug("create cc");
	}

}