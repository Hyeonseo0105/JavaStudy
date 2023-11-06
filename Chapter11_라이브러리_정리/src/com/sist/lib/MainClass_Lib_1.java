package com.sist.lib;
/*
 *    라이브러리
 *    **= java.lang
 *         Object
 *         String
 *         StringBuffer
 *         Math
 *         Wrapper
 *       -------------
 *    **= java.util
 *         StringTokenizer
 *         Date / Calendar
 *         ArrayList
 *         HashSet
 *         HashMap
 *         
 *    **= java.io
 *         FileInputStream / FileOutputStream
 *         FileReader / FileWriter
 *         BufferedReader
 *         BufferedInputStream / BufferedOuputStream
 *        -------------------------------------------
 *      = java.sql : Connection / Statement / ResultSet
 *      = java.text   ,   java.net
 *        ---------       -------- URL / URLEncoder / Socket
 *            |
 *       DecimalFormat / SimpleDateFormat
 *      ------------------------ 자바를 사용하는 모든 소스의 기본
 *      = java.http.servlet(Web) ==> JSP
 *      = 외부 라이브러리
 *         org.springframework...
 *         org.mybatis...
 *         org.jsoup...
 *      
 *      = 사용자 정의
 *         => 기본
 *             변수
 *               => 데이터형
 *                   정수  : int , long , byte
 *                   실수  : double
 *                   논리  : boolean
 *                   문자열 : String 
 *             연산자
 *               => 증감연산자(++,--)
 *               => 부정연산자(!)
 *               => 형변환연산자(type)
 *               => 산술연산자(+,-,*,/,%)
 *               => 비교연산자(<,>,<=,>=,==,!=)
 *               => 논리연산자(&&,||)
 *               => 대입(=,+=,-=)
 *             제어문
 *               => if
 *                   => if(조건)
 *                   => if~else
 *               => for => for-each
 *               => while
 *               => break
 *             
 *         => 클래스
 *             = 멤버변수 / 공유변수
 *             = 메소드
 *                 public 리턴형 메소드(매개변수...)
 *                 {
 *                    => 리턴형이 없는 경우 => void
 *                 }
 *             = 생성자
 *                 => 초기화 / 시작과 동시에 처리
 *                 => 리턴형이 없다 => 클래스명과 동일
 *                 => 사용이 없는 경우에는 자동 디폴트 생성자가 초기화 된다
 *                 => 상속이 안된다...
 *             = 초기화 블록
 *                 => 인스턴스 블록 : 인스턴스변수 , static변수 초기화 가능
 *                                 인스턴스는 주로 생성자 이용
 *                 => static 블록 : static변수만 초기화가 가능
 *                                 => 인스턴스변수 초기화시에는 반드시 객체 생성후에 사용
 *                                 static변수 초기화시 주로 사용
 *                 => 멤버변수는 private
 *                    ---------------- 접근시에 기능 부여
 *                                     ---------------
 *                                메소드(읽기/쓰기 => getter/setter)
 *                    메소드,생성자,클래스는 주로 public
 *                    
 *         => 특성
 *             = 캡슐화 / 상속/포함 / 오버라이딩
 *             1. 데이터 보호 : 캡슐화(데이터를 은닉화(private) => 메소드 이용해서 접근)
 *             2. 재사용
 *                  = 수정해서 사용 : 상속
 *                  = 있는 그대로 사용 : 포함
 *                  ----------------------
 *                    class A
 *                    {
 *                       //클래스 선언시 포함
 *                       public void aaa()
 *                       {
 *                          Scanner scan=new ...(X)
 *                       }
 *                    }
 *             3. 수정,추가 용이하게 만든다 (다형성)
 *                  = 수정 : 오버라이딩
 *                  = 추가 : 오버로딩
 *                  
 *                               오버라이딩        오버로딩   ==>   기술면접(95%이상)
 *                   형태           상속           클래스내
 *                   메소드명        동일            동일
 *                   매개변수        동일         갯수나 데이터형이 다르다
 *                   리턴형          동일           관계없다
 *                   접근지정어       동일           관계없다
 *                   
 *                   private < default < protected < public
 *                   
 *                   자바 / 오라클 / 스프링
 *                   -----------
 *                     => 7문제 => 6문제
 *                   ------------------
 *                   
 *            ------------------------ 대규모 프로젝트에서 주로 사용
 *         => 클래스의 종류
 *             = 인터페이스
 *               -------(80%)
 *                관련된 클래스를 모아서 관리
 *                결합성이 낮은 프로그램(영향을 줄이는 프로그램)
 *                                  ====
 *                                   A(에러) ->  B(에러)
 *                                           |
 *                                        인터페이스
 *             = 상속
 *               --- 다중 상속
 *               --- extends(X) => implements
 *                 
 *                 interface = interface
 *                 
 *                 interface A
 *                 interface B
 *                 class C implements A,B
 *                                    ---
 *               ---
 *                 interface interface명
 *                 {
 *                    -----------------------
 *                      변수 
 *                       => public static final 데이터형 변수명=값
 *                          -------------------        -------
 *                            자동 추가(상수형 변수)
 *                            
 *                          public int a=10;
 *                               ---
 *                                |
 *                            static final
 *                    -----------------------
 *                      메소드(선언)
 *                         public abstract void 메소드명();
 *                         ---------------
 *                           자동 추가
 *                         public void 메소드명();
 *                              ---
 *                               |abstract
 *                     -----------------------
 *                       메소드(구현)
 *                         public default 리턴형 메소드명(){}
 *                                ------- 구현이 가능한 메소드를 알려준다
 *                         ------ 생략하면 자동 추가
 *                         
 *                         public static 리턴형 메소드명(){}
 *                          => 항상 인터페이스를 이용해서만 접근이 가능
 *                     -----------------------
 *                 }
 *                 
 *              ***** new를 이용하지 않고 객체생성 => 추상클래스 , 인터페이스
 *                    File file=new File()
 *                              ---
 *                    List list=new List() => 오류
 *                    list 
 *                 
 *                 interface A => 무조건 public
 *                 {
 *                    void aaa();
 *                 }
 *                 class B implements A
 *                 {
 *                    //오류  --->  public 붙여줘야 오류X
 *                    void aaa(){
 *                    }
 *                 }
 *         => 제어어
 *             static / abstract / final
 *             공유하는    공통으로    마지막
 *         => 접근지정어
 *             private / default / public
 *                |        |         |
 *                |        |      패키지 상관없이 모든 클래스
 *                |    같은 패키지에서만
 *             자신 클래스 내에서만
 *             
 *        *** 자바 주로 사용
 *            -----------
 *              = 웹
 *              = 모바일
 *             ------------> 지금 정리된 내용 거의 사용
 */
import java.util.*;
public class MainClass_Lib_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
