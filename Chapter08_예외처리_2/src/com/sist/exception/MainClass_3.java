package com.sist.exception;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택적인 부분 ==> 오류 발생시 제외 ==> 크롤링
		//try
		//{
			for(int i=1;i<=10;i++)    //for문 안에 try~catch써야 j=0일때 넘어가고 i를 10바퀴
			{
				try
				{
				int j=(int)(Math.random()*3);
				System.out.println("j="+j);
				System.out.println("i="+i+", i/j="+(i/j));
				// 제외 => continue와 같음
				}catch(Exception ex) {}
			}
		//}catch(Exception ex) {}
	}

}
