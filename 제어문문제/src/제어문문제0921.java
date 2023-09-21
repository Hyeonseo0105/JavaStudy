import java.util.Scanner;
public class 제어문문제0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		/*
		 * 조건문
		 * 단일조건문/ 선택조건문/ 다중조건문 => 형식 ,순서
		 * ------------------------
		 * 연산자 => 어떤 연산자 => 결과값?
		 * ------ 비교연산자, 논리연산자, 부정연산자
		 * 단일조건문
		 * -------
		 * 	if(조건문) => 오류(예외처리) => 사전에 오류방지 , 값입력 유도
		 *  {
		 *  	조건이 true일때만 수행
		 *  }
		 *  =>수행 => 건너뛴다
		 *  선택조건문  ==>  삼항연산자
		 *  -------
		 *    if(조건문)
		 *    {
		 *    	//사용자 , 회원 => 마이페이지
		 *    	조건문이 true일때 수행
		 *    }
		 *    else
		 *    {
		 *    	//관리자 , 게스트 => 관리자페이지
		 *    	조건문이 false일때 수행
		 *    }
		 *  다중조건문 => 조건에 맞는 문장만 수행  ==>  switch~case
		 *  -------
		 *    if(조건문)
		 *    {
		 *    	조건이 true일때 => 수행 => 종료
		 *    	false일때 밑에 조건문을 찾는다
		 *    }
		 *    else if(조건문)
		 *    {
		 *    	조건이 true일때 => 수행 => 종료
		 *    	false일때 밑에 조건문을 찾는다
		 *    }
		 *    else
		 *    {
		 *    	해당 조건이 없는 경우에 처리 문장
		 *    }
		 *  ==============================
		 *  선택문
		 *  switch(정수,문자,문자열)
		 *                -----
		 *  {
		 *  	case 값:
		 *  		처리문장
		 *  		break;
		 *      --
		 *      --
		 *      default:
		 *      	처리문장 ==> 생략 가능
		 *  }
		 */
		
		/*Scanner scan=new Scanner(System.in);
		System.out.print("2자리 정수를 입력하세요(10~99) >>");
		int num=scan.nextInt();
		if(num%11==0)
			System.out.println("10의 자리와 1의 자리가 같습니다");
		else
			System.out.println("10의 자리와 1의 자리가 같지않다");
			*/
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수입력:");
//		int a=scan.nextInt();
//		if(a%11==0)
//		{		
//			System.out.println("10의 자리와 1의 자리가 같습니다");
//		}
//		else if(a>=100 || a<10)
//		{
//			System.out.println("2자리 정수를 입력하세요");
//		}
//		else
//			System.out.println("10의 자리와 1의 자리가 다르다");

		
		//2번
		/*
		 *   다중 조건문 /선택문
		 */
		/*Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요:");
		int month=scan.nextInt();
		if(month>=3 && month<=5)
		{
			System.out.println(month+"월은 봄 입니다");
		}
		else if(month>=6 && month<=8)
		{
			System.out.println(month+"월은 여름 입니다");
		}
		else if(month>=9 && month<=11)
		{
			System.out.println(month+"월은 가을 입니다");
		}
		else if(month==12 || month==1 || month==2)
		{
			System.out.println(month+"월은 겨울 입니다");
		}
		else
		{
			System.out.println("잘못된 입력");
		}
		*/
		/*Scanner scan=new Scanner(System.in);
		System.out.print("달을 입력하세요:");
		int month=scan.nextInt();
		switch(month)
		{
		case 12:case 1:case 2:
			System.out.println(month+"월은 겨울 입니다");
			break;
		case 3:case 4:case 5:
			System.out.println(month+"월은 봄 입니다");
			break;
		case 6:case 7:case 8:
			System.out.println(month+"월은 여름 입니다");
			break;
		case 9:case 10:case 11:
			System.out.println(month+"월은 가을 입니다");
			break;
		default:
			System.out.println("잘못된입력");
		}
		*/
		
//		int a=1;
//		Scanner scan=new Scanner(System.in);
//		System.out.print("달을 입력하세요:");
//		a=scan.nextInt();
//		if(a>=3 && a<=5)
//			System.out.println(a+"월은 봄 입니다");
//		else if(a>=6 && a<=8)
//			System.out.println(a+"월은 여름 입니다");
//		else if(a>=9 && a<=11)
//			System.out.println(a+"월은 가을 입니다");
//		else if(a==12 || a==1 || a==2)
//			System.out.println(a+"월은 겨울 입니다");
//		else
//			System.out.println("1~12월 중 하나를 입력하세요");
//		switch(a)
//		{
//		case 1:
//		case 2:
//		case 12:
//			System.out.println("겨울");
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("봄");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여름");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("가을");
//			break;
//		default:
//			System.out.println("다시입력");
//		}
		
		
		
		//3번
//		int sum=0, i=1;
//		while (i<100) 
//		{
//		    if(i%3 != 0) 
//		    {
//		        i++;
//		        continue;
//		    }
//		    else 
//		    {
//		    	sum += i;
//		    	i++;
//		    }
//		}
//		System.out.println("3의 배수 합:"+sum);
		
		
		//4번
//		int sum=0,i=1;
//		while (true) 
//		{
//		    if(i>50) 
//		    {
//		   		break;
//		   	}
//		    sum+=i;
//		    i++;  
//		} 
//		System.out.println(sum);
		
		
		//5번
//		int sum=0;
//		double avg=0;
//		for(int i=1;i<=10;i++)
//		{
//			int a=(int)(Math.random()*10)+1;
//			System.out.print(a+" ");
//			sum+=a;
//			avg=sum/10.0;
//			
//		}
//		System.out.println("\n합:"+sum);
//		System.out.println("평균:"+avg);  //avg 안써도 됨
		                                 //System.out.printf("평균:%.1f\n",sum/10.0);
//		int i=1;
//		while(i<=10)
//		{
//			int a=(int)(Math.random()*10)+1;
//			System.out.print(a+" ");
//			sum+=a;
//			avg=sum/10.0;
//			i++;
//		}
//		System.out.println("\n합:"+sum);
//		System.out.println("평균:"+avg);
//		int i=1;
		
//		do
//		{
//			int a=(int)(Math.random()*10)+1;
//			System.out.print(a+" ");
//			sum+=a;
//			avg=sum/10.0;
//			i++;
//		}
//		while(i<=10);
//		System.out.println("\n합:"+sum);
//		System.out.println("평균:"+avg);
		
		
		//6번
//		int sum=0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%2==0)
//				sum+=i;
//				
//		}
//		System.out.println("짝수합:"+sum);
		
		
		//7번
		/*int count=0;
		while(true)
		{
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			count++;
			System.out.println("["+a+","+b+"]");
			if(a==b)
			{
				break;
			}
			
		}
		System.out.println("count="+count);
		*/
//		int i=1;
//		while(true)
//		{	
//			int a=(int)(Math.random()*6)+1;
//			int b=(int)(Math.random()*6)+1;
//			System.out.println("["+a+","+b+"]");
//			if(a==b)
//			{
//				System.out.println("주사위:["+a+","+b+"]");
//				System.out.println("반복횟수:"+i);
//				break;
//			}
//			i++;
//			
//		}
	}
	

}
