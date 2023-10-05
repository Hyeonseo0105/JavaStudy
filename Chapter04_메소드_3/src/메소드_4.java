//로또 => 6개 정수 중복없이 추출(1~45) => 출력
//      ----------------------     ---
public class 메소드_4 {
	static int [] getRand()                      //static int [] getRand(int count)
	{
		int[] lotto=new int[6];                  //int[] lotto=new int[count];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;
					break;
				}
			}
		}
		return lotto;
	}
	static void print(int[] lotto)
	{
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=getRand();                   //int[] lotto=getRand(숫자(=count))
		print(lotto);
		
//		//추출
//		int[] lotto=new int[6];
//		for(int i=0;i<lotto.length;i++)
//		{
//			lotto[i]=(int)(Math.random()*45)+1;
//			for(int j=0;j<i;j++)
//			{
//				if(lotto[i]==lotto[j])
//				{
//					i--;
//					break;
//				}
//			}
//		}
//		for(int i:lotto)
//		{
//			System.out.print(i+" ");
//		}
	}

}
