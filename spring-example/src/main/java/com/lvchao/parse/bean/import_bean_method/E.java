package com.lvchao.parse.bean.import_bean_method;

import com.lvchao.parse.bean.F;
import com.lvchao.parse.bean.O;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/28 20:10
 */
@Slf4j(topic = "e")
@Import(F.class)
public class E {
	public E() {
		log.debug("create e");
	}

	@Bean
	public O o() {
		return new O();
	}
}

