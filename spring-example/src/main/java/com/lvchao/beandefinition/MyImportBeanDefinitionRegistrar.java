package com.lvchao.beandefinition;

import com.lvchao.entity.A;
import com.lvchao.entity.B;
import com.lvchao.factorybean.MyFactoryBean;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
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
 * @since 2022/11/27 21:04
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// 通过 class 创建一个 beandefinition1 对象
		AbstractBeanDefinition beanDefinition1 = BeanDefinitionBuilder.genericBeanDefinition(A.class).getBeanDefinition();
		beanDefinition1.setBeanClass(MyFactoryBean.class);
		beanDefinition1.getPropertyValues().add("clazz","com.lvchao.entity.A");
		registry.registerBeanDefinition("a", beanDefinition1);

		// 通过 class 创建一个 beandefinition2 对象
		AbstractBeanDefinition beanDefinition2 = BeanDefinitionBuilder.genericBeanDefinition(A.class).getBeanDefinition();
		beanDefinition2.setBeanClass(MyFactoryBean.class);
		beanDefinition2.getPropertyValues().add("clazz", "com.lvchao.entity.B");
		registry.registerBeanDefinition("b", beanDefinition2);
	}
}
