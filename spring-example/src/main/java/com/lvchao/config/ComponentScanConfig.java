package com.lvchao.config;

import com.lvchao.beandefinition.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/26 15:50
 */
@Configuration
// @ComponentScan("com.lvchao.factorybean")
@Import(MyImportBeanDefinitionRegistrar.class)
public class ComponentScanConfig {
}
