package com.sist.main;
//캡슐화
class Member
{
	// 변수를 은닉화
	private int age;           //0
	private String name;       //null => 읽기/쓰기
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member();  //m(age,name)
		//값 저장
		m.setAge(26);        //m.age
		m.setName("임현서");   //m.name
		
		System.out.println(m.getAge());
		System.out.println(m.getName());
	}

}
