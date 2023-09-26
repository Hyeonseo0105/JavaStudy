import java.util.Scanner;
public class 배열문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1번
//		1) int[] n = {1, 2, 3, 4, 5};
//		2) int n[] = {0};
//		3) int[] n = new int[3];
//		4) int n[3] = new int[3];
//		        4번틀림
		
		
		//2번
//		//1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라
//		char c[]=new char[10];
//		​
//	    //2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라
//		int n[]= {1,2,3,4,5};​
//	    //3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라
//		char day[]= {'일', '월', '화', '수', '목', '금', '토'};​
//	    //4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라
//		boolean bool[]= {true, false, false, true};
		
		
		//3번
//		char[] alpha = {'a', 'b', 'c', 'd'};
//
//		for(int i=0;i<alpha.length;i++)
//		{		     
//			System.out.print(alpha[i]);
//		}
		
		
		//4번
//		int[] a=new int[10];
//		for(int i=0;i<10;i++)
//		{
//			a[i]=(int)(Math.random()*100)+1;
//			System.out.print(a[i]+" ");
//			if(a[i]%3==0)
//			{
//				System.out.println("3의배수:"+a[i]);
//			}
//			
//		}
		
		
		//5번
//		double avg;
//		int sum=0;
//		int[] a=new int[10];
//		for(int i=0;i<10;i++)
//		{
//			a[i]=(int)(Math.random()*10)+1;
//			System.out.print(a[i]+" ");
//			sum+=a[i];
//		}
//		avg=sum/3.0;
//		System.out.println("\n합:"+sum);
//		System.out.println("평균:"+avg);
		
		
		//6번
		//1)5개 정수를 입력받은 후 차례로 출력하는 프로그램 
//		int[] a=new int[5];
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<5;i++)
//		{
//			System.out.print((i+1)+"번째 정수:");
//			a[i]=scan.nextInt();
//			
//		}
//		for(int i=0;i<5;i++)
//		System.out.print(a[i]+" ");
		
		//2)문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램
//		int[] a=new int[10];
//		for(int i=0;i<10;i++)
//		{
//			a[i]=(int)(Math.random()*100)+1;
//			System.out.print(a[i]);
//		}
		
		//3)정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
//		int[] a=new int[10];
//		for(int i=0;i<10;i++)
//		{
//			a[i]=(int)(Math.random()*100)+1;
//			System.out.print(a[i]+" ");
//		}
//		System.out.printf("\n%-5d%-5d%-5d",a[2],a[4],a[9]);
		
		//4)10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
		
		int[] a=new int[10];
		for(int i=0;i<10;i++)
		{
			
			a[i]=(int)(Math.random()*100)+1;
			int max=a[i];
			System.out.print(a[i]+" ");
			if(max<a[i])
			{
				max=a[i];
				System.out.println(max);
			}
			
		}
		
		
		//7번
		
		
	}

}
