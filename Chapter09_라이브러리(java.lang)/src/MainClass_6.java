class Member implements Cloneable
{
	String id;
	String pwd;
	String name;
	
	//초기화
	public Member()
	{
		id="admin";
		pwd="1234";
		name="서지수";
	}
	
	public void print()
	{
		System.out.println("ID:"+id);
		System.out.println("PWD:"+pwd);
		System.out.println("NAME:"+name);
	}
	//clone => 재정의(오버라이딩)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
/*
 *    Web관련 자바
 *   -----------
 *    J2SE / J2EE
 *    ----   ----
 *     |       |
 *   자바 기본   자바 웹
 *     toString() : 객체를 문자열로 변경
 *     clone() : 메모리 복제 => 새로운 메모리 생성
 *     finalize() : 호출이 되면 메모리 해제
 *    ----------- 자동 호출(확인)
 */
public class MainClass_6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Member m=new Member();
//		m.print();
//		
//		Member m1=(Member)m.clone();  //예외처리없어서 오류뜸
//		m1.print();
		Member m1=new Member();
		m1.print();
		
		m1.id="lim";
		m1.pwd="l0105";
		m1.name="임현서";
		m1.print();
		
		//Member m2=new Member();
		Member m2=(Member)m1.clone();
		//m1에 있는 메모리를 그대로 복사 => 새로운 메모리를 생성
		//아바타 => 디자인 패턴(prototype)
		//스프링에서 prototype을 사용하면 => 새로운 메모리를 생성
		m2.print();
		m2.id="mo";
		m2.pwd="m1234";
		m2.name="모진섭";
		
		m2.print();
		m1.print();
	}

}
