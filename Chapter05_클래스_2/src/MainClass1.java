/*
 * 	클래스는 반드시 구분자를 필요로 함 => 정수형
 * 		1) 변수 묶기
 * 		2) 구분자를 지정 => 참조 번호 확인
 * 		3) 여러 개 있는 경우 => 배열 / 문자열
 * 		4) 데이터형 설정 => String, int, double
 * 		5) 저장 과정 => new(동적 메모리 할당)
 * 		6) 사용법 => 객체.변수명 => 읽기 / 쓰기
 * 			예) int a=10;
 * 				a=100; 쓰기
 * 				System.out.println(a); 읽기
 * 		7) 사용자 정의 데이터형
 * 			- ~VO(Value Object) : 값 자체를 표현, 불변성, 읽기만 가능 => Spring
 * 			- ~DTO(Data Transfer Object) : 데이터 전송 객체, 가변성, 읽고 쓰는 것 모두 가능 => MyBatis
 * 			- ~Bean : => JSP
 * 		8) 변수의 종류
 * 			- 멤버 변수 : new를 사용하여 메모리에 저장
 * 			- 정적 변수(static) : 컴파일 시 메모리 할당 => 메모리 공간 1개 생성 => 공유 변수
 * 			- 지역 변수 : 나머지
 * 		
 */
// 망고플레이트 => 카테고리 => 맛집
class FoodCategory
{
	int cno;
	String poster, title, subject;
}
class FoodHouse
{
	int cno; // 카테고리 번호
	int fno; // 맛집 번호
	String[] Poster=new String[5]; // 이미지
	// 멤버 변수 포함 => 기본형, 클래스, 배열
	String name;
	double score;
	String address; // substring()
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu; // a,b,c,d
}

public class MainClass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
	}
}
