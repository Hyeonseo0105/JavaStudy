/*
 * 책 p.54
 * 
 *   변수 => 저장(데이터)
 *   연산자 => 결과값 , 사용처 , 형식
 *   제어문 => 흐름(동작) , 사용처 , 형식
 *   1. 제어문의 종류 
 *      *** 제어문은 무조건 1개의 문장만 수행할 수 있다
 *        if(조건문)
 *         문장1  ====>  제어
 *         문장2  ====>  일반문장     //(x)
 *        
 *        if(조건문)    //여러문장쓸땐{}
 *        {
 *        	문장1
 *        	문장2
 *        }
 *      = 조건문
 *        = 단일 조건문
 *          형식)
 *              if(조건문) => 조건문(비교연산자,논리연산자,부정연산자)
 *              {
 *              	조건문이 true일 경우에 수행할 문장
 *              }
 *              => 명령문을 제어한다(수행(x),수행)
 *            ==> 단점은 속도가 느리다(단일 조건문 여러개 사용시)
 *                1개가 독립문장이기 때문에
 *                중복이 있는 경우에 사용이 가능 : 1~100까지 중에 3,5,7의 배수
 *                
 *        = 선택 조건문 : true와 false를 나눠서 작업
 *                     =>삼항연산자
 *          형식)
 *          	if(조건문)
 *          	{
 *          		조건문이 true
 *         	 	}
 *          	else
 *          	{
 *          		조건문이 false
 *          	}
 *          
 *        = 다중 조건문 : 한번만 수행할때 주로 사용
 *                     계산기 : +,-,*,/
 *          형식)
 *          	if(조건문)
 *          	{
 *          		조건문이 true면 수행하는 문장 ==> 종료
 *          		false면  ↘
 *                         밑에 있는 조건문으로 이동
 *         	 	}
 *          	else if(조건문)
 *          	{
 *          		조건문이 true면 수행하는 문장 ==> 종료
 *          		false면  ↘
 *                         밑에 있는 조건문으로 이동
 *          	}
 *          	else if(조건문)
 *          	{
 *          		조건문이 true면 수행하는 문장 ==> 종료
 *          		false면  ↘
 *                         밑에 있는 조건문으로 이동
 *          	}
 *          	else
 *          	{
 *          		// 생략이 가능
 *                  해당 조건이 없는 경우 처리하는 문장
 *          	}
 *          	예)
 *          	 int score=80
 *          	 if(score>=90)
 *          		A
 *          	 if(score>=80)
 *          	 	B
 *          	 if(score>=70)
 *          	 	C
 *          	 if(score>=60)
 *          	 	D
 *          	 if(score<60)
 *          		F              ===> 출력값 = D       //B나오려면 80~89범위 지정하기 or 다중조건문쓰기
 *                              
 *               int a=15;
 *               if(a%3==0)
 *               else if(a%5==0)
 *               else if(a%7==0)   ===> 출력:3의배수하고 종료    //단일조건문쓰기
 *          
 *      = 선택문
 *      = 반복문
 *      = 반복제어문 
 */

//단일 조건문 : 조건식(비교연산자,논리연산자,부정연산자)
//1.정수 한개를 입력받아서 짝수/홀수

import java.util.Scanner;
public class 제어문의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 클래스 => 키보드로 입력해서 저장 => 엔터 메모리에 저장
		/*
		 *    기능(메소드)
		 *    정수 : nextInt()
		 *    실수 : nextDouble()
		 *    문자열 : next()
		 *    논리 : nextBoolean()
		 *    문자 : X  ==> System.in => 정수로 들어옴 //형변환시켜야함
		 *    웹/윈도우 (char(X))
		 */
		// Scanner클래스 저장 => 클래스를 저장(new)
		// 동적바인딩만 가지고 있다
		Scanner scan=new Scanner(System.in);
		// System.in / System.out => 자바 표준입출력
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		//가공
		if(num%2==0)
		{
			System.out.println(num+"는(은) 짝수입니다");
		}
		if(num%2==1)   //num%2!=0 !(num%2==0)
		{
			System.out.println(num+"는(은) 홀수입니다");
		}
	}

}
