/*
 * 	논리연산자 : 조건을 사용하는 연산자 (부정연산자, 비교연산자)
 * 	&&(포함), ||(미포함) => 범위가 있는 경우
 * 		- (조건1) && (조건2)
 * 		  true		true	=> 	true
 * 		  true		false	=> 	false
 * 		  false		true	=>	false
 * 		  false		false	=>	false
 * 
 * 		- (조건1) || (조건2)
 * 		  true		true	=> 	true
 * 		  true		false	=> 	true
 * 		  false		true	=>	true
 * 		  false		false	=>	false
 * 
 */

// 1 ~ 12 입력 =>
// 12, 1, 2 => 겨울 // or (범위 지정 불가능)
// 3, 4, 5 => 봄 // and (범위 지정 가능)
// 6, 7, 8 => 여름 // and
// 9, 10, 11 => 가을 // and

import java.util.Scanner; // import java.util.* : 가져와야 하는 클래스가 여러 개인 경우 '*' 입력 => 전체 클래스를 가져옴
public class 자바논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("월 입력 (1~12): ");
		int month = scan.nextInt();
		System.out.print(month + "월은 ");
		System.out.print(month>= 3 && month <=5? "봄입니다." : "");
		System.out.print(month>= 6 && month <=8? "여름입니다." : "");
		System.out.print(month>= 9 && month <=11? "가을입니다." : "");
		System.out.print(month>= 12 || month <=2? "겨울입니다." : "");
	}

}
