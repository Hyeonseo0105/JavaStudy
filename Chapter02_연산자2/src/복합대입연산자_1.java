/*
 *  *=, /=
 *  
 *  int a=10;
 *  a*=20;     ===>a=a*20 ==> a=10*20 ==> a=200
 *  
 *  int a=10;
 *  a/3        ===>a=a/3 ==> a=10/3 ==> a=3
 */
public class 복합대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;        //상수(final int a=10;)는 연산X ---> int b=a*20  상수 대문자로
		a*=20;
		System.out.println("a="+a);
		
		//a=10;
		a/=3;
		System.out.println("a="+a);
	}

}
