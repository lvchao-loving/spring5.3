package com.lvchao.scan.other;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class H {

	@PostConstruct
	public void  init(){
		log.debug("h init");
	}
}
