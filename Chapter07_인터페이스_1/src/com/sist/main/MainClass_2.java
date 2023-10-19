package com.sist.main;
/*
 *    인터페이스
 *     기본문법)
 *            변수는 사용할 수 없다(상수만 사용이 가능하다)
 *            int i; ==> 오류
 *            int i=10; ==> 생략된 것이 있다
 *            --------- public static final int i=10;   //인터페이스안에는 자동으로 상수 들어감
 *                      -------------------
 *                      => static final int i=10;
 *                         // 상수
 *                         final int i=10;
 *                         // 상수형 변수
 *                         int i=10;
 *                         // 변수
 *            메소드
 *             구현이 안된 메소드 : 구현 내용이 여러개인 경우
 *                             (public abstract) void display();
 *                             public (abstract) void display();
 *             
 *             구현이 된 메소드 : 공통으로 사용되는 부분 정의
 *                            => 새로운 기능 추가될 때 사용
 *                            (public) default void aaa(){}
 *                            (public) static void bbb()P{
 *                         ==> 메소드나 상수를 선언 => 무조건 public
 *            상속 : => 인터페이스도 클래스다
 *                     -------------- 상속시 상위 클래스다
 *                     extends
 *                     implements
 *                    ------------ 둘다 상속
 *                    interface =======  interface
 *                             extends
 *                    interface ========== class
 *                              implements
 *                    
 *             다중 상속 => ,로 구분
 *                       class A
 *                       interface B
 *                       interface C
 *                       class D extends A implements B,C
 *                       {       -------   ----------
 *                                 확장        구현한다                       
 *                       }             
 */
//interface A
//{
//	/*public static final*/ //int a = 0;   //컴파일 될때 자동으로 public static final 들어감 ∵생략된것
//	/*public abstract*/
//	                       void aaa();
//	
//	//default void ooo() {}  //새로운 기능들은 구현하고 써야 오류가 안뜸
//}
//class B implements A
//{
//	public void aaa() {} //오버라이딩은 축소안됨 ∴public 붙여줘야함
////	@Override
////	public void aaa() {
////		// TODO Auto-generated method stub
////		
////	}
//}
interface A
{
	void aaa();
}
interface B //extends A
{
	void bbb();
	// void aaa();
}
class C implements B,A   //다중상속
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call...");
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call...");
	}

}
public class MainClass_2 {
	//final int a;   //상수는 초기값을 주면서 생성해야함   static이 붙었을때 완전한 상수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new C();
//		b.aaa();
//		b.bbb();
//		A a=new C();//다중상속은 따로 받아야 하는 단점있음
//		a.aaa();    
		C c=new C();
		c.aaa();
		c.bbb();
	}

}
