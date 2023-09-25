import java.util.Scanner;
public class 배열_생성1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];    //int kor1,kor2,kor3;
		//0 1 2 kor[0] kor[1] kor[3]
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.print((i+1)+"번째 국어 점수:");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 점수:");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 점수:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
		}
		for(int i=0;i<3;i++)
		{
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",	
				kor[i],eng[i],math[i],total[i],avg[i]);
		}
	}

}
