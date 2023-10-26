package com.sist.lib;

/*
 * 	
 */

import java.util.*;

class Student{
	private String name;
	private int age;
	
	
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
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode(); // 같은 경우 주소값이 같음
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		// instanceof : 객체 비교
		if(obj instanceof Student)
		{
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;
		}
		return false;
	}

}

public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new HashSet();
		Student s1=new Student("홍길동", 25);
		Student s2=new Student("홍길동", 25);
		
		s1.setName("심청이");
		s1.setAge(20);
		
		System.out.println("s2의 name : "+s2.getName());
		System.out.println("s2의 age : "+s2.getAge());
		
//		if(s1.equals(s2))
//		{
//			System.out.println(s1+" == "+s2);
//		}
//		else
//		{
//			System.out.println(s1+" != "+s2);
//		}
		
		set.add(s1);
		set.add(s2);
		System.out.println(set); // 중복이기 때문에 하나를 제거하고 출력
	}

}
