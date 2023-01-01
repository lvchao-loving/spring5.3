package com.lvchao.parse.bean.bean_method;

import com.lvchao.parse.bean.T;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/28 20:12
 */
@Slf4j(topic = "e")
public class V  {
	public V(){
		log.debug("create v");
	}

	@Bean
	public T t(){
		return new T();
	}
}
