package com.sist.main;
//객체대입
class Human
{
	int age;
	String name;
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human lim=new Human();
		//lim(age,name) => lim.age , lim.name
		lim.age=26;
		lim.name="임현서"; //=> 쓰기 => setXxx
		
		//변수(멤버변수,정적변수,지역변수,매개변수) => 읽기/쓰기
		System.out.println(lim.age); //읽기 => getXxx
		System.out.println(lim.name);
		
		//lim => 변수
		Human shim=lim;
		//대입이 가능하다 ==> 메모리 주소를 대입
		/*
		 * int a=10;
		 * int b=a;  ==> 메모리에 있는 값을 대입
		 */
		//shim , lim은 같은 주소를 가지고 있다
		shim.age=27;
		shim.name="심선빈";
		
		System.out.println(lim.age);
		System.out.println(lim.name);
	}

}
