package com.lvchao.scan.bean;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;


@Slf4j
public class F implements D{
	@PostConstruct
	public void  init(){
		log.debug("f init");
	}
}
