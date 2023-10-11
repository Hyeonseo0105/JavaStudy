class Member{
	// 우선 순위는 명시적 초기화
	// 1
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="임현서";
	//Member(){} 생략된것
	//2
	{
		mno=3;
		id="kim";
		pwd="1234";
		name="도영";
		//파일 읽어서 값 대입
	}
	//3
//	Member(){
//		mno=2;
//		id="hong";
//		pwd="1234";
//		name="정재현";
//	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();    //메모리 저장 => 생성자 호출
		System.out.println("번호:"+m1.mno);
		System.out.println("아이디:"+m1.id);
		System.out.println("비밀번호:"+m1.pwd);
		System.out.println("이름:"+m1.name);
		System.out.println("==========================");
		
		Member m2=new Member();  //메모리 저장
		System.out.println("번호:"+m2.mno);
		System.out.println("아이디:"+m2.id);
		System.out.println("비밀번호:"+m2.pwd);
		System.out.println("이름:"+m2.name);
	}

}
