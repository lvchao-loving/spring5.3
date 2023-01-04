package com.lvchao.beanPostProcessor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 配置类
 * </p>
 *
 * @author lvchao
 * @since 2023/1/4 13:48
 */
@Configuration
@ComponentScan(value = "com.lvchao.beanPostProcessor")
public class AppConfigBeanPostProcessor {
}
