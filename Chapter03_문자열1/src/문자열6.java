import java.util.Scanner;

//startsWith, endsWith, contains => 검색기 , 자동완성기(서제스트)
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programain",
				"JQuery AND AJAX",
				"SPRINT AND Java"
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String findData=scan.nextLine();   //next()공백 앞에서 끊김   전체 가져오려면 nextLine()
		System.out.println(findData);
		for(int i=0;i<data.length;i++)
		{
			if(data[i].contains(findData))     //검색된 단어가 포함된 단어
			//if(data[i].endsWith(findData))
			//if(data[i].startsWith(findData)) //검색한 단어로 시작하는
			{
				try
				{
					Thread.sleep(500);    //0.5초 후에 출력
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
	}

}
