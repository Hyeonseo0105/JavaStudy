package com.sist.main2;
class Super
{
	
}
class Sub extends Super
{
	
}
//NullPointerException , ClassCastException
public class MainClass4 {
	static String str;  //null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super ssss; //=> 오류(NullPointerException)
		Super s=new Sub();
		//Sub ss=(Sub)new Super();=>오류(ClassCastException)
		//Sub ss=(Sub)s;
		char c=str.charAt(0);
		//Super sss=new Super();
		//Sub ssss=(Sub)sss;
	}

}
