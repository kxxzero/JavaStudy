/*
 *	컴퓨터 VS 플레이어 가위바위보 => 다중 조건문 - 경우의 수 : 9개
 *	
 *		컴퓨터(com)	VS	플레이어(user)
 *	-------------------------
 *		가위	(0)			가위 (0)		=> 0
 *						바위 (1)		=> -1
 *						보 (2)		=> -2
 *	-------------------------
 *		바위	(1)			가위	(0)		=> 1
 *						바위 (1)		=> 0
 *						보 (2)		=> -1
 *	-------------------------
 *		보 (2)			가위 (0)		=> 2
 *						바위 (1)		=> 1
 *						보 (2)		=> 0
 *	
 *	=> 가위(0), 바위(1), 보(2)
 *
 */

import java.util.Scanner;
public class 자바제어문_조건문3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 선언
		int com, user;
		com = (int)(Math.random()*3); // 0, 1, 2
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) : ");
		user=scan.nextInt();
		
		// 가공
		System.out.print("컴퓨터 : ");
		if(com==0) {
			System.out.println("가위");
		}
		else if(com==1) {
			System.out.println("바위");
		}
		else if(com==2) {
			System.out.println("보");
		}
		
		
		System.out.print("사용자 : ");
		if(user==0) {
			System.out.println("가위");
		}
		else if(user==1) {
			System.out.println("바위");
		}
		else if(user==2) {
			System.out.println("보");
		}
		
		int res=com-user;
		if(res==-2 || res==1) {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		else if(res==2 || res==-1) {
			System.out.println("사용자가 이겼습니다.");
		}
		else {
			System.out.println("비겼습니다.");
		}
		
		// 결과값 출력
//		if(com==0) {// 컴퓨터가 가위일 경우
//			if(user==0) {
//				System.out.println("비겼습니다.");
//			}
//			else if(user==1) {
//				System.out.println("사용자가 이겼습니다.");
//			}
//			else if(user==2) {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}
//		}
//		else if(com==1) {// 컴퓨터가 바위일 경우
//			if(user==0) {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}
//			else if(user==1) {
//				System.out.println("비겼습니다.");
//			}
//			else if(user==2) {
//				System.out.println("사용자가 이겼습니다.");
//			}
//		}
//		else if(com==2) {// 컴퓨터가 보일 경우
//			if(user==0) {
//				System.out.println("사용자가 이겼습니다");
//			}
//			else if(user==1) {
//				System.out.println("컴퓨터가 이겼습니다.");
//			}
//			else if(user==2) {
//				System.out.println("비겼습니다.");
//			}
//		}
	}

}
