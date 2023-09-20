import java.util.Scanner;
public class Answer_0920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("========== 1번 ==========");
//		
//		// 1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
//		정답 : x>=10 && x<=20)
//		
//		
//		
		System.out.println("========== 2번 ==========");
//		
//		// 2) char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
//		정답 : ch==' ' && ch!='\t'
//
//		
//		
		System.out.println("========== 3번 ==========");
//		
//		// 3) char형 변수 ch2가 'x' 또는 'X'일 때 true인 조건식 작성
//		정답 : ch2=='x' || ch=='X'
//		
//		
//		
		System.out.println("========== 4번 ==========");
//		
//		// 4) char형 변수 ch3가 숫자('0' ~ '9')일 때 true인 조건식 작성
//		정답 : ch3>='0' && ch3<='9'
		
		
		
		System.out.println("========== 5번 ==========");
		
		// 5) 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6;j++) {
				if(i+j==6) {
					System.out.println("[" + i + ", " + j + "]");
				}
			}
		}

		
		
		System.out.println("========== 6번 ==========");
		
//		// 6) 사용자로부터 두 개의 정수(시작, 끝)를 입력 받아 시작(포함)해서 끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("시작할 정수 1개 입력 : ");
//		int start = scan.nextInt();
//		System.out.println("끝낼 정수 1개 입력 : ");
//		int end = scan.nextInt();
//		
//		int res = 1; //  곱셈 초기값 : 1 / 덧셈 초기값 : 0
//		
//		for(int i=start; i<=end; i++) {
//			res*=i;
//		}
//		System.out.println("결과값 : " + res);
//		
//		
//		
		System.out.println("========== 7번 ==========");
		
		// 7) 5~16까지의 합을 구하시오
		
		int sum=0;
		for(int i=5; i<=16; i++) {
			sum+=i;
		}
		System.out.println("5~16까지의 합 : " + sum);
//		
//		
//		
		System.out.println("========== 8번 ==========");
		
		// 8) 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
		
		int sum1=0;
		for(int i=3; i<=4462; i++) {
			if(i%2==0) {
				sum1+=i;
			}
		}
		System.out.println("짝수인 정수의 합 : " + sum1);
//
//
//		
		System.out.println("========== 9번 ==========");
		
		// 9) 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
		
		int sum2 = 0, sum3 = 0;
		for(int i=0; i<=12; i++) {
			if(i%2==0) {
				sum2+=i;
			}
			if(i%3==0) {
				sum3+=i;
			}
		}
		System.out.println("2의 배수의 합 : " + sum2);
		System.out.println("3의 배수의 합 : " + sum3);
//		
//		
//		
		System.out.println("========== 10번 ==========");
		
		// 10) 1~100까지의 정수 중 4의 배수의 합계를 구하라
		
		int sum4 = 0;
		for(int i=1; i<=100; i++) {
			if(i%4==0){
				sum4+=i;
			}
		}
		System.out.println("4의 배수의 합 : " + sum4);
//		
//		
//	
		System.out.println("========== 11번 ==========");
		
		// 11) 10개의 정수를 입력 받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램 작성
		int count = 0;
		
		for(int i=1; i<=10; i++) {
			int num = (int)(Math.random()*100)+1;
			System.out.print(num + " ");
			
			if(i%2==0) {
				count++;
			}
		}
		
		System.out.println("\n짝수의 개수 : " + count);
//		
//		
//		
		System.out.println("========== 12번 ==========");
		
//		// 12) 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
		int count3 = 0;
		int count5 = 0;
		
		for(int i=1; i<=10; i++) {
			
			int num35 = (int)(Math.random()*100)+1;
			System.out.print(num35 + " ");
			
			if(i%3==0) {
				count3++;
			}
			if(i%5==0) {
				count5++;
			}
		}
		System.out.println("\n3의 배수의 개수 : " + count3);
		System.out.println("5의 배수의 개수 : " + count5);
			
			
			
		System.out.println("========== 13번 ==========");
			
		// 13) 5행 10열 ★
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=10; j++) {
					System.out.print("★"); // 한 줄에 몇개 출력
				}
				System.out.println(); // 다음 줄에 출력
			}
			
			
			
		System.out.println("========== 14번 ==========");
		
		// 14)
//		11111
//		22222
//		33333
//		44444
//		55555
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		System.out.println("========== 15번 ==========");
		
		// 15)
//		1 # # # #
//		# 2 # # #
//		# # 3 # #
//		# # # 4 #
//		# # # # 5
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print(i);
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		
		
		System.out.println("========== 16번 ==========");
		
		// 16)
//		A B C D E
//		A B C D E
//		A B C D E
//		A B C D E
//		A B C D E
		
		
		char c1='A';
		for(int i=1; i<=5; i++) {
			c1='A';
			for(int j=1; j<=5; j++) {
				System.out.print(c1++);
			}
			System.out.println();
		}
		
		
		System.out.println("========== 17번 ==========");
		
		// 17)
//		A A A A A
//		B B B B B               
//      C C C C C
//      D D D D D
//      E E E E E

		
		char c2='A';
		for(int i=1; i<=5; i++) {
			c2='A';
			for(int j=1; j<=5; j++) {
				System.out.print(c2);
			}
			c2++;
			System.out.println();
		}
		
	}
	

}









