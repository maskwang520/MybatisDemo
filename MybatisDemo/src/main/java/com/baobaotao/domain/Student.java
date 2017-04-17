package com.baobaotao.domain;

import java.io.Serializable;

/**
 * Date:     2017年4月11日 下午9:59:50
 * @author   maskwang 
 * @since    JDK 1.6
 */
public class Student implements Serializable {
   private int stu_id;
   private String name;
   private int age;
   private int money;
public int getStu_id() {
	return stu_id;
}
public void setStu_id(int stu_id) {
	this.stu_id = stu_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
@Override
public String toString() {
	return "Student [stu_id=" + stu_id + ", name=" + name + ", age=" + age + ", money=" + money + "]";
}
   
   
}
