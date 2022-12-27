package com.lvchao.importconfig;

import com.lvchao.beandefinition.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * 文件描述（必填！！！）
 * </p>
 *
 * @author lvchao
 * @since 2022/11/27 21:34
 */
@Configuration
@Import(MyImportBeanDefinitionRegistrar.class)
public class ImportConfig {
}
