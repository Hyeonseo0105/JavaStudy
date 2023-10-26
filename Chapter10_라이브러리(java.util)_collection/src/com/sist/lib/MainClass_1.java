package com.sist.lib;



























/*   ArrayList
 *   
 *   => T E K V
 *      T => <type> => 클래스(type=>클래스 등록)
 *      
 *      
 *      E => ELEMENTS => 클래스
 *      K => Key
 *      V => value
 *      ArrayList<E>
 *      Set<E>
 *      Map<K,V>
 *      예)
 *         class Box<T>
 *         {
 *            T t;
 *            public void setT(T t)
 *            {
 *               this.t=t;
 *            }
 *            public T getT()
 *            {
 *               return t;
 *            }
 *         }
 *         
 *         Box box=new Box() ==> T(Object)
 *         Box<Integer> box=new Box<Integer>();
 *             => T(Integer)
 *             
 *    클래스의 종류
 *     => List(인터페이스)
 *        순서가 존재(자동으로 인덱스)
 *        데이터 중복 허용
 *        => 가장 많이 사용되는 컬렉션
 *        => 구현하는 클래스
 *           ------------
 *              | ArrayList,Vector,LinkedList
 *                 => ArrayList
 *                     : 비동기방식 => 접근 속도가 빠르다 => 데이터베이스에서 데이터읽기
 *                                  ---------------   ---------- 웹 핵심
 *                     => 단점 : 추가,삭제 속도가 늦다
 *                                 ------- 오라클에서 주로 하는 일
 *                     => 읽기/데이터 모아서 전송
 *                         => 마이바티스 : 리턴형 List
 *                     => Vector의 단점 보완
 *                 => Vector : 동기방식 => 네트워크(접속자 정보 저장)
 *                 => LinkedList : 접근 속도가 늦다 , 추가/삭제가 빠르다
 *                    ---------- 자체처리(Application)
 *                ----------------List라는 인터페이스 이용 모든 메소드 동일
 *                ----------------java.util => 사용시에는 반드시 import를 이용한다             
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		// 가변 => 메모리 저장 크기를 지정하지 않는다(저장된 데이터만큼만 메모리가 할당된다)
		// 배열 => 사용하지 않는 공간이 있는 경우 메모리누수 현상
		// => 추가 => add(Object) => add(String)
		list.add("사과");   //0
		list.add("배");     //1  => 삭제
		list.add("수박");   //2   => 1
		list.add("바나나");  //3  => 2
		list.add("메론");    //4  => 3
		// => 인덱스 번호가 자동으로 변경...
		// 추가시에는 마지막에 추가 , 가급적이면 삭제는 하지 않는다
		// 데이터 읽기 => 출력 => size() , get(index)
		for(int i=1;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+"."+f);
		}
		
		System.out.println("===========삭제후===========");		
		//삭제 remove(index) => index자리에 데이터쓰면 중복허용함
		list.remove(1);
		for(int i=1;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+"."+f);
		}
		
		System.out.println("===========수정후===========");
		list.set(2, "연시");
		for(int i=1;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+"."+f);
		}
		
		System.out.println("========저장갯수 확인========");
		//size() => 장바구니
		System.out.println("과일:"+list.size());
		
		System.out.println("=========전체 삭제=========");
		// ArrayList 데이터 비우기 => clear()
		list.clear();
		System.out.println("과일:"+list.size());
		
		System.out.println("======데이터 존재여부 확인======");
		//isEmpty
		if(list.isEmpty())
		{
			System.out.println("장바구니가 비워 있습니다");
		}
		else
		{
			System.out.println("장바구니에 선택된 데이터가 있습니다");
		}
	}

}
