
/*
 *	접근지정어 : 사용 범위 지정
 *		1. 자신의 클래스에서만 사용
 *			- private => 데이터 은닉화 => 캡슐화
 *			- default
 *			- protected
 *			- public
 *		2. 같은 폴더(패키지) 안에서만 사용
 *			- default
 *			- protected
 *			- public
 *		3. 같은 폴더, 상속이 있는 경우 다른 폴더까지 사용 가능
 *			- protected
 *			- public
 *		4. 모든 클래스에서 사용 가능
 *			- public
 *		=> 클래스, 멤버 변수, 멤버 메소드 가능 => 지역 변수에는 접근 지정어가 존재하지 않음	
 *
 *		------------------------------------------------------------
 *
 *		1) 클래스
 *			[접근지정어] class ClassName
 *				=> 기본 public : 모든 클래스에서 연결
 *		2) 멤버변수
 *			[접근지정어] 데이터형 변수명
 *				=> private : 데이터 보호(은닉화) // 시쿼어 코딩
 *		3) 멤버메소드
 *			[접근지정어] 리턴형 메소드명(매개변수 목록)
 *				=> public : 다른 통신할 때 사용
 *		4) 생성자
 *			[접근지정어] 클래스명()
 *				=> public
 *		*** 대부분 public을 사용하나 특정한 경우 변수에 private 사용
 *			
 *		------------------------------------------------------------
 *
 *		클래스 저장 위치 설정 => 폴더 안에 저장(패키지)
 *		
 *		
 */

public class MainClass {
	
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
