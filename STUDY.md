# Spring学习笔记

## Spring配置类原理
* 配置文件原理
  
    Spring在启动的时候将 getSystemProperties()获取的jvm信息、 getSystemEnvironment()环境变量 和 @PropertySource注解修饰的配置文件 读取到 MutablePropertySources#propertySourceList 属性中。
    Spring从环境变量中获取时也是遍历这个集合，然后按照优先级获取key的值。所以这也是配置文件优先级的原理，如果想要改变Spring配置文件优先级的原理，则需要通过不同的顺序添加到集合中。

* Spring配置类演示
```
	@Test
	public void test1() throws IOException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		// 从 classpath 路径下读取配置文件，并添加到 environment 环境中
		ResourcePropertySource resourcePropertySource = new ResourcePropertySource("classpath:environment.properties");
		environment.getPropertySources().addLast(resourcePropertySource);

		log.info(environment.getProperty("lvchao.name"));
		log.info(environment.getProperty("lvchao.age"));
	}
```



