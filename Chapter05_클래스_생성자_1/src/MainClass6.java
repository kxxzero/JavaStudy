
class B
{
	int a=10;
	void B() // 일반 함수(메소드) => 생성자가 아님(생성자는 리턴형이 없어야 함)
	{
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	
	/*
	 * 	생성자 => 초기화 필요(명시적 초기화가 불가할 때 / 제어문이나 파일 읽기 / 시작과 동시에 처리할 때(자동 로그인, 윈도우 화면 설정, 서버 연결, 데이터베이스 연결)) => 가장 먼저 호출
	 * 
	 */
	
}

public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B();
//		new B(); // 올바른 생성자 호출 방법 : 반드시 new를 입력해야 함
		
//		new B().a=100;
//		System.out.println(new B().a); // new가 붙을 경우 서로 다른 메모리 생성
		
		B b=new B(); // 주소값을 저장
//		b.a=100;
//		new B().a=1000;
//		System.out.println(b.a);
	}

}
