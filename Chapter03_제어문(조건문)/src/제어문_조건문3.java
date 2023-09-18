/*
 *   다중 조건문 => 결과값이 1개만 도출
 *   형식)
 *           |
 *       if(조건문)
 *       {
 *       	조건이 true일때 수행 문장 ===> 종료
 *                |
 *       }        |false
 *       else if(조건문)
 *       {
 *       	조건이 true일때 수행 문장 ===> 종료
 *                |
 *       }        |false
 *       else if(조건문)
 *       {
 *       	조건이 true일때 수행 문장 ===> 종료
 *                |
 *       }        |false
 *       ...
 *       ...
 *                
 *       else   //생략가능 => 해당 조건이 없는 경우에 처리
 *       {
 *       	해당 조건이 없는 경우에 처리
 *       }
 *       //한개의 문장만 수행
 *       //게임,네트워크 서버(자바(X),C/C++)
 */
//국어,영어,수학 점수를 입력받아서 => 총점,평균,학점,합격/불합격

import java.util.Scanner;

public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터를 저장할 공간 => 변수
		int kor,eng,math,total;
		double avg;
		char score=' ';  //명시적초기화
		//입력값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수:");
		kor=scan.nextInt();
		System.out.print("영어 점수:");
		eng=scan.nextInt();
		System.out.print("수학 점수:");
		math=scan.nextInt();
		
		//초기화
		total=kor+eng+math;
		avg=total/3.0;
		//학점 => 평균 => >=90A >=80B >=70C <=60D <60F
		
		// 결과값을 출력 => 제어문, 연산자 ===> DOS,브라우저,모바일
		if(avg>=90 && avg<=100)
			score='A';
		else if(avg>=80 && avg<90)
			score='B';
		else if(avg>=70 && avg<80)
			score='C';
		else if(avg>=60 && avg<70)
			score='D';
		else
			score='F';
		System.out.println("국어:"+kor+",영어:"+eng+",수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.printf("학점:"+score);
	}

}
