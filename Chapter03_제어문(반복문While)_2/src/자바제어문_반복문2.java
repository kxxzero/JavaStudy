
// 컴퓨터와 가위바위보 10회 => 3승 2무 5패

import java.util.Scanner;

class A
{
	
}
public class 자바제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int win = 0, lose = 0, same = 0;
		
		Scanner scan = new Scanner(System.in); // new(새로운 메모리에 저장)
		
		int i=1;
		while(i<=10) {
			
//			A a = new A(); // new : 새로 저장. while문 안에 클래스 생성은 하지 않는 것이 좋다.
//			System.out.println("a="+a);
			
			System.out.println(i+"번째 게임");
			
			
			int user=0;
			// 유효성 검사 => 원하는 값이 입력 되도록 유도
			while(true) {
				System.out.println("가위(0), 바위(1), 보(2) : ");
				user = scan.nextInt();
				if(user<0 || user>2) {
					System.out.println("가위바위보를 입력하세요!");
					continue; // 처음부터 수행 가능
				}
				break; // 소속된 반복문만 종료 
			}
			
			
			int com = (int)(Math.random()*3); // 0, 1, 2
			System.out.println("컴퓨터 : ");
				if(com==0)
				{
					System.out.print("가위");
				}
				else if(com==1) {
					System.out.print("바위");
				}
				else if(com==2) {
					System.out.print("보");
				}
				
				
				System.out.print("사용자 : ");
				if(user==0)
				{
					System.out.print("가위");
				}
				else if(user==1) {
					System.out.print("바위");
				}
				else if(user==2) {
					System.out.print("보");
				}
		
			// 승패 결정
				int res=com-user;
				if(res==-1 || res==2) {
					System.out.println("사용자가 이겼다.");
					win++;
				}
				else if(res==1 || res==-2) {
					System.out.println("컴퓨터가 이겼다.");
					lose++;
				}
				else {
					System.out.println("비겼다.");
					same++;
				}
		
			i++;
		}
		System.out.println("결과값");
		System.out.printf("%d승 %d무 %d패", win, lose, same);
	}

}
