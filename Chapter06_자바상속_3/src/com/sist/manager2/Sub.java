package com.sist.manager2;
import com.sist.manager.*;
public class Sub extends Super{
	//변수/메소드
	/*
	 * private int a;       //자신의 클래스안에서만 접근 가능
	 *	protected int b;
	 *	int c;              //같은 패키지안에서 접근 가능
	 *	public int d;
	 */
	public Sub() {
		//this. 하면 쓸수있는 변수 나옴 b,d만 가능
	}
}
