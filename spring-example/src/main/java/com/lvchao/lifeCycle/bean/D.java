package com.lvchao.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
// @Component
public class D implements F {

	@Autowired
	private E e;

	public E getE() {
		return e;
	}

	@Override
	public void m0() {
		log.debug("m0-D");
	}
}

