package com.lvchao.mybatis;

import com.lvchao.mybatis.config.MybatisConfig;
import com.lvchao.mybatis.dao.AMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/22 19:41
 */

@Slf4j(topic = "e")
public class MybatisTest {
	@Test
	public void defaultBatis(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MybatisConfig.class);


		AMapper service = context.getBean(AMapper.class);

		//Map<String, Object> resultMap = service.queryFroMap(1);

		List<Map<String, Object>> resultList = service.queryFroList();
		//log.debug("resultMap:{}",resultMap);
		log.debug("----------------------------------------------");
		log.debug("resultList:{}",resultList);
	}
}
