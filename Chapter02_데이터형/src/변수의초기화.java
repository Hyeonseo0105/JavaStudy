/*
 * 변수의 초기화
 * 1) 변수추출
 * 2) 변수선언(데이터형)
 * 3) 변수초기화
 * 	  = 명시적인 초기화
 *      int a=10;
 *    = 입력값
 *    	Scanner : 키보드 입력값을 받을 때 사용
 *      BufferedReader: 키보드 입력값, but 예외처리를 해줘야함
 *    = 임의값을 받아서 초기화
 *    	----랜덤
 *    = 크롤링(브라우저 값을 읽음, 데이터분석할때 많이씀)
 *    
 */
import java.util.Scanner;   //import:자바에 있는 (스캐너)를 읽어들임

public class 변수의초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=100;
		int b=(int)(Math.random()*100);  //random은 더블형 int로 바꿔주기
		                                //0.0 and less than 1.0  *100=>0~99  ()()+1=>1~100
		Scanner scan=new Scanner(System.in);
		                        //키보드 입력값
		System.out.println("정수입력:");
		int c=scan.nextInt();
		System.out.println(c);*/
		int a=10;
		int b=20;
		
		//a=20 , b=10
		//a=b;//a=20
		//b=a; => 둘다 20
		int temp=a;
		a=b;
		b=temp;              //책 p.37
	}

}
