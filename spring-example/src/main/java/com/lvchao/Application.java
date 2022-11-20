package com.lvchao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/19 18:41
 */
public class Application {
	public static void main(String[] args) {
		System.out.println("测试");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Lvchao.class);
		context.refresh();
		System.out.println(context.getBean(Lvchao.class));
	}
}
