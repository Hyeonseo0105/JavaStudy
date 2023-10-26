package com.sist.lib;
//객체 중복 제거 => 객체 비교는 극히 드물다
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

	//source->override->
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();  //같은경우 주소가 같다
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//객체 비교 => instanceof
		if(obj instanceof Student)
		{
			Student s=(Student)obj;
			return name.equals(s.name) && age==s.age;  
		}
		return false;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
}
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set=new HashSet();
		Student s1=new Student("김철", 16);
		Student s2=new Student("김철", 16);
		
//		s1.setName("황미애");
//		s1.setAge(17);
//		
//		System.out.println("s2.name:"+s2.getName());
//		System.out.println("s2.age:"+s2.getAge());
		if(s1==s2)
		{
			System.out.println(s1+"=="+s2);
		}
		else
		{
			System.out.println(s1+"!="+s2);
		}
		
//		set.add(s1);
//		set.add(s2);
//		System.out.println(set);
	}

}
