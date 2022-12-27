package com.lvchao.scan.bean;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;


@Slf4j
public class E implements D{
	@PostConstruct
	public void  init(){
		log.debug("E init");
	}
}
