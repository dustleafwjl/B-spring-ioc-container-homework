# Problem 1

##### @Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

1. @Bean能实现Bean的统一管理
2. @Component （@Controller @Service @Respository）作用于类上，
只有在我们的SpringBoot应用程序启用了组件扫描并且包含了被注解的类时才有效。
@Bean更加灵活了，它可以独立加在方法或者类上，按需注册到spring容器。
3. @Bean更适用于引用第三方库

