package com.lvchao.aop.service.subpackage;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/31 17:35
 */
@Slf4j(topic = "e")
@Component
public class A_SubPackage {
	/**
	 * protected 方法
	 */
	protected void protectedMethod() {
		log.debug("A_SubPackage publicMethod");
	}

	/**
	 * public 方法
	 */
	public void publicMethod() {
		log.debug("A_SubPackage publicMethod");
	}

	/**
	 * int 单个参数类型
	 * @param i
	 */
	public void methodIntegerArgs(Integer i) {
		log.debug("A_SubPackage methodIntegerArgs Integer:[{}]",i);
	}

	/**
	 * 多个参数方法1
	 * @param i
	 * @param s
	 */
	public void methodIntegerMultiArgs1(Integer i, String s) {
		log.debug("A_SubPackage methodIntegerMultiArgs integer:[{}] string[{}]",i,s);
	}

	/**
	 * 多个参数方法2
	 * @param i
	 * @param s
	 */
	public void methodIntegerMultiArgs2(String s,Integer i) {
		log.debug("A_SubPackage methodIntegerMultiArgs integer:[{}] string[{}]",i,s);
	}
}

