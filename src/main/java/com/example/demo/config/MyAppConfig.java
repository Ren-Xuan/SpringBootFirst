package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.HelloService;


/**
 * 
 * @Configuration 指名当前类是一个配置类，替换之前的Spring配置文件（bean标签）
 * @author 灵均
 *
 */
@Configuration
public class MyAppConfig {
	
	//将方法的返回值添加到容器中，容器中这个组件默认id是文件名
	@Bean
	public HelloService helloService02() {
		System.out.println("给容器中添加了helloService组件了");
		return new HelloService();
	}
}
