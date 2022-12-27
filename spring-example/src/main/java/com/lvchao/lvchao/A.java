package com.lvchao.lvchao;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/2 10:46
 */
@Slf4j
public class A implements B{

	@Override
	public void setC(C c) {
		this.c = c;
	}

	private C c;

	public C getC() {
		return c;
	}

	public A() {
		System.out.println("A初始化了");
	}

	public void showA(){
		log.info("showA ... {}",c);
	}

}