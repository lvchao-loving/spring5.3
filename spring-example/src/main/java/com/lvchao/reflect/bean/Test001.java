package com.lvchao.reflect.bean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 10:09
 */
public class Test001 {
	private static final Log log = LogFactory.getLog("sdk.biz.err");

	@Test
	public void test01(){
	/*	log.info("{}", A.class.isAssignableFrom(B.class));
		log.info("{}", A.class.isAssignableFrom(A.class));
		log.info("{}", A.class.isAssignableFrom(C.class));*/
	}

	@Test
	public void test02(){
/*
		log.debug("{}", "debug 级别日志打印");
		log.info("{}", "info 级别日志打印");
		log.error("{}", "error 级别日志打印");*/


		log.debug( "debug 级别日志打印");
		log.info("info 级别日志打印");
		log.error("error 级别日志打印");

	}
}
