package com.lvchao.test;

import com.lvchao.config.ComponentScanConfig;
import com.lvchao.config.SpringConfig;
import com.lvchao.entity.A;
import com.lvchao.entity.B;
import com.lvchao.entity.C;
import com.lvchao.entity.H;
import com.lvchao.factorybean.MyFactoryBean;
import com.lvchao.importconfig.ImportConfig;
import com.lvchao.postprocessor.ModelBeanFactoryPostProcessor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 测试 Spring 日志打印
 * </p>
 *
 * @author lvchao
 * @since 2022/11/20 19:15
 */
@Slf4j
public class TestBean {
	@Test
	public void test1(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(H.class);
		context.register(H.J.class);
		context.refresh();
		H.J j = context.getBean(H.J.class);
		j.showHJ();
	}

	@Test
	public void test2(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ModelBeanFactoryPostProcessor.class);
		// context.register(SpringConfig.class);
		context.register(C.class);
		context.refresh();
		C c = context.getBean(C.class);
	}

	@Test
	public void test3(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ComponentScanConfig.class);
		context.refresh();
		A a1 = context.getBean(A.class);
		A a2 = context.getBean(A.class);
		B b1 = context.getBean(B.class);
		B b2 = context.getBean(B.class);
		a1.showA();
		a2.showA();
		b1.showB();
		b2.showB();
	}

	@Test
	public void test4() throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		// context.register(ImportConfig.class);
		context.register(ComponentScanConfig.class);
		context.refresh();

	}

	@Test
	public void test5() throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ImportConfig.class);
		context.refresh();

		A bean = context.getBean(A.class);
		bean.showA();
	}

	@Test
	public void test6() throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		A a = new A();
		// a.setName("Spring API 初始化");
		context.getBeanFactory().registerSingleton("a",a);
		context.refresh();
		A bean = context.getBean(A.class);
		bean.showA();
	}

	@Test
	public void test7() throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		A a = new A();
		// a.setName("Spring API 初始化");
		context.getBeanFactory().registerSingleton("a",a);
		context.refresh();
		A bean = context.getBean(A.class);
		bean.showA();
	}

	@Test
	public void test8() throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.lvchao.postprocessor","com.lvchao.entity");
		context.refresh();
		B bean = context.getBean(B.class);
		bean.showB();
	}

	@Test
	public void test9() {
		// 创建 BeanFactory 工厂
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// 根据 Class 文件生成 BeanDefinition 对象
		AbstractBeanDefinition aBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(A.class).getBeanDefinition();
		// 将 BeanDefinition 注册到 BeanFactory 容器
		beanFactory.registerBeanDefinition("a", aBeanDefinition);
		// 从容器中获取对象
		A a = beanFactory.getBean(A.class);
		a.showA();
	}
	@Test
	public void test10(){
		// 创建 BeanFactory 工厂
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// 根据 Class 文件生成 BeanDefinition 对象
		AbstractBeanDefinition aBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(A.class).getBeanDefinition();
		// 设置自动注入
		aBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		// 将 BeanDefinition 注册到 BeanFactory 容器
		beanFactory.registerBeanDefinition("a", aBeanDefinition);
		AbstractBeanDefinition bBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(B.class).getBeanDefinition();
		bBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		// 将 BeanDefinition 注册到 BeanFactory 容器
		beanFactory.registerBeanDefinition("b", bBeanDefinition);
		// 说明：这里要先创建 B
		// 从容器中获取对象
		B b = beanFactory.getBean(B.class);
		b.showB();
		// 从容器中获取对象
		A a = beanFactory.getBean(A.class);
		a.showA();
	}

	@Test
	public void test11(){
		// 创建 BeanFactory 工厂
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// 根据 Class 文件生成 BeanDefinition 对象
		AbstractBeanDefinition aBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(A.class).getBeanDefinition();
		// 将 BeanDefinition 注册到 BeanFactory 容器
		beanFactory.registerBeanDefinition("a", aBeanDefinition);
		// 根据 Class 文件生成 BeanDefinition 对象
		AbstractBeanDefinition bBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(B.class).getBeanDefinition();
		// 将 BeanDefinition 注册到 BeanFactory 容器
		beanFactory.registerBeanDefinition("b", bBeanDefinition);

		// 创建 Autowired 解析器
		AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor =	new AutowiredAnnotationBeanPostProcessor();
		// 向 Autowired 解析器添加 BeanFactory 工厂
		autowiredAnnotationBeanPostProcessor.setBeanFactory(beanFactory);
		// 向 BeanFactory 工厂添加 Autowired 解析器
		beanFactory.addBeanPostProcessor(autowiredAnnotationBeanPostProcessor);
		// 从容器中获取对象
		A a = beanFactory.getBean(A.class);
		a.showA();
		// 从容器中获取对象
		B b = beanFactory.getBean(B.class);
		b.showB();
	}

	@Test
	public void test12(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();

	}

	@Test
	public void test13() throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.lvchao.postprocessor");
		context.refresh();
		B bean = context.getBean(B.class);
		bean.showB();
	}
}
