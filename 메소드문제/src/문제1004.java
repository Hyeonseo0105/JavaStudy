import java.util.Scanner;
public class 문제1004 {
	//1번
//	static String userInput()
//	static boolean idCheck(String id)
	//2번
//	static int userInput()
//	static void gugudan(int dan)
	
	
	//1번
	/*
	 * 리턴형/매개변수
	 * 리턴형 메소드명(매개변수)
	 * {          ------가변 매개변수
	 *   => 자체에서 void(결과값 없는 상태)
	 * } 
	 * 메소드 : 기능처리 (연산자+제어문)
	 *        = 다른 클래스 연결
	 *        = 재사용(호출)
	 */
/*	static void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	//메인에 print();
	static void a()
	*/
//	{	
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//		}
//	}
	
	
	//2번
	/*
	 * 사용자가 요청하는 값은 없다 ==> 매개변수 없다
	 * 메소드 자체에서 출력 => 결과값 => main()
	 * 리턴형O 매개변수X 
	 */
	/*static int sum()
	{
		int hap=0;
		for(int i=1;i<=10;i++)
		{
			hap+=i;
		}
		return hap;
	}
	//메인에	int hap=sum();
			System.out.println(hap);
	 */
//	static void a()
//	{
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			sum+=i;
//		}
//		System.out.println(sum);
//	}
	
// 메인에 a();	
	
	//3번
	/*
	 * 매개변수O 리턴형X
	 * 메소드 사용시에  => 호출 
	 * ------------------ main()은 컴파일러에 의해 자동 호출
	 *                    --------------------------
	 *                                | Callback
	 * 메소드
	 *   = Callback => main => 자동 호출되는 메소드(시작점)
	 *   = 사용자 정의 : 프로그래머가 직접 제작
	 *   = 라이브러리  : 이미 제작된 메소드 => 만들지 못하는 프로그램
	 *     = 자바에서 제공
	 *     = 외부업체에서 지원(Jsoup,Spring) => mvnrepository.com
	 *     = CBD => 조립식
	 *       ----------- 메소드 호출
	 *   = 조립할때 , 재사용 , 유지보수가 편리하게 만든다
	 *   = 재사용
	 *       메소드를 불러온다
	 *       ------------
	 *        int aaa()     ===> int a=aaa()
	 *        double bbb()  ===> double b=bbb() 
	 *        void ccc()    ===> ccc()
	 *        boolean ddd() ===> boolean d=ddd()
	 *       -----------------------------------
	 *        class A
	 *        {
	 *        		int aaa(){}
	 *        }
	 *        class B
	 *        {
	 *        		main()
	 *        		{
	 *        			A.aaa()   ===> (int)(Math.random()*100)
	 *                                       ------------ double
	 *        		}
	 *        }
	 */
	/*static void sum(int n)
	{
		int hap=0;
		for(int i=1;i<=n;i++)
		{
			hap+=i;
		}
		System.out.println(hap);
	}
	//메인에 Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		sum(num);
		*/
//	static int userInput()
//	{
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수입력:");
//		return scan.nextInt();
//	}
//	static int sum(int a)
//	{
//		int sum=0;
//		for(int i=0;i<=a;i++)
//		{
//			sum+=i;
//		}
//		return sum;
//	}
// 메인에	int a=userInput();
//		int s=sum(a);
//		System.out.println(s);	
	
	
	//4번
	/*
	 *  리턴형 / 매개변수(2)
	 */
	/*static String div(int a,int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다.";
		else
			result=a+"/"+b+"="+a/b;	
		//String => format
		
		return result;
	}		
	//메인에  Scanner scan=new Scanner(System.in);
			System.out.print("첫번째 정수 입력:");
			int a=scan.nextInt();
			System.out.print("두번째 정수 입력:");
			int b=scan.nextInt();
		
			String res=div(a,b);
			System.out.println(res);
			*/
//	static int userInput(String a)
//	{
//		Scanner scan=new Scanner(System.in);
//		System.out.print(a+" 정수 입력:");
//		return scan.nextInt();
//	}
//	static void c()
//	{
//		int num1=userInput("첫번째");
//		int num2=userInput("두번째");
//		if(num2==0)
//			System.out.println("잘못입력");
//		else
//			System.out.printf("%.2f\n",(num1/(double)num2));
//	}
// 메인에 c();
	
	
	//5번
	/*static void change(String msg)
	{
		System.out.println(msg.toUpperCase());
	}
	//메인에 change("bcde")
	 */
	
	
	//6번
	/*static void reverse(String msg)
	{
		for(int i=msg.length()-1;i>=0;i--)
		{
			char c=msg.charAt(i);
			System.out.print(c);
		}
	}
	//메인에 reverse("Hello")
	 */
	
	
	//7번
	/*static int yearInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		return scan.nextInt();
	}
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || year%400==0)
			bCheck=true;
		return bCheck;
	}
	static void print() 
	{
		int year=yearInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
		{
			System.out.println(year+"년도는 윤년입니다.");
		}
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	//메인에 print();
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
