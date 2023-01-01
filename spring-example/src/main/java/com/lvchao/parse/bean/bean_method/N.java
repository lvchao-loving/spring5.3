package com.lvchao.parse.bean.bean_method;

import com.lvchao.parse.bean.P;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/28 20:11
 */
@Slf4j(topic = "e")
public class N {
	public N(){
		log.debug("create n");
	}

	@Bean
	public P p(){
		return new P();
	}
}

