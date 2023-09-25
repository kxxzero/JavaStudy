
/*
 * 	조건문 => 형식, 순서
 * 		- 단일 조건문
 * 			· if : 오류(예외 처리) => 사전에 오류 방지(예: 아이디 중복 체크), 값 입력 유도(예: 빈 칸 방지)
 * 				형식: if(조건문){
 * 						조건이 true일 때만 수행
 * 					} => false일 때는 건너뛰기
 * 		- 선택 조건문 => 삼항연산자
 * 			· if ~ else : true/false => 사용자/관리자, 회원/게스트, 마이페이지/관리페이지
 * 				형식: if(조건문){
 * 						조건이 true일 때 수행
 * 					}
 * 					else{
 * 						조건이 false일 때 수행
 * 					}
 * 		- 다중 조건문 => 선택문 : switch ~ case
 * 			· if ~ else if : 조건에 맞는 문장 하나만 수행
 * 				형식 : if(조건문){
 * 						조건이 true일 때 수행 후 종료
 * 						조건이 false일 때 아래 조건으로 이동
 * 					}
 * 					else if(조건문){
 * 						조건이 true일 때 수행 후 종료
 * 						조건이 false일 때 아래 조건으로 이동
 * 					}
 * 					else if(조건문){
 * 						조건이 true일 때 수행 후 종료
 * 						조건이 false일 때 아래 조건으로 이동
 * 					}
 * 					else{
 * 						해당하는 조건이 없을 때 수행
 * 					}
 * 
 * 	선택문
 * 		- switch(정수, 문자, 문자열){
 * 			case
 * 
 * 	연산자 => 연산자 종류, 결과값
 * 		- 비교 연산자
 * 		- 논리 연산자
 * 		- 부정 연산자
 * 
 */

import java.util.Scanner;
public class Answer_0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("========== 1번 ==========");
		// 1) Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 10의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
		Scanner scan = new Scanner(System.in);
		System.out.println("두 자리 정수 입력(10 ~ 99) :");
		int num = scan.nextInt();
		
		if(num%11==0) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
		
		
		System.out.println("========== 2번 ==========");
		// 2) 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.
		System.out.println("달을 입력하세요(1~12) : ");
		int month=scan.nextInt();
		
		// 방법1 선택문
		switch(month){
			case 12 : case 1 : case 2 :
				System.out.println("겨울입니다.");
				break;
			
			case 3 : case 4 : case 5 :
				System.out.println("봄입니다.");
				break;
			
			case 6 : case 7 : case 8 :
				System.out.println("여름입니다.");
				break;
				
			case 9 : case 10 : case 11 :
				System.out.println("가을입니다.");
				break;
			
			default :
				System.out.println("잘못된 입력입니다.");
		}
		
		// 방법2
		if(month>=1 && month<=12) {
			switch(month){
				case 12 : case 1 : case 2 :
					System.out.println("겨울입니다.");
					break;
				
				case 3 : case 4 : case 5 :
					System.out.println("봄입니다.");
					break;
				
				case 6 : case 7 : case 8 :
					System.out.println("여름입니다.");
					break;
				
				default :
					System.out.println("가을입니다.");
			}
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		// 방법3 다중 조건문		
		if(month>=3 && month<=5) {
			System.out.println("봄");
		}
		else if(month>=6 && month<=8) {
			System.out.println("여름");
		}
		else if(month>=9 && month<=11) {
			System.out.println("가을");
		}
		else if(month==12 || month==1 || month==2) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못된 입력");
		}
		
		
		
		System.out.println("========== 3번 ==========");
		// 3) 1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.
			int sum=0, i=1;
			
			while(i<100) {
				if(i%3!=0) {
					i++;
					continue;
				}
				else {
					sum+=i;
					i++;
				}
			}
			System.out.println(sum);
			
			
			
			
		System.out.println("========== 4번 ==========");
		// 4) 1에서 50까지의 합을 더하는 while 문이다. 빈칸에 적절한 코드를 삽입하라.
		
		int sum2=0, j=1;
		
		// 방법1
		while(true) {
			if(j>50) {
				break;
			}
			sum2+=j;
			j++;
		}
		System.out.println(sum2);
		
		// 방법2
		while(j<=50) {
			sum2+=j;
			j++;
		}
		System.out.println(sum2);
		
		
		
		System.out.println("========== 5번 ==========");
		// 5) 정수를 10개 저장하고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 평균을 출력하라.
		
		int total=0;
		for(int l=1; l<=10; l++) {
			int a=(int)(Math.random()*10)+1;
			System.out.println(a+" ");
			total+=l;
		}
		System.out.printf("\n평균:%.1f\n", sum/10.0);
		
		
		
		System.out.println("========== 6번 ==========");
		// 6) 1부터 100 까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for 문을 사용해 작성해 보세요
		
		int sum3=0;
		
		for(int m=1; m<=100; m++) {
			if(i%2==0) {
				sum3+=i;
				System.out.print(i+ " ");
			}
		}
		
		System.out.println(sum3);
		
		
		
		System.out.println("========== 7번 ==========");
		// 7) 두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해 보세요.
		int count=0;
		while(true) {			
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			count++;
			System.out.println(dice1+", "+dice2);
			
			if(dice1==dice2) {
				break;
			}
			
			System.out.println("반복 횟수 : "+ count);
		}
		
	}

}
