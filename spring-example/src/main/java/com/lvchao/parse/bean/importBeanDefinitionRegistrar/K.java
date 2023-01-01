package com.lvchao.parse.bean.importBeanDefinitionRegistrar;

import lombok.extern.slf4j.Slf4j;
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
 * @since 2022/12/28 20:11
 */
@Slf4j(topic = "e")
public class K implements ImportBeanDefinitionRegistrar {
	public K(){
		log.debug("k  K虽然会被实例化但是不会存在单例池当中");
	}
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		log.debug("ImportBeanDefinitionRegistrar#registerBeanDefinitions");
	}
}