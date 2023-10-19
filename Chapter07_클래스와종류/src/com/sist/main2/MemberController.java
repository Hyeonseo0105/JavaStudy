package com.sist.main2;
interface I
{
	public void display();  //구현하는 내용이 틀린 경우
	public default void aaa() {
		System.out.println("deault");
	}
	// ==> 내용이 같은 경우
	public default void bbb()
	{
		System.out.println("BBBBB");
	}
}
class A implements I
{
	/*
	 * pulic default void aaa() {
	 *   sysem.out.pringln("default...")
	 * }
	 */
	public void display ()
	{
		System.out.println("A...");
	}
}
class B implements I
{
	public void display ()
	{
		System.out.println("B...");
	}
}
class C implements I
{
	public void display ()
	{
		System.out.println("C...");
	}
}
public class MemberController implements Controller{
	public void execute()
	{
		System.out.println("회원 관리 클래스");
	}
	public static void main(String[] args) {
		I i=new A();
		i.display();
		i.aaa();
		i=new B();
		i.display();
		i.aaa();
		i=new C();
		i.display();
		i.aaa();
	}
}
