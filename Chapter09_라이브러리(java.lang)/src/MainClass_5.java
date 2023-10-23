
/*
 * 	메모리 사용법
 * 	- 같은 메모리 사용(메모리 주소가 같은) : 얕은 복사 => 대입
 * 	- 새로운 메모리 생성(메모리 주소가 다름) : 깊은 복사 => clone(prototype)
 * 		
 */

class Student
{
	int hakbun;
	String name;
}

public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 얕은 복사 => 매개변수로 주소를 보내서 메소드에서 제어할 때 주로 사용 => 윈도우 => Call By Reference
		Student s=new Student();
		s.hakbun=1;
		s.name="홍길동";
		
		Student s1=s; // 메모리 주소가 같음 => 같은 변수를 제어
		s1.hakbun=2;
		s1.name="심청이";
		
		System.out.println(s.name);
		System.out.println(s.hakbun);
	}

}
