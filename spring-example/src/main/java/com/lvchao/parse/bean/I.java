package com.lvchao.parse.bean;

import org.springframework.context.annotation.Bean;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/28 20:11
 */
public interface I {
	@Bean
	default S s(){
		return new S();
	}
}

