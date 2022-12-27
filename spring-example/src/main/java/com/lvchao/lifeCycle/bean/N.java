package com.lvchao.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class N implements InitializingBean {

	public N() {
		log.debug("n create ");
	}

	// 半成品
	@Autowired
	private M m;

	// N 初始化回调
	@Override
	public void afterPropertiesSet() throws Exception {
		m.printf();
	}
}
