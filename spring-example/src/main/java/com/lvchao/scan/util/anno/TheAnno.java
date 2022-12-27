package com.lvchao.scan.util.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TheAnno {
		String value() default "xx";
}
