import java.util.Scanner;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
// 로그인 처리
// 사용자로부터 받는 값 => id,pwd
// 로그인 여부 확인 => void(해당 메소드 처리) , 결과값을 받을 건지...
// => 결과값을 받아서 처리 : boolean , int(0,1) , String
//                     -------
public class 메소드_7 {
	static String userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"를 입력하시오:");
		String input=scan.next();
		return input;
	}
	static boolean isLogin(String id, String pwd)
	{
		final String ID="admin";  //상수
		final String PWD="1234";
		boolean bCheck=false;
		// 파일,오라클에 저장
		if(id.equals(ID) && pwd.endsWith(PWD))
		{
			bCheck=true;
		}
//		else
//		{
//			bCheck=false;
//		}
		return bCheck;
	}
	static void process()
	{
		String id=userInput("아이디");
		String pwd=userInput("비밀번호");
		boolean b=isLogin(id, pwd);
		//boolean => bXxxx
		//메소드명이 isXxx() => 리턴형 boolean
		//처리
		if(b==true)
		{
			System.out.println("메인 화면으로 이동...(response.sendRedirect('main.jsp'))");
		}
		else
		{
			System.out.println("ID나 비밀번호가 틀립니다.(history.back())");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
