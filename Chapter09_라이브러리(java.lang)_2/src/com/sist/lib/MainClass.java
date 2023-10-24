package com.sist.lib;

/*
 * 	java.lang : 자바 소스의 기본 => 많이 사용되는 패키지
 * 		- import 생략 가능
 * 		- java.lang에 있는 대부분의 클래스는 final 클래스가 많음 => 확장 불가 있는 그대로 사용
 * 		- 사용 빈도 높은 메소드
 * 			· String
 * 			· StringBuffer
 * 			· Math
 * 			· System
 * 			· Wrapper
 * 		- 예외 : Object => 최상위 클래스로 모든 클래스의 상위 클래스
 * 			= 사용자 정의, 라이브러리 => 모든 클래스는 Object로 부터 상속 받음
 * 			· toString() : 객체를 문자열화, 기본은 메모리 주소 출력 => 오버라이딩
 * 			· ★★★ clone() : 메모리 주소를 복제 => 새로운 메모리 생성
 * 				예) 게임(아바타) => 디자인 패턴, 알고리즘 => 스프링
 * 			· finalize() : 소멸자(자동 호출) => 메모리 해제 시
 * 		- System : 출력, 메모리 해제, 프로그램 종료
 * 			· ★★★ println() : 에러 출력, 멤버변수 값 확인, 전송 값 확인
 * 				예) 윈도우 / 브라우저에서는 자체 출력을 하기 때문에 println()이 디버깅 역할을 함
 * 			· gc() : 가비지 컬렉션을 호출 => 메모리를 비워줌
 * 				예) 멀티미디어, 애니메이션, 실시간 도로 CCTV
 * 			· exit() : 종료 => 0(정상 종료) / 1(비정상 종료)
 * 		- Math : Math.메소드명() => 모든 메소드가 static임 => 메모리 할당을 하지 않음
 * 			· ★★★ random() : 리턴형(double => 0.0 ~ 0.99)
 * 			· ★★★ ceil() : 올림 함수
 * 				예) 총 페이지 개수 구하기
 * 		- StringBuffer : String을 보완 => 문자열 결합에 최적화(빠른 속도) => 하나의 메모리 공간만 사용
 * 			· ★★★ append() : 문자열 결합
 * 		- String : 문자열 관리 클래스
 * 		
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
