package com.sist.common;

// 웹 구분자 없이 사용 => 파일명(예: 200|aaa)
// 내부 프로토콜
// 80 21 => 서버에서 지시 => 클라이언트가 수행 => 이렇게 해야 같은 내용을 공유할 수 있음
public class Function {
	// 서버에 요청 => 구분
	public static final int LOGIN=100;
	public static final int MYLOG=110;
	public static final int WAITCHAT=200;
	public static final int MSGSEND=300;
	public static final int INFO=400;
	public static final int EXIT=900;
	public static final int MYEXIT=910;
	
}
