package com.lvchao.entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/26 15:35
 */
@Slf4j
@Component
public class B {
	public void showB(){
		log.info("showB ... {}",this);
	}
}
