package com.lvchao.reflect;

import com.lvchao.reflect.bean.A;
import com.lvchao.reflect.bean.B;
import com.lvchao.reflect.bean.C;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/2 14:06
 */
@Slf4j
public class TestReflect {

	@Test
	public void test01(){
		log.info("{}", A.class.isAssignableFrom(B.class));
		log.info("{}", A.class.isAssignableFrom(A.class));
		log.info("{}", A.class.isAssignableFrom(C.class));
	}

	@Test
	public void test02(){
		C c = new C();

	}
}
