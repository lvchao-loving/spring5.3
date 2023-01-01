package com.lvchao.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>
 * aop 配置类
 * </p>
 *
 * @author lvchao
 * @since 2022/12/30 17:25
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.lvchao.aop")
public class AppConfig_Aop {
}
