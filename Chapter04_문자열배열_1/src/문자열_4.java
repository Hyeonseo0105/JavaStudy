/*
 *   substring() => 문자를 자른다
 *   "Hello Java"
 *    0123456789
 *    
 *    substring(6) ==> Java (6번부터 끝까지)
 *    substring(0,5) ==> Hello  (0번부터 4번까지)
 *                -제외
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String address="서울특별시 성동구 서울숲2길 18-11 1F 지번 서울시 성동구 신사동 성수동1가 685-450 1F";
		//String s1=s.substring(0, 5);
		//String s1=s.substring(6);
		//System.out.println(s1);
		//String addr=address.substring(0,address.indexOf("지번"));
		//String addr2=address.substring(address.indexOf("지번")+3);  //지번 뒤부터 출력
		//String s1=address.substring(0,25);
		//System.out.println(addr);
		//System.out.println(addr2);
		//String addr=address.substring(address.indexOf("신사동"),address.indexOf("성수동1가")-1);
		//System.out.println(addr);
		//int a=address.lastIndexOf(" ");
		//String addr=address.substring(a-3,a);
		//System.out.println(addr);
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf("."));    //=> .Java
		//String s=ext.substring(ext.lastIndexOf(".")+1);    //=> Java
		System.out.println(s);
		
				
	}

}
