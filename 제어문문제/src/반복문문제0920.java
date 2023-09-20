import java.util.Scanner;
public class 반복문문제0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
//		x>10 && x<20
		
		//2번
//		char ch;
//		ch==' ' && ch!='\t'
		
		//3번
//		char ch;
//		ch='x' || ch='X'
		
		//4번
//		char ch;
//		ch>'0' && ch<'9' 
		
		//5번
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=6;j++)
//			{
//				if(i+j==6)
//				{
//					System.out.println("["+i+","+j+"]");
//				}
//			}
//		}
		
		
		//6번
		/*Scanner scan=new Scanner(System.in);
		System.out.print("시작 값:");
		int start=scan.nextInt();
		System.out.print("끝 값:");
		int end=scan.nextInt();
		int res=1;
		
		for(int i=start;i<=end;i++)
		{
			res*=i;
		}
		System.out.println("결과값:"+res);
		*/
//		Scanner scan=new Scanner(System.in);
//		System.out.print("첫번째 정수 입력:");
//		int a=scan.nextInt();
//		System.out.print("두번째 정수 입력:");
//		int b=scan.nextInt();
//		
//		for(int i=1;i<=a;i++)
//		{
//			for(int j=1;j<=b;j++)
//				
//			System.out.printf("%d*%d=%d",i,j,i*j);
//		}
		
		
		//7번
		/*int sum=0;
		for(int i=5;i<=16;i++)
		{
			sum+=i;
		}
		System.out.println("결과값:"+sum);
		*/
//		int sum=0;
//		for(int i=5;i<=16;i++)
//		{
//			sum+=i;
//		}
//		System.out.println("5~16까지의 합:"+sum);
		
		
		//8번
//		int sum=0;
//		for(int i=3;i<=4462;i++)
//		{
//			if(i%2==0)
//			{
//				sum+=i;
//				
//			}
//				
//		}
//		System.out.println("짝수인 정수의 합:"+sum);
		
		
		//9번
//		int sum2=0,sum3=0;
//		for(int i=0;i<=12;i++)
//		{
//			if(i%2==0)
//			{
//				sum2+=i;
//			}
//			if(i%3==0)
//			{
//				sum3+=i;
//			}
//		}
//		System.out.println("2의 배수의 합:"+sum2);
//		System.out.println("3의 배수의 합:"+sum3);
		
		
		//10번
//		int sum4=0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%4==0)
//				sum4+=i;
//		}
//		System.out.println("4의 배수의 합:"+sum4);
		
		
		//11번   //조회수(hit)
//		int count=0;
//		Scanner scan=new Scanner(System.in);
//		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.print(i+"번째 정수 입력:");
//			int a=scan.nextInt();
//			
//			if(i%2==0)
//				count++;
//		}
//		System.out.println("짝수의 개수:"+count);
		
		
		//12번
//		int count3=0, count5=0;
//		Scanner scan=new Scanner(System.in);
//		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.print(i+"번째 정수 입력:");
//			int a=scan.nextInt();
//			
//			if(i%3==0)
//				count3++;
//			if(i%5==0)
//				count5++;
//		}
//		System.out.println("3의 배수의 개수:"+count3);
//		System.out.println("5의 배수의 개수:"+count5);
		
		
		//13번
		//2차 for print ==> 한줄에 몇개 출력
		//1차 for print ==> 다음줄에 출력
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
		
		
		//14번
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.println(j);
//			}
//		}
		
		
		//15번
		
		  /*for(int i=1;i<=5;i++)
		  {
		 		for(int j=1;j<=5;j++)
		  		{
		  			if(i==j)
					{
						System.out.print(i);
					}
					else
					{
						System.out.print("#");
					}
				
			}
		 	System.out.println();
		}
		*/
		  		
		  
		 
//		int a=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{	
//				if(i==j)
//				{
//					System.out.print(a++);
//				}
//				else
//				{
//					System.out.print("#");
//				}
//				System.out.println();
//			}
//		}
		
		
		//17번
//		for(int i=1;i<=5;i++)
//		{	char ch='A';
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print(ch++);
//			}
//			System.out.println();
//		}
		
		
		//18번
		/*char c='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		*/
//		for(char i='A';i<='E';i++)
//		{
//			for(int j=1;j<=5;j++)
//				System.out.print(i+" ");
//		}
//		System.out.println();
		
		
	}

}
