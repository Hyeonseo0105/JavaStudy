import java.util.*;
public class 문제0927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1번
//		Scanner scan=new Scanner(System.in);
//		int[] kor=new int[5];
//		int[] rank=new int[5];
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.print((i+1)+"번째 학생의 국어 점수 입력:");
//			kor[i]=scan.nextInt();
//		}
//		for(int i=0;i<kor.length;i++)      //1차
//		{
//			rank[i]=1;
//			for(int j=0;j<kor.length;j++)  //2차
//			{
//				if(kor[i]<kor[j])
//				{
//					rank[i]++;
//				}
//			}
//		}
//		//출력
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.printf("%-5d%-5d\n",kor[i],rank[i]);
//		}
		
		
		//2번
//		int[] num=new int[10];
//		for(int i=1;i<num.length;i++)
//		{
//			num[i]=(int)(Math.random()*100)+1;
//			System.out.print(num[i]+" ");
//		}
//		int max=0, min=100;
//		for(int i=1;i<num.length;i++)
//		{
//			if(max<num[i])
//				max=num[i];
//			if(min>num[i])
//				min=num[i];
//		}
//		System.out.println("\n최대값:"+max+" 최소값:"+min);
		
		
		//3번
//		int[] num=new int[100];
//		for(int i=0;i<num.length;i++)
//		{
//			num[i]=(int)(Math.random()*10);
//		}
//		System.out.println(Arrays.toString(num));
//		int[] count=new int[10];
//		for(int i=0;i<num.length;i++)
//		{
//			count[num[i]]++;
//		}
//		for(int i=0;i<count.length;i++)
//		{
//			System.out.println(i+":"+count[i]);
//		}
		
		
		//4번
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++)
//		{
//			num[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(num));
//		System.out.println(num[1]);
		
		
		//5번
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++)
//		{
//			num[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(num));
//		
//		int max=0;
//		for(int i=0;i<num.length;i++)
//		{
//			if(max<num[i])
//				max=num[i];
//		}
//		System.out.println("최대값:"+max);
		
		
		//6번
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++)
//		{
//			num[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(num));
//		int sum=0;
//		double avg=0;
//		for(int i=0;i<num.length;i++)
//		{
//			sum+=num[i];
//			avg=sum/10.0;
//		}
//		System.out.println("배열의 합:"+sum);
//		System.out.println("배열의 평균:"+avg);
		
		
		//7번
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++)
//		{
//			num[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(num));
//		for(int i=0;i<num.length;i++)
//		{
//			if(i==3)
//				continue;
//			else
//				System.out.print(num[i]+" ");
//		}
		
		
		//8번
//		Scanner scan=new Scanner(System.in);
//		int a,b;
//		int[] num=new int[5];
//		for(int i=0;i<num.length;i++)
//		{
//			num[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(num));
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.print("첫번째 정수 입력:");
//			a=scan.nextInt();
//			System.out.print("두번째 정수 입력:");
//			b=scan.nextInt();
//			int temp=num[a];
//			num[a]=num[b];
//			num[b]=temp;
//			System.out.printf("%-3d%-3d",num[a],num[b]);
//			break;
//		}
		
		
		//9번
		/*char[] arr=new char[26];
		char c='A';
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=c++;
		}
		*/
//		char[] a=new char[26];
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=(char)((Math.random()*26)+65);
//			//System.out.print(a[i]+" ");
//		}
//		System.out.println(Arrays.toString(a));
//		char[] a= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//		System.out.println(a);
		
		
		//10번
//		char[] a= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//		for(int i=0;i<a.length-1;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]<a[j])
//				{
//					char temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));
		
		
		//11번
//		Scanner scan=new Scanner(System.in);
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.print((i+1)+"번째 정수 입력:");
//			num[i]=scan.nextInt();
//			
//		}
//		for(int i=0;i<num.length;i++)
//		{
//			if(num[i]%3==0)
//				System.out.print(num[i]+" ");
//		}
		
		
		//12번
//		Scanner scan=new Scanner(System.in);
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++)
//		{
//			System.out.print((i+1)+"번째 정수 입력:");
//			num[i]=scan.nextInt();
//		}
//		int max1=0, max2=0;
//		for(int i=0;i<num.length;i++)
//		{
//			if(num[i]%2==0)
//			{
//				if(max2<num[i])
//					max2=num[i];
//			}
//			if(num[i]%2!=0)
//			{
//				if(max1<num[i])
//					max1=num[i];
//			}
//		}
//		System.out.println("짝수의 최대값:"+max2+"홀수의 최대값:"+max1);
		
		
		//13번
//		Scanner scan=new Scanner(System.in);
//		int[] kor=new int[3];
//		int[] eng=new int[3];
//		int[] math=new int[3];
//		int[] total=new int[3];
//		double[] avg=new double[3];
//		int[] a=new int[3];
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.print((i+1)+"번째 학생 국어 점수:");
//			kor[i]=scan.nextInt();
//			System.out.print((i+1)+"번째 학생 영어 점수:");
//			eng[i]=scan.nextInt();
//			System.out.print((i+1)+"번째 학생 수학 점수:");
//			math[i]=scan.nextInt();
//			
//			total[i]=kor[i]+eng[i]+math[i];
//			avg[i]=total[i]/3.0;
//		}
//		for(int i=0;i<kor.length;i++)      //1차
//			{
//				a[i]=1;
//				for(int j=0;j<kor.length;j++)  //2차
//				{
//					if(total[i]<total[j])
//					{
//						a[i]++;
//					}
//				}
//			}
//		for(int i=0;i<kor.length;i++)
//		{
//			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%d\n",
//					kor[i],eng[i],math[i],total[i],avg[i],a[i]);
//		}
	}
}
