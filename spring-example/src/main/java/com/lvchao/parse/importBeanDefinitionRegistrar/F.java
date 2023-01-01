package com.lvchao.parse.importBeanDefinitionRegistrar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j(topic = "e")
public class F implements ImportSelector {
	public F() {
		log.debug("create h  不会存在单例池当中");
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.lvchao.parse.importBeanDefinitionRegistrar.B"};
	}
}
