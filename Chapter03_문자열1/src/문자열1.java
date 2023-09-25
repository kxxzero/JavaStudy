
/*
 *	문자(char) : 한 글자 저장 => ' '
 *	문자열(String) : 두 글자 이상 저장 => " "
 *		- 일반 데이터형 : 제어
 *			예) String name="홍길동";
 *		- 클래스형 : 메소드 => 웹은 데이터형이 존재하지 않음. 대부분 문자열 형태로 존재(예: 아이디, 검색어, 제품명, 업체명, 주소 등)
 *			
 */

import java.util.Scanner;
public class 문자열1 {
	public static void main(String[] args) {
		// 저장
		
		String name= "홍길동";
		System.out.println(name);
		
		char a='홍', b='길', c='동';
		System.out.println(a+""+b+""+c+"");
		
		String addr="서울특별시 강남구 도산대로51길 36";
		System.out.println(addr);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력 : ");
		String findData = scan.next();
		System.out.println(findData);
	}
}
