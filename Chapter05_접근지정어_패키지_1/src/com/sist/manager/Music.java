package com.sist.manager;


import lombok.Getter;
import lombok.Setter;

// 캡술화
@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor//매개변수 생성자

public class Music {
	// 변수 => 저장/값읽기
	//          ------- 메소드(setXxx,getXxx)
	private int mno;
	private String title;
	private String singer;
	private String album;
	private int idcrement;
	private String state;
	//은닉화 => 클라이언트가 볼 수 있게 만든다
	//변수 => 메모리에 저장 / 메모리에서 데이터 읽기
	//       읽기 / 쓰기 => 기능 추가 ==> getter/setter
}
