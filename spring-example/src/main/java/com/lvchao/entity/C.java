package com.lvchao.entity;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 测试注入模型
 * </p>
 *
 * @author lvchao
 * @since 2022/11/26 19:11
 */
@Slf4j
public class C {

	private D d;

	public C(){
		log.info("无参构造方式");
	}

	public C(D d){
		log.info("构造函数 -> d 参数");
	}

	public C(E d){
		log.info("构造函数 -> e 参数");
	}
}
