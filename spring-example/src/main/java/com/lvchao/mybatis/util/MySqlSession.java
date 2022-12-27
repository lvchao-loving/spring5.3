package com.lvchao.mybatis.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/24 12:26
 */
public class MySqlSession {
	/**
	 * 必须返回一个对象
	 * 对象：
	 * 1、实现clazz接口
	 * 2、实现clazz接口当中的所有方法
	 * 3、这些方法的逻辑需要完成对改方法上面的sql语句的执行
	 * (ClassLoader loader,
	 * Class<?>[] interfaces,
	 * InvocationHandler h
	 * @param clazz
	 * @return
	 */
	public static Object getMapper(Class clazz){
		ClassLoader classLoader = MySqlSession.class.getClassLoader();
		Class[] classes = new Class[]{clazz};
		//返回上面符合要求的对象  首先肯定是一个类
		Object proxy = Proxy.newProxyInstance(classLoader, classes, new MyTestInvocationHandler());
		return proxy;
	}

	@Slf4j(topic = "e")
	static  class MyTestInvocationHandler implements InvocationHandler {

		//获取当前执行的方法对应的sql语句
		//执行这些sql语句
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			//处理toString、hashcode等Object方法
			if(method.getDeclaringClass().equals(Object.class)){
				method.invoke(this,args);
			}
			Select select = method.getAnnotation(Select.class);
			String sql = select.value()[0];
			log.info("假装已经连接数据库了 conn db");
			log.info("假装执行查询 execute sql:{}",sql);
			log.info("假装根据类型返回了真实对象----");
			return null;
		}
	}
}
