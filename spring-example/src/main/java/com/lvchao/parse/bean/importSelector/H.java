package com.lvchao.parse.bean.importSelector;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/28 20:10
 */
@Slf4j(topic = "e")
public class H implements ImportSelector {
	public H() {
		log.debug("create h  不会存在单例池当中");
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.lvchao.parse.bean.Z", "com.lvchao.parse.bean.X"};
	}
}
