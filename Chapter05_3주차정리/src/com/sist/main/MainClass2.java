package com.sist.main;

/*
 * 	1. 접근 지정어 : 접근이 가능한 범위를 설정
 * 		- private : 멤버 변수 선언
 * 			=> 자신의 클래스에서만 사용 가능 => 은닉화
 * 			예) private String id;
 * 				private String pwd;
 * 		- default : 윈도우(버튼, 기타 컴포넌트)
 * 			=> 같은 패키지에 있는 다른 클래스애 접근 가능
 * 			예) int num;
 * 				JButton btn;
 * 		- protected : 거의 사용 빈도가 없음
 * 			=> 같은 패키지에 있는 클래스, 다른 패키지의 상속이 있는 클래스에 접근 가능
 * 		- public : 생성자, 클래스, 메소드 => 다른 클래스 통신
 * 			=> 패키지 상관없이 모든 클래스에 접근 가능
 * 		*** private < default < protected < public => 오버라이딩 : 접근지정어의 축소는 불가능 하나 확장은 가능
 * 	2. 관련된 클래스를 모아서 관리(패키지 = 폴더 개념 : 클래스별 분리) => 찾기
 * 		- 패키지 명칭
 * 			· 키워드는 사용 불가
 * 			예) com(org).회사명.분리단위
 * 			*** 분리단위
 * 				vo => 클래스형 데이터
 * 				dao => 데이터베이스 연동
 * 				model => 브라우저로 전송
 * 				manager => 크롤링, 파일
 * 				service => 데이터베이스 여러 개를 한 번에 처리
 * 			· 패키지가 다른 경우(다른 폴더에 클래스 저장)
 * 				=> 반드시 import를 이용해서 클래스를 읽어 옴
 * 			· 패키지가 같은 경우
 * 				=> import 없이 클래스를 사용할 수 있음
 * 					라이브러리만 사용하는 것이 아닌 사용자 정의 클래스도 사용
 * 					예) import com.sist.dao.*; // 1개 사용 시 => 클래스명 지정 | 여러개 사용 시 => '*'
 * 
 * 		*** 자바 소스 코딩의 형식
 * 			package : 1번만 사용 가능
 * 			import : 여러 개 사용 가능
 * 			public class ClassName
 * 			{
 * 				멤버 변수 선언
 * 				생성자
 * 				멤버 메소드
 * 				{
 * 					변수 선언 => 지역 변수 => 메소드 호출이 종료되면 자동으로 사라짐
 * 				}
 * 				=> 가독성 => 지금 순서로 코딩
 * 			}
 * 		*** 패키지 사용
 * 			default
 * 
 */

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
