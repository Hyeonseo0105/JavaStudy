package com.sist.lib;
// => 메소드 (책 p.340)
// => 검색 => 
import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		//정수만 메모리에 저장해서 관리
		/*
		 *   Wrapper => 기본형을 클래스형
		 *               => 기능을 부여
		 *               => 제네릭을 사용
		 *    => 장점 : Wrapper클래스와 기본형 호환
		 *   Integer => 10,20,30...
		 *   Integer i=10; ==> int
		 */
		//추가 => add()
		//list.add(Integer.valueOf(10));
		list.add(10);   //index번호 0
		list.add(20);   //1
		list.add(30);   //2
		// 60 ==> 3=====>
		list.add(40);   //3
		list.add(50);   //4
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); //형변환 필요X
			System.out.println(i+":"+val);
		}
		
		System.out.println("============");
		list.add(3,60);    //가급적이면 사용하지 않는다
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i);
			System.out.println(i+":"+val);
		}
		
		System.out.println("============");
		list.remove(3);
		for(int i=0;i<list.size();i++)    //인덱스 번호는 0번 ==> size():갯수
		                                  //i<=list.size()  ==> 오류 ∵인덱스 초과
			                              //for-each
		{
			int val=list.get(i);
			System.out.println(i+":"+val);
		}
		
		System.out.println("============");
		for(int i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("============");
		System.out.println("데이터 저장 갯수:"+list.size());
		//list.size()==0 => 장바구니가 비워있습니다
		System.out.println("데이터 존재여부:"+list.isEmpty());   //데이터 없는지 : false
		//라이브러리 => 메소드 isXxx() => boolean
		//SetXxx => void
		
		System.out.println("============");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재여부:"+list.isEmpty());
		//true
		/*
		 *   setXxx
		 *   getXxx
		 *   isXxx
		 *   remove/delete
		 */
	}

}
