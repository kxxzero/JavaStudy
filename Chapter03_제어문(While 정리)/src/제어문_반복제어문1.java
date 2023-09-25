/*
 * 	break : 반복 중단 => switch, 반복문에서만 사용
 * 		예) 게임 - ESC
 * 		
 * 	continue : 특정 부분 제외 => 반복문에서만 사용 가능
 * 		=> 자신의 반복문만 제어할 수 있음
 * 		예) for(){
 * 				for(){
 * 					break; // 2차 for문(중첩 for문)만 제어
 * 				}
 * 				break; // 1차 for문만 제어
 * 			}
 * 
 * 		outer:for(){ // outer가 아닌 다른 이름 사용 가능
 * 			for(){
 * 				break outer; // 2차 for문 제어
 * 			}
 * 		}
 */

public class 제어문_반복제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break => 반복문 종료
		for(int i=1; i<=10; i++) {
			if(i==3) {
				// 소스 코딩 가능
				break; //i==3이면 반복 종료
				// 소스 코딩 불가능
			}
			System.out.println("i=" + i);
		}
		
		
		for(int i=1; i<=10; i++) {
			if(i==3) {
				continue; // if 조건에 해당하는 부분을 제외하고 증가식으로 이동
			}
			System.out.println("i=" + i); // 1 2 4 5 6 7 8 9 10
		}
		
		
		/*
		 * 	for / while
		 * 	- break : 동일하게 사용
		 * 	- continue ┌ for : 증가식
		 * 			   └ while : 조건식
		 * 				=> 잘못 사용하면 무한 루프 될 수 있음
		 * 				=> 처음부터 다시 실행할 경우에 주로?
		 */
		
//		System.out.println("===== while =====");
//		int i =1;
//		while(i<=10) {
//			if(i==3) {
//				break;
//			}
//			System.out.println("i=" + i);
//			i++;
//		}
		
		int i=1;
		while(i<=10) {
			if(i==3) {
				continue; // 3을 제외하고 조건식으로 이동
			}
			System.out.println("i=" + i);
			i++;
		}
		
		
	}

}
