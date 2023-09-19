import java.util.Scanner;
public class 반복문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
		/* 변수(누적변수)
		 * 초기값:2   조건식:<=100   증가식:2
		 * for(int i=2;i<=100;i+=2)
		 
		int sum=0;//합을 누적할 변수
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		System.out.println("2+4+...+100의 합:"+sum);
		*/
//		int sum=0;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%2==0)
//				sum+=i;
//		}
//				System.out.println("2+4+...+100의 합:"+sum);
		
		
		//2번
		/*
		 * 초기값:5    조건식:<=50   증가식:+5
		 
		for(int i=5;i<=50;i+=5)
		{
			if(i==50)
				System.out.print(i);
			else
				System.out.print(i+",");
		}
		*/
//		for(int i=1;i<=50;i++)
//		{
//			if(i%5==0)
//				System.out.print(i+" ");
//		}
		
		
		//3번
		/*for(char c='B';c<='N';c+=2)
		{
			if(c!='N')
				System.out.print(c+",");
			else
				System.out.print(c);
		}
		*/
//		for(char i='B';i<='N';i+=2)
//			System.out.print(i+" ");
		
		
		//4번
		/*int num,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+num+"까지의합:"+sum);
		*/
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수입력:");
//		int a=scan.nextInt();
//		int sum=0;
//		for(int i=1;i<=a;i++)
//		{
//			sum+=i;
//		}
//		System.out.println("1~"+a+"까지의 합:"+sum);
		
		
		//5번
		/*for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
			if(i%6==0)
				System.out.println();
		}
		*/
//		for(int i=1;i<=30;i++)
//		{
//			if(i%2==0)
//				System.out.print(i+" ");
//			if(i%6==0)
//				System.out.println();
//		}
		
		
		//6번
		/*int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("1-2+3-4+5-6+7-8+9-10 합:"+sum);
		*/
//		int sum=0;
//		for(int i=1;i<=10;i++)
//		{
//			if(i%2==0)
//				sum-=i;
//			else
//				sum+=i;
//			
//		}
//		System.out.println("1-2+3-4+5-6+7-8+9-10 합:"+sum);
		
		
		//7번
		/*for(int i=1;i<=10;i++)
		{
			if(i%3==0)
				continue; //i++ 이동(증가식으로 이동)
			System.out.print(i+" ");
		}
		*/
//		for(int i=1;i<=10;i++)
//		{
//			if(i%3==0)
//				continue;
//			else
//				System.out.print(i+" ");
//		}
		
		
		//8번
		/*int sum=0,count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				count++;
				sum+=i;
			}
		}
		System.out.println("7의 배수 갯수:"+count);
		System.out.println("7의 배수 합:"+sum);
		*/
//		int a7=0,sum=0;
//		for(int i=100;i<=999;i++)
//		{
//			if(i%7==0)
//			{
//				a7++;
//				sum+=i;
//			}
//		} //i는 여기까지 사용(for문 안에서만) => 자동으로 소멸
//		System.out.println("7의 배수 갯수:"+a7);
//		System.out.println("7의 배수 합:"+sum);
		
		
		//9번
		/*int sum=0,count=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				sum+=i;
				count++;
			}
		}
		System.out.println("4의배수가 아닌 수의 갯수:"+count);
		System.out.println("4의배수가 아닌 수의 합:"+sum);
		*/
//		int a4=0,sum=0;
//		for(int i=100;i<=999;i++)
//		{
//			if(i%4!=0)
//			{
//				a4++;
//				sum+=i;
//			}
//			
//		}
//		System.out.println("갯수:"+a4);
//		System.out.println("합:"+sum);
		
		
		//10번
		/*int a=0, b=0;
		for(int i=1;i<=30;i++)
		{
			if(i%2==0)
				a+=i;
			else
				b+=i;
		}
		System.out.println("짝수합:"+a);
		System.out.println("홀수합:"+b);
		*/
//		int even=0, odd=0;
//		for(int i=1;i<=30;i++)
//		{
//			if(i%2==0)
//				even+=i;
//			else
//				odd+=i;
//		}
//		System.out.println("짝수합:"+even);
//		System.out.println("홀수합:"+odd);
		
		
		//11번
		/*for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.print(i+" ");
		}
		*/
//		for(int i=1;i<=100;i++)
//		{
//			if(i%3==0 && i%5==0)
//				System.out.print(i+" ");
//		}
		
		
		//12번
		/*int a=0, b=0;
		for(int i=1;i<=1000;i++)
		{
			if(i%7==0)
				a+=i;
			if(i%9==0)
				b+=i;
		}
		System.out.println("7의 배수의 합:"+a);
		System.out.println("9의 배수의 합:"+b);
		System.out.println("7의 배수+9의 배수:"+(a+b));
		*/
//		int sum7=0, sum9=0;
//		for(int i=1;i<=1000;i++)
//		{
//			if(i%7==0)
//				sum7+=i;
//			if(i%9==0)
//				sum9+=i;
//		}
//		System.out.println("7의 배수의 합:"+sum7);
//		System.out.println("9의 배수의 합:"+sum9);
//		System.out.println("7의 배수+9의 배수:"+(sum7+sum9));
		
		
		//13번
		/*for(int i=10;i<=99;i++)
		{
			if(i%11==0)
				System.out.print(i+" ");
		}
		*/
//		for(int i=10;i<=99;i++)
//		{
//			int a=i%10;
//			int b=i/10;
//			
//			if(a==b)
//				System.out.print(i+" ");
//		}
	}
}
