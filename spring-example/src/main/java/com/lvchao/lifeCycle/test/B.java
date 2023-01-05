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
 * @since 2023/1/3 17:47
 */
@Slf4j
@Service
public class B {

	@Autowired
	private A a;

	public B() {
		log.info("B 的无参构造方法...{}", this);
	}

	/**
	 * 测试方法
	 */
	public void showB() {
		log.info("B.......showB........{}", a);
	}
}
