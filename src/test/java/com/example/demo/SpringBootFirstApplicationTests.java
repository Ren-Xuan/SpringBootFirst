package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
/*
 * SpringBoot 单元测试
 */
import org.springframework.context.ApplicationContext;

import com.example.demo.bean.Person;
import com.example.demo.service.HelloService;
@SpringBootTest
class SpringBootFirstApplicationTests {
	@Autowired
	Person person;
	
	@Autowired
	ApplicationContext ioc;
	
	@Test
	void testHelloService() {
		/**
		 * ImportResorce 导入Spring的配置文件并且使之生效
		 */
		Boolean bool= ioc.containsBean("helloService");
		System.out.println("传统方法：是否已经导入了自定义配置文件"+bool);
		bool= ioc.containsBean("helloService02");
		System.out.println("使用类注释方法：是否已经导入了配置文件"+bool);
	}
	
	
	
	@Test
	void contextLoads() {
		System.out.print(person);
	}
	

}
