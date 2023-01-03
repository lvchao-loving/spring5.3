package com.lvchao.aop.service.impl;

import com.lvchao.aop.service.AService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/1 15:16
 */
@Slf4j(topic = "e")
@Component
public class AServiceImpl implements AService {

	/**
	 * public 方法
	 */
	@Override
	public void publicMethod() {
		log.debug("A publicMethod");
	}

	/**
	 * int 单个参数类型
	 * @param i
	 */
	@Override
	public void methodIntegerArgs(Integer i) {
		log.debug("A methodIntegerArgs Integer:[{}]",i);
	}

	/**
	 * 多个参数方法1
	 * @param i
	 * @param s
	 */
	@Override
	public void methodIntegerMultiArgs1(Integer i, String s) {
		log.debug("A methodIntegerMultiArgs integer:[{}] string[{}]",i,s);
	}

	/**
	 * 多个参数方法2
	 * @param i
	 * @param s
	 */
	@Override
	public void methodIntegerMultiArgs2(String s,Integer i) {
		log.debug("A methodIntegerMultiArgs integer:[{}] string[{}]",i,s);
	}
}
