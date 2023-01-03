package com.lvchao.aop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/31 17:18
 */

public interface AService {

	/**
	 * public 方法
	 */
	void publicMethod();

	/**
	 * int 单个参数类型
	 * @param i
	 */
	void methodIntegerArgs(Integer i);

	/**
	 * 多个参数方法1
	 * @param i
	 * @param s
	 */
	void methodIntegerMultiArgs1(Integer i, String s);

	/**
	 * 多个参数方法2
	 * @param i
	 * @param s
	 */
	void methodIntegerMultiArgs2(String s,Integer i);
}
