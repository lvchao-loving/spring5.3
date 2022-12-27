package com.lvchao.scan.config;

import com.lvchao.scan.annotation.ImportBeanDefinitionRegistrarAnnotation;
import com.lvchao.scan.bean.E;
import com.lvchao.scan.bean.MyImportBeanDefinitionRegistrar;
import com.lvchao.scan.bean.X;
import com.lvchao.scan.util.MyBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;


@ComponentScan(value = "com.lvchao.scan.bean",nameGenerator = MyBeanNameGenerator.class,
		excludeFilters ={
		//@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = X.class)
},includeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = E.class)
})
@Import(MyImportBeanDefinitionRegistrar.class)
@ImportBeanDefinitionRegistrarAnnotation("默认value值")
// @ComponentScan(value = "com.lvchao.scan.bean")
public class ScanConfig {
}
