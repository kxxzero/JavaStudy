
// UP / DOWN 게임 : 컴퓨터 1 ~ 100 난수 발생 => 힌트(up/down) 제공
// => 정답이 나올 때까지 무한 루프(횟수 지정 없음)
// => while(true) = for(;;)

import java.util.Scanner;
// import java.lang.* // java.lang은 생략 가능 
public class 자바제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생
		int com=(int)(Math.random()*100)+1;
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		// 종료 => break, System.exit(0)
		for(;;) { // 무한 루프
			System.out.print("1 ~ 100 사이의 값 입력 : ");
			int user=scan.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue; // 처음으로 돌아감
			}
			
			count++;
			
			// 힌트
			if(com>user) {
				System.out.println("높은 정수 입력(UP)");
			}
			else if(com<user) {
				System.out.println("낮은 정수 입력(DOWN)");
			}
			else { // 정답
				System.out.println("Game Over!");
				System.out.println("입력 횟수 : " + count);
				System.exit(0); // 프로그램 종료
			}
		}
	}
//	return; // 메소드 사용 후 return 입력 필수지만 생략 시 자동으로 추가 됨
}
