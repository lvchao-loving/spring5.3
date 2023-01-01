package com.lvchao.parse.importBeanDefinitionRegistrar.beanDefinitionRegistryPostProcessor;

import com.lvchao.parse.importBeanDefinitionRegistrar.C;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/29 21:25
 */
public class X implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		registry.registerBeanDefinition("c", new AnnotatedGenericBeanDefinition(C.class));
	}
}
