package com.example.demo.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * 配置文件中的值映射到
 * 
 * @author 灵均
 *
 */
@PropertySource(value = "classpath:person.properties")
@Component
@ConfigurationProperties(prefix = "person")//全局的
public class Person {
	private String lastName;
	private Integer age;
	private Boolean boss;
	private java.util.Date birth;
	
	private Map<String,Object> maps;
	private List<Object> lists;
	private Dog dog;
	

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps="
				+ maps + ", lists=" + lists + ", dog=" + dog + "]\n";
	}
	public String getLastName() {
		return lastName;
	}
	public Integer getAge() {
		return age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public java.util.Date getBirth() {
		return birth;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public List<Object> getLists() {
		return lists;
	}
	public Dog getDog() {
		return dog;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public void setBirth(java.util.Date birth) {
		this.birth = birth;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	
	
}
