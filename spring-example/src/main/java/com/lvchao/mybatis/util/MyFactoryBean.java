package com.lvchao.mybatis.util;

import org.springframework.beans.factory.FactoryBean;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/24 12:25
 */
public class MyFactoryBean implements FactoryBean {
	Class mapperInterface;

	public void setMapperInterface(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
		Object mapper =  MySqlSession.getMapper(mapperInterface);
		return mapper;
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}

}
