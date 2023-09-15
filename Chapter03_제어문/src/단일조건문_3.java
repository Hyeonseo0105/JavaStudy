
/*
 * 1~100사이의 난수를 3개 발생
 * => 발생된 난수출력
 * =>max,min 출력
 */
public class 단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*100)+1;
		int num2=(int)(Math.random()*100)+1;
		int num3=(int)(Math.random()*100)+1;
		
		System.out.println("num1:"+num1+",num2:"+num2+",num3:"+num3);
		
		int max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		System.out.println("MAX:"+max);
		
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		System.out.println("MIN:"+min);
		
//		int a=(int)(Math.random()*100)+1;
//		int b=(int)(Math.random()*100)+1;
//		int c=(int)(Math.random()*100)+1;
//		
//		System.out.println("a:"+a+",b:"+b+",c:"+c);
//		
//		if(a>b && a>c)
//			System.out.println("MAX:"+a);
//		if(b>a && b>c)
//			System.out.println("MAX:"+b);
//		if(c>a && c>b)
//			System.out.println("MAX:"+c);
//		
//		if(a<b && a<c)
//			System.out.println("MIN:"+a);
//		if(b<a && b<c)
//			System.out.println("MIN:"+b);
//		if(c<a && c<b)
//			System.out.println("MIN:"+c);
	}

}
