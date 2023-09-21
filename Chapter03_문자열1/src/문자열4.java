// charAt...
// 대문자/소문자 변경
import java.util.Scanner;
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		// 대문자 출력
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			System.out.print((char)(c-32));
//		}
		//System.out.println(s.toUpperCase());
		
		//A=>65 a=97
		s="ABCDEFG";
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				System.out.print((char)(c+32));
			}
		System.out.println(s.toLowerCase());
//		int [] bin=new int[16];
//		int index=15;
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num=scan.nextInt();
//		
//		System.out.println(Integer.toBinaryString(num));  //2진법으로
//		
//		while(true)
//		{
//			bin[index]=num%2;
//			num=num/2;
//			if(num==0)
//				break;
//			index--;
//		}
//		for(int i=0;i<bin.length;i++)
//		{
//			if(i%4==0 && i!=0)
//			{
//				System.out.println(" ");
//			}
//			System.out.println();
//		}
	}

}
