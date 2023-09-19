//1~100까지 5의 배수의 합과 갯수
public class 제어문_반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int five=0, num=0;
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				five+=i;
				num++;
			}
		}
		System.out.println("5의배수의 합:"+five);
		System.out.println("5의배수의 갯수:"+num);
	}

}
