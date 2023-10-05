// => updown게임
import java.util.Scanner;
public class 메소드_문제_6 {
	static int com()
	{
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력(1~100):");
		int user=scan.nextInt();
		return user;
	}
	static String hint(int user, int com)
	{
		String res="";
			if(com>user)
			{
				res="입력된 값보다 큰 수를 입력하세요";
			}
			else if(com<user)
			{
				res="입력된 값보다 작은 수를 입력하세요";
			}
			else
			{
				res="Game Over!!";
			}
			return res;
	}
	static void process()
	{
		int com=com();
		while(true)
		{
			Scanner scan=new Scanner(System.in);
			int user=userInput();
			String res=hint(user,com);
			System.out.println(res);
			if(res.contains("Game"))
			{
				System.out.println("게임을 다시 할까요?(Y|N):");
				char c=scan.next().charAt(0);
				if(c=='Y'||c=='y')
				{
					System.out.println("새로운 게임을 시작합니다!");
					process();
				}
				else
				{
					System.out.println("Game Over!!");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int com=(int)(Math.random()*100)+1;
//		Scanner scan=new Scanner(System.in);
//		
//		while(true)
//		{
//			System.out.print("정수 입력(1~100):");
//			int user=scan.nextInt();
//			
//			if(com>user)
//			{
//				System.out.println("입력된 값보다 큰 수를 입력하세요");
//			}
//			else if(com<user)
//			{
//				System.out.println("입력된 값보다 작은 수를 입력하세요");
//			}
//			else
//			{
//				System.out.println("Game Over!!");
//				break;
//			}
//		}
		process();
	}

}
