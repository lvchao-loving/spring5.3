package com.lvchao.reflect.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/2 14:08
 */
@Data
@Slf4j
public class B {

	public B(){
		log.info("B的无参构造函数...");
	}

	private String name;
	private Integer age;
}
