package com.lvchao;

import com.lvchao.entity.H;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author lvchao
 * @since 2022/11/19 18:41
 */
public class Application {
	public static void main(String[] args) {
		System.out.println("测试");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(H.J.class);
		context.refresh();
		context.getBean(H.J.class);
	}
}
