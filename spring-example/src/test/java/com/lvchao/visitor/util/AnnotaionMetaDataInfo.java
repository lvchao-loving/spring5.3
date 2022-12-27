package com.lvchao.visitor.util;

import lombok.Data;

@Data
public class AnnotaionMetaDataInfo {

	/**
	 * 注解类型
	 */
	private Class annotationType;

	/**
	 * 注解来源
	 */
	private String annotationSource;

	/**
	 * 注解的名字
	 */
	private String annotationName;
}
