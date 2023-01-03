package com.lvchao.lifeCycle.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/3 11:15
 */
@Slf4j
@Service
public class A {

	@Autowired
	private B b;

	public A() {
		log.info("A 的无参构造方法");
	}

	/**
	 * 测试方法
	 */
	public void showA() {
		log.info("A.......showA........{}", b);
	}
}
