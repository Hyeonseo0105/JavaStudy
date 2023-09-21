/*
 *   문자열
 *   문자 '' => 한글자 저장 => char
 *       'a','b','c' ==> 한번 저장이 가능 String => ""
 *   일반데이터형
 *     String name="홍길동"; ==> 제어
 *   클래스형
 *     기능 => 메소드
 *    => 웹은 데이터형이 존재하지 않는다 => 문자열
 *    "1"
 *    <input type=text>:html
 *   
 */
import java.util.Scanner;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장
		char a1='홍';
		char a2='길';
		char a3='동';
		System.out.println(a1+""+a2+""+a3);
		
		String name="홍길동";
		System.out.println(name);
		
		String addr="서울특별시 마포구 와우산로29가길 79 1F";  // String 문자갯수 상관X
		System.out.println(addr);
		
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어:");
		String findData=scan.next();
		System.out.println(findData);
	}

}
