package com.lvchao.scan.annotation;

import java.lang.annotation.*;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/12/23 19:57
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ImportBeanDefinitionRegistrarAnnotation {
	String[] value() default {};
}
