package com.sist.main; // com : 회사 company / org : 개인 | sist : 회사명 | main : 구분 분류
import com.sist.util.User; // 서로 다른 패키지에 들어있을 경우 import를 사용하여 불러오기
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass2 m=new MainClass2(); // 같은 패키지에 있을 경우 import 사용할 필요 없음
	}

}
