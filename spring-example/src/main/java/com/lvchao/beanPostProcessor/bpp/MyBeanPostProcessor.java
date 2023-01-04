package com.lvchao.beanPostProcessor.bpp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 14:01
 */
@Slf4j
// @Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("a")) {
			log.info("BeanPostProcessor#postProcessBeforeInitialization ...beanName {}", beanName);
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("a")) {
			log.info("BeanPostProcessor#postProcessAfterInitialization ...beanName {}", beanName);
		}
		return bean;
	}
}
