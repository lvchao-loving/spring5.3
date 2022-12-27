package com.lvchao.visitor.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MetadataInfo {

	/**
	 * 注解信息
	 */
	private List<AnnotaionMetaDataInfo> list = new ArrayList<>();

	/**
	 * 类名称
	 */
	private String clazzFullName;

}
