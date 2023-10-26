package com.sist.lib;
/*
 *    ArrayList<클래스>
 *             -------
 *                |
 *             기본형 ==> Integer , String
 *             사용자 정의 클래스
 *              ==> ArrayList<Music>
 *                  ArrayList<Movie>
 *                  ArrayList<Food>
 *                 ----------------- Object => 형변환
 */
import java.util.*;
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("황미애");
		names1.add("김철");
		names1.add("모진섭");
		names1.add("서지수");
		names1.add("정욱");
		
		for(String name:names1)
		{
			System.out.println(name);
		}
		System.out.println("================");
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("박로사");
		names2.add("한도령");
		names2.add("세이");
		names2.add("황미애");
		names2.add("김철");
		for(String name:names2)
		{
			System.out.println(name);
		}
		System.out.println("================");
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1);   //다른 컬렉션에 데이터 추가
		for(String name:temp)
		{
			System.out.println(name);
		}
		System.out.println("================");
		temp.retainAll(names2);  //같은 데이터를 추가(교집합)
		for(String name:temp)
		{
			System.out.println(name);
		}
		// =>오라클에서는 JOIN/INTERSECT
	}

}
