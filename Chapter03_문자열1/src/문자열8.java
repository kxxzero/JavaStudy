
// equals(==) : 해당 문자열과 일치하는지 확인할 때 사용

import java.util.Scanner;
public class 문자열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String MID="admin", MPWD="1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id=scan.next();
		System.out.println("비밀번호 입력 : ");
		String pwd=scan.next();

		// 대소문자 구분 O
		if(id.equals(MID) && pwd.equals(MPWD)) { // equals() : 대소문자 구분해서 일치하는지 확인
			System.out.println(id+"님 로그인 되었습니다.");
		}
		else {
			System.out.println("아이디나 비밀번호가 틀립니다.");
		}
		
//		========================================
		
		// 대소문자 구분 X
		if(id.equalsIgnoreCase(MID) && pwd.equals(MPWD)) { // equalsIgnoreCase() : 대소문자 구분하지 않고 일치하는지 확인
			System.out.println(id+"님 로그인 되었습니다.");
		}
		else {
			System.out.println("아이디나 비밀번호가 틀립니다.");
		}
		
	}

}
