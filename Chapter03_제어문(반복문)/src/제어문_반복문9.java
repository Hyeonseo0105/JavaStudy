/*
 *    updown 게임
 *   -----------
 *     컴퓨터가 난수 발생 : 1~100
 *     --------------------
 *     => 힌트
 *       -----
 *       => 정답이 나올때까지 반복
 *         -----------------무한루프 : for(;;)
 *                                  while(true)
 */
import java.util.Scanner;
//import java.lang.* : random,System,String 자동추가되어있음
public class 제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수발생
		int com=(int)(Math.random()*100)+1;
		//종료=>break,system.exit(0)
		Scanner scan=new Scanner(System.in);
		int count=0;  //count나 sum은 0초기값    *나/는 1초기값
		for(;;)//무한루프
		{
			System.out.print("1~100사이의 값 입력:");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다.");
				continue; //다시 처음으로(1~100입력해라)
			}
			count++;
			//hint
			if(com>user)
			{
				System.out.println("높은 정수 입력(up)");
			}
			else if(com<user)
			{
				System.out.println("낮은 정수 입력(down)");
			}
			else//정답
			{
				System.out.println("Game Over!!");
				System.out.println("입력한 횟수:"+count);
				System.exit(0);//무한루프 프로그램 종료
			}
			
		}
		
		
	}

}
