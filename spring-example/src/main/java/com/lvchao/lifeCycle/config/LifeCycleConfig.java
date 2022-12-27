package com.lvchao.lifeCycle.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/3 15:03
 */

// @EnableAspectAop
@EnableAspectJAutoProxy
@ComponentScan("com.lvchao.lifeCycle")
public class LifeCycleConfig {
}
