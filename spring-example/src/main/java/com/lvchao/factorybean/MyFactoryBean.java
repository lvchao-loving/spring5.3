package com.lvchao.factorybean;

import com.lvchao.entity.A;
import lombok.Data;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/27 19:18
 */
@Data
@Component
public class MyFactoryBean implements FactoryBean {

	private Class clazz;

	@Override
	public Object getObject() throws Exception {
		return clazz.newInstance();
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}
}
