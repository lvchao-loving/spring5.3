package com.lvchao.postprocessor;

import com.lvchao.entity.B;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/28 10:55
 */
@Slf4j
// @Component
public class AToBBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition("a");
		log.info("设置之前的 beanclass:{}", beanDefinition.getBeanClassName());
		beanDefinition.setBeanClass(B.class);
		log.info("设置之后的 beanclass:{}", beanDefinition.getBeanClassName());
	}
}
