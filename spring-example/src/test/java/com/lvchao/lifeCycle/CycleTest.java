package com.lvchao.lifeCycle;

import com.lvchao.lifeCycle.bean.D;
import com.lvchao.lifeCycle.config.LifeCycleConfig;
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
public class CycleTest {
	@Test
	public void defaultCycle(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
		//System.out.println(context.getBean(D.class).getE());

		/*try {
			context.getBean(N.class).afterPropertiesSet();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
//		context.getBean(F.class).m0();

	}
}
