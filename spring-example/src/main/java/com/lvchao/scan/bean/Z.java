package com.lvchao.scan.bean;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;

@Slf4j
public class Z {

	@PostConstruct
	public void init() {
		log.debug("z init");
	}
}
