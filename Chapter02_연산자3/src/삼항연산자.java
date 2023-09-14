// if~else 
// (조건)?값1:값2
//     조건 :true => 값1
//     조건 : false => 값2
// java.lang.* String,System,Math(scanner랑 다르게 import안붙여도 쓸수있음)
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=(int)(Math.random()*100)+1;
		//0.0~99.0 -> 0~99 -> 1~100
		//Random r=new Random() r.next(100)
		//System.out.println(a%2==0?a+"는(은)짝수다":a+"는(은)홀수다");
		
		//char c=(char)((Math.random()*26)+65);  //(Math.random()*26)+65 라고 적으면int 다 묶어야 char로바뀜
		//System.out.println(c>='A' && c<='Z'?c+"는(은) 대문자입니다.":c+"는(은) 소문자입니다.");
		
		char ch='a';
		char c=(char)((Math.random()*26)+65);
		int s=(int)(Math.random()*2);
		ch=s==0?c:(char)(c+32);
		//'A'+32 => 97    'a'
		System.out.println(ch>='A' && ch<='Z'?ch+"는 대문자입니다":ch+"는 소문자입니다");
		
		
	}

}
