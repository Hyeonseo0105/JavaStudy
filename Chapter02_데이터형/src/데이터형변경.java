
public class 데이터형변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int _int=(int)100.995465410;    //int=>소수점이하를 제거
		System.out.println("_int:"+_int);
		
		byte _byte=(byte)300;
		System.out.println("_byte:"+_byte);
		                 //100101100뒤에서 8비트 자르면(뒤부터) 44(00101100)만 남음
		System.out.println(0b00101100);
	}

}