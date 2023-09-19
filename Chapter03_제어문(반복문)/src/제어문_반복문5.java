//1~100까지 => 3의배수의합,5의배수합,7의배수합=>출력
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int three=0, five=0, seven=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)   //15
				three+=i;
			if(i%5==0)   //15 중복있기때문에 단일 조건문 써야함
				five+=i;
			if(i%7==0)
				seven+=i;
		}
		System.out.println("3의배수합:"+three);
		System.out.println("5의배수합:"+five);
		System.out.println("7의배수합:"+seven);
		
	}

}
