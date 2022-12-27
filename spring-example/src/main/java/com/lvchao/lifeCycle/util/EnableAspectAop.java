package com.lvchao.lifeCycle.util;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/3 18:58
 */
@Retention(RetentionPolicy.RUNTIME)
//@Import(JDKProxyBeanPostProcessor.class)
public @interface EnableAspectAop {
}
