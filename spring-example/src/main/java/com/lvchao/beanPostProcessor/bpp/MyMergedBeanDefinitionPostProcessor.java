package com.lvchao.beanPostProcessor.bpp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 17:05
 */
@Slf4j
// @Component
public class MyMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if (beanName.equals("a")) {
			log.info("MergedBeanDefinitionPostProcessor#postProcessMergedBeanDefinition ...beanName {}", beanName);
		}
	}

	@Override
	public void resetBeanDefinition(String beanName) {
		if (beanName.equals("a")) {
			log.info("MergedBeanDefinitionPostProcessor#resetBeanDefinition ...beanName {}", beanName);
		}
	}
}
