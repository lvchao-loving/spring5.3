package com.lvchao.parse.config;

import com.lvchao.parse.importBeanDefinitionRegistrar.F;
import com.lvchao.parse.importBeanDefinitionRegistrar.beanDefinitionRegistryPostProcessor.X;
import com.lvchao.parse.importBeanDefinitionRegistrar.beanDefinitionRegistryPostProcessor.Y;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>
 * 配置类
 * </p>
 *
 * @author lvchao
 * @since 2022/12/29 18:01
 */
@Configuration
@ComponentScan("com.lvchao.parse.importBeanDefinitionRegistrar")
@Import({X.class, F.class})
public class AppConfig_ImportBeanDefinitionRegister {
}
