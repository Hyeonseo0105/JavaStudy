import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
	    //2번
//		int i = 0; 
//	    System.out.println("첫번째 결과 : " + i++ * 2); //0
//	    System.out.println("두번째 결과 : " + i);       //1
//	    
//	    int i = 0; 
//	    System.out.println("첫번째 결과 : " + ++i * 2); //2
//	    System.out.println("두번째 결과 : " + i);       //1
		
		//4번
//		int a = 3; 
//	     a = a + 1; 
//	     System.out.println(a); //4
//	     a += 1; 
//	     System.out.println(a); //5
//	     a -= 1; 
//	     System.out.println(a); //4
//	     a *= 2;
//	     System.out.println(a); //8
//	     a /= 2; 
//	     System.out.println(a); //4
//	     a %= 2; 
//	     System.out.println(a); //0
		
		//1.농구공문제    ==> 총페이지 만들 때 사용
		//import java.util.Scanner;
		//Scanner scan=new Scanner(System.in);
		//System.out.print("농구공 갯수:");
		//int ball=scan.nextInt();
		//System.out.print("필요한 박스:"+(ball%5==0?ball/5:ball/5+1));
	    //System.out.print("필요한 박스:"+(int)(Math.ceil(ball/5.0)));  //반올림함수
//		Scanner scan=new Scanner(System.in);
//		System.out.print("농구공 갯수:");
//		int ball=scan.nextInt();
//		
//		 int a= ball/5, c=ball/5+1;
//
//		System.out.print((ball%5==0)?"필요한 상자의 수:"+a:"필요한 상자의 수:"+c);
		
		

		//2.영어or숫자
//		Scanner scan=new Scanner(System.in);
//		System.out.print("입력:");
		//String aa=scan.next();  //
		//char ch=aa.charAt(0);   //char ch=scan.next().charAt(0);  
		                          //"ABC" ==> 012

//		char ch='z';
		//System.out.println("ch="+ch);
//		boolean b=(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'?true:false);  //숫자로 변환할 필요X=>65(X) 'A'(O)
//		System.out.println(b);
		
		//3.대문자->소문자
//	    char ch = 'D'; 
//	    char lowerCase = (char)(ch+32); 
//	    System.out.println("ch : " + ch); 
//	    System.out.println("ch to lowerCase : " + lowerCase);
		
		//import java.util.Scanner;
		//Scanner scan=new Scanner(System.in);
		//System.out.print("문자 입력:");
		//char ch=scan.next().charAt(0);
		//System.out.println("ch="+ch);
		//char lowerCase=(ch>='A'&& ch<='Z'?(char)(ch+32):ch);   //(char)(ch-32) : 소문자-> 대문자
		//System.out.println("변경된 값:"+lowerCase);
		
		/*
		 * 윤년여부
		 * ---->4년마다 
		 *      100년마다제외 
		 *      400년마다
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.println(
			(year%4==0 && year%100!=0)||(year%400==0)
			?year+"년도는 윤년입니다":year+"년도는 윤년이 아닙니다"
			);

	}
}

