package com.lvchao.beanPostProcessor.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Method;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 14:45
 */
@Slf4j
public class AMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		if(method.getName().equalsIgnoreCase("getName")){
			log.info("调用 getName 方法 ");
		}
		else if(method.getName().equalsIgnoreCase("setName")){
			objects = new Object[]{"被替换掉啦"};
		}

		Object object = methodProxy.invokeSuper(o, objects);
		return object;
	}
}
