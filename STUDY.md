# Spring学习笔记
## Spring 原理流程图
* [流程图](https://www.processon.com/diagraming/637aeb6be401fd60d4cb4e68)

## Spring Bean对象
* BeanDefinition类 和 BeanDefinitionHolder类

BeanDefinition类描述了类得所有基础信息，但是没有类的名称。
BeanDefinitionHolder类中属性值中存在BeanDefinition类并且扩展了 BeanName和BeanName得别名。

## Spring Aop
* Aop 概念

Aspect Oriented Programming 面向切面编程，在传统的oop开发过程当中，逻辑是自上而下的，譬如我们实现一个登录功能，
浏览器发起http请求到controller，controller负责接受请求，封装参数、验证 参数等等，继而把数据传给service，service
处理完成之后调用dao，dao操作db后返回；这个过程当中 会产生很多横切性的问题；比如controller当中的日志记录、比如service
当中的权限校验，比如dao当中的事务处理；这些横切性的问题和主业务逻辑是没有关系的，比如日志的记录失败与否并不会影响整 个登录逻辑；
这些横切的问题如果不去处理会散落在代码的各个地方，面向切面编程就是我们程序员编码只关心横切性问题的抽象。

* SpringAop 概念

Aop 面向切面编程是一种编程目标，说白了是一个标准；而实现这种编程标准的技术手段有很多；比如你可以用JDK动态代理来实现aop，
也可以使用aspectj这种静态编程技术来实现代理从而实现aop；spring aop就是实现aop的一种技术手段。实现aop除了spring aop
市面上还有很多其他 技术来实现aop。

* SpringAop 核心原理

对于上述的横切性问题spring的做法是把这些问题集中到一个切面（Aspect）当中，然后利用动态代理技术动态增强业务bean；
spring aop的核心技术是JDK动态代理和cglib动态代理，加上spring内部的BeanPostProcessor一起工作，从而达到了对spring当中bean完成增强。

* SpringAop 专业术语
  
  * Join Point
    
    连接点：程序执行当中的一个点，他是一个最终结果，因为spring aop最小连接单位是一个方法，故而一个切点就是一个方法。

  * Ponitcut
    
    切点：一组连接点的集合；因为在开发中可能连接点可能会有很多，根绝业务和功能的不同会进行分组，切点就是一组连接点的描述。
    （相当于连接点=一条数据，切点等于一张表；一个数据库当中可以存在多张表，表可以有多条数据）

  * Advice

    通知：通知可以从三个维度来理解。
    
        1、通知的内容：也就是你增强一个方法的具体业务逻辑，比如日志记录，比如事务操作；
        2、通知的时机：Before advice、After returning advice、After throwingadvice、After (finally) advice、Around advice；
        3、通知的目标：通知需要作用到哪个或者哪些连接点上。

  * Introduction
  
    导入：SpringAop可以在不修改代码的情况下让某个类强制实现某个接口，并且可以指定接口的默认实现方法。
    
  * Target object
    
    目标对象：由于spring aop是借助CGLIB或者JDK动态代理的来实现增强的，目标对象的概念和动态代理当中那个目标对象是同一个概念——被代理的那个对象.
  
  * AOP proxy
    
    代理对象：一个被jdk动态代理或者被CGLIB动态代理了之后的对象。
    
  * Weaving
    
    织入：一个过程，把切面和应用程序对象连接的过程。

  * Aspect

    切面：上述所有概念在编码过程中存在的类称为切面，切点、连接点、通知等等存在的类称之为一个切面。
  

* Join Point 连接点语法



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
## 配置类解析
* 配置类解析流程图
  



* 配置类解析说明

1、@Bean method 不会当成配置类
2、实现 ImportBeanDefinitionRegistrar 接口类不会当成配置类

除了以上两种情况文件spring将会循环递归解析所有配置类。


