package com.sist.main;

/*
 *	객체 대입 => 메모리 전체를 전송했기 때문에 같은 메모리 주소를 제어함
 */

class Human
{
	int age; // 0
	String name; // null
}

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong=new Human(); // hong(age, name) => hong.age, hong.name
		hong.age=20; // 메모리에 저장
		hong.name="홍길동"; // 쓰기 => setter => setXxx
		
		// 변수(멤버 변수, 정적 변수, static 변수, 지역 변수, 매개 변수) => 읽기/쓰기

		System.out.println(hong.age); // 읽기 => getter => getXxx
		System.out.println(hong.name);
		
		// hong => 변수
		Human shim=hong;
		// 대입이 가능
		
	}

}
