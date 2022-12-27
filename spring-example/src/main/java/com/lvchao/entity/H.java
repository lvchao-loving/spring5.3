package com.lvchao.entity;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/25 17:18
 */
@Slf4j
public class H {

	public class J{

		public J(H h){}

		public void showHJ(){
			log.info("showHJ...");
		}
	}

	public void showH(){
		log.info("showH...");
	}
}
