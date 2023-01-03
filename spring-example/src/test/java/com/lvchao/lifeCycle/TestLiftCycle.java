package com.lvchao.lifeCycle;

import com.lvchao.lifeCycle.config.AppConfigLifeCycle;
import com.lvchao.lifeCycle.test.A;
import com.lvchao.lifeCycle.test.B;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/3 15:00
 */
@Slf4j
public class TestLiftCycle {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigLifeCycle.class);
		A a = applicationContext.getBean(A.class);
		B b = applicationContext.getBean(B.class);
		a.showA();
		b.showB();
		log.info("------------------------------");
		A a1 = applicationContext.getBean(A.class);
		B b1 = applicationContext.getBean(B.class);
		a1.showA();
		b1.showB();
	}

	@Test
	public void defaultCycle(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigLifeCycle.class);
		//System.out.println(context.getBean(D.class).getE());

		/*try {
			context.getBean(N.class).afterPropertiesSet();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
//		context.getBean(F.class).m0();

	}
}
