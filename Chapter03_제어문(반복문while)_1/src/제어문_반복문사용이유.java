//5개 난수(1~100) => 최대값
public class 제어문_반복문사용이유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=(int)(Math.random()*100)+1;
		int a2=(int)(Math.random()*100)+1;
		int a3=(int)(Math.random()*100)+1;
		int a4=(int)(Math.random()*100)+1;
		int a5=(int)(Math.random()*100)+1;
		//System.out.printf("%d,%d,%d,%d,%d",a1,a2,a3,a4,a5);
		int max=1;
		if(max<a1)
			max=a1;
		if(max<a2)
			max=a2;
		if(max<a3)
			max=a3;
		if(max<a4)
			max=a4;
		if(max<a5)
			max=a5;
		
		System.out.println("최대값:"+max);
	}

}
