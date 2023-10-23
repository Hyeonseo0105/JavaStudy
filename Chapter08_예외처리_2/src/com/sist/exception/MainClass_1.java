package com.sist.exception;
/*
 *    => 캡슐화 : private변수 / 읽기/쓰기 메소드 추가
 *    => 재사용
 *       상속(is-a) / 포함(has-a)
 *    => 수정 / 추가 => 다형성
 *       오버라이딩 / 오버로딩
 *       
 *       **************
 *       
 *       
 *       
 *       
 *       
 *       
 *       
 *       
 *       
 *            class  ====  class
 *                    |
 *                  extends
 *            interface ==== interface
 *                       |
 *                    extends
 *            interface ==== class
 *                       |
 *                   implements
 *      ---------------------------------------
 *        class A
 *        class C
 *        class B extends A,C ==> 오류
 *        
 *        class A
 *        class C extends A
 *        class B extends C
 *        -------------------정상코드
 *        
 *        interface A
 *        interface B extends A
 *        interface C extends B
 *        interface D extends A,B ==> 가장 많이 사용
 *        -----------------------다중 상속
 *        
 *        class A
 *        interface B
 *        interface C
 *        class D extends A implements B,C
 *        ---------------------------------
 *        
 *        interface A
 *        interface B
 *        class C implements A,B
 *        
 *        interface ==> Container역할 , Controller역할
 *                          |              |
 *                       묶어주는 역할      찾기,제어
 *                      ----------------------------
 *                                 | 스프링 ==> AOP(공통모듈)   //스프링은 컨테이너다
 *                       => 소프트웨어 용어 
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
