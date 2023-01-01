package com.lvchao.parse.bean.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/28 13:32
 */
@Slf4j(topic = "e")
@Component
public class B {
	public B(){
		log.debug("create b");
	}
}
