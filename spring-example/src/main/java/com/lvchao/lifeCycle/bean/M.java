package com.lvchao.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class M {

	@Autowired
	private N n;

	public M(){
		log.debug("m create ");
	}

	public void printf(){
		log.debug("printf");
	}
}
