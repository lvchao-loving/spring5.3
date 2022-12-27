package com.lvchao.mybatis.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;
import java.util.Set;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/24 12:12
 */
@Slf4j
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(MyScan.class.getName());
		String scanPackageName = (String) annotationAttributes.get("value");
		MyClassPathBeanDefinitionScanner scaner = new MyClassPathBeanDefinitionScanner(registry,true);
		Set<BeanDefinitionHolder> beanDefinitionHolders = scaner.doScan(scanPackageName);
		//a和T 替换成为fb
		for (BeanDefinitionHolder beanDefinitionHolder : beanDefinitionHolders) {
			AbstractBeanDefinition mapperBd = (AbstractBeanDefinition) beanDefinitionHolder.getBeanDefinition();
			String beanClassName = mapperBd.getBeanClassName();
			mapperBd.setBeanClass(MyFactoryBean.class);
			mapperBd.getPropertyValues().add("mapperInterface",beanClassName);
		}
	}
}
