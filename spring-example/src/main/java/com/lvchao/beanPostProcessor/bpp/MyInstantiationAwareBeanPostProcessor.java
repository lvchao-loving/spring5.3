package com.lvchao.beanPostProcessor.bpp;

import com.lvchao.beanPostProcessor.bean.A;
import com.lvchao.beanPostProcessor.interceptor.AMethodInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 14:12
 */
@Slf4j
// @Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("a")) {
			log.info("InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation ...beanName {}", beanName);
		/*	Enhancer enhancer = new Enhancer();
			enhancer.setSuperclass(beanClass);
			enhancer.setCallback(new AMethodInterceptor());
			A a = (A) enhancer.create();
			return a;*/
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (beanName.equals("a")) {
			log.info("InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation ...beanName {}", beanName);
		}
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if (beanName.equals("a")) {
			log.info("InstantiationAwareBeanPostProcessor#postProcessProperties ...beanName {}", beanName);
		}
		return pvs;
	}
}
