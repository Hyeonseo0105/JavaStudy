/*
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 *   
 *    i    j
 *   줄수   별표
 *    1    1
 *    2    2
 *    3    3
 *    4    4   i=j  =>  j<=i
 *    
 *    
 *    ★★★★
 *    ★★★
 *    ★★
 *    ★
 *    i    j
 *   줄수   별표
 *    1    4   | 역순 => 더한다 => 5
 *    2    3
 *    3    2
 *    4    1   => 5-i=j
 *    
 *    A
 *    BC
 *    DEF
 *    GHIJ
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=4;i++) 
//		{
//			for(int j=1;j<=5-i;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		char a='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a++);
			}
			System.out.println();
		}
		
	}
}
