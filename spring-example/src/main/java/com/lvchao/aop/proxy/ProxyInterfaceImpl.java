package com.lvchao.aop.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2023/1/1 11:24
 */
@Slf4j
public class ProxyInterfaceImpl implements ProxyInterface{
	@Override
	public String method(String name) {
		return "method-->" + name;
	}
}
