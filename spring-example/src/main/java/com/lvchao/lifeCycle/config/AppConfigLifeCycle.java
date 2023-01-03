package com.lvchao.lifeCycle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>
 * bean的生命周期测试类
 * </p>
 *
 * @author lvchao
 * @since 2022/12/3 15:03
 */

// @EnableAspectAop
@EnableAspectJAutoProxy
@ComponentScan("com.lvchao.lifeCycle.test")
// @ComponentScan("com.lvchao.lifeCycle")
public class AppConfigLifeCycle {
}
