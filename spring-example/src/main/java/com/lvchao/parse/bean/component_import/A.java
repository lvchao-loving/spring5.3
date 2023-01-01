package com.lvchao.parse.bean.component_import;

import com.lvchao.parse.bean.P;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/27 23:51
 */
@Slf4j(topic = "e")
@Component
@Import(P.class)
public class A {
	public A(){
		log.debug("create a");
	}
}

