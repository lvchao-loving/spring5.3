package com.lvchao.visitor.bean;

import com.lvchao.visitor.util.VisitorAnno;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j(topic = "e")
@VisitorAnno
public class B implements C{

	static {
		log.debug("---------------");
	}
}
