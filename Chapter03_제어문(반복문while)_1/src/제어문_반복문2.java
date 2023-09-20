/*
 *    while
 *    -----
 *       => 10개의 난수 => 1~100
 *       => 최대값/최소값
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1, min=100;   //바뀌면서 증가해야되니까 max는 가장작은값을 초기값으로
		int i=1;//루프변수 => 1~10
		while(i<=10)
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.print(rand+" ");
			//최대값,최소값
			if(max<rand)
				max=rand;
			if(min>rand)
				min=rand;
			i++;  //10이 돼서 나가야되니까
		}
		System.out.println("\n최대값:"+max+",최소값:"+min);
	}

}
