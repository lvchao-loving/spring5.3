package com.lvchao.mybatis.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/22 19:39
 */
public interface AMapper {
	/**
	 *
	 * @return
	 */
	@Select("select * from a")
	List<Map<String,Object>> queryFroList();

	/**
	 *
	 * @param id
	 * @return
	 */
	@Select("select * from a where id =${id}")
	Map<String,Object> queryFroMap(Integer id);
}
