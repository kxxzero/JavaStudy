/*
 * 	
 * 
 */

import java.util.Scanner;
public class Answer_0918 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1)  Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int a=scan.nextInt();
		
//		정수 : nextInt()
//		실수 : nextDouble()
//		논리 : nextBoolean
//		문자열 : next()
//				* 단점 : char은 읽기 못함 charAt(0)을 통해 문자열로 읽어서 첫번째 문자를 자름
		
		if(a>=0) {
			System.out.println(a+"는(은)양수입니다.");
		}
		else {
			System.out.println(a+"는(은)음수입니다.");
		}
		
		System.out.println("====================");
		
		// 2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
		System.out.println("정수 입력 : ");
		int b=scan.nextInt();
		
		if(b%3==0) {
			System.out.println(b+"는(은) 3의 배수입니다.");
		}
		else{
			System.out.println(b+"는(은) 3의 배수가 아닙니다.");
		}
		
		System.out.println("====================");
		
		// 3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
		System.out.println("정수 입력 : ");
		int c=scan.nextInt();
		
		if(c<0) {
			c*=-1;
			System.out.println();
//			System.out.println("c=" + c*-1);
		}
		else{
			System.out.println("c=" + c);
		}
		
		System.out.println(Math.abs(c)); // Math.abs() : 절댓값 구하는 메소드
		
		System.out.println("====================");
		
		// 4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
		// 윤년 조건 : if((year%4==0 && year%100!=0)||(year%400==0))
		System.out.println("연도 입력*(예: 2023) : ");
		int year=scan.nextInt();
		
		if(year%4==0 && year%100!=0||year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
		
		System.out.println("====================");
		
		// 5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라 (다중 if 사용)
		System.out.println("성적 입력(0 ~ 100) : ");
		int score=scan.nextInt();
		
		if(score>= 90 && score<=100) {
			System.out.println("A학점입니다.");
		}
		else if(score>=80 && score<=89) {
			System.out.println("B학점입니다.");
		}
		else if(score>=70 && score<=79) {
			System.out.println("C학점입니다.");
		}
		else if(score>=60 && score<=69) {
			System.out.println("D학점입니다.");
		}
		else {
			System.out.println("F학점입니다.");
		}
		
		System.out.println("====================");
		
		// 6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라 (switch~case 사용)
//		int grade=score/10;
//		
//		switch(grade) {
//			case 10 :
//			case 9 :
//				System.out.println("A학점입니다.");
//			break;
//			case 8 :
//				System.out.println("B학점입니다.");
//			break;
//			case 7 :
//				System.out.println("C학점입니다.");
//			break;
//			case 6 :
//				System.out.println("D학점입니다.");
//			
//			default :
//				System.out.println("F학점입니다.");
//				
//		}
		
		char level='A';
		int temp=(int)(score/10);
		
		switch(temp) {
			case 'A' :
				System.out.println("A학점입니다.");
			break;
			case 'B' :
				System.out.println("B학점입니다.");
			break;
			case 'C' :
				System.out.println("C학점입니다.");
			break;
			case 'D' :
				System.out.println("D학점입니다.");
			
			default :
				System.out.println("F학점입니다.");
		}
		
		System.out.println("====================");
		
		// 7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 (switch~case 사용) 
		System.out.println("첫번째 정수 입력 : ");
		int num1=scan.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2=scan.nextInt();
		System.out.println("연산자 입력(+, -, *, /) : ");
		char op=' ';
		
		switch(op) {
			case '+' :
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case '-' :
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case '*' :
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case '/' :
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else {
					System.out.println(num1+"/"+num2+"="+(num1/num2));
				}
				break;
				
			default : System.out.println("처리할 수 없는 연산자입니다.");
		}
		
//		int result= 0;
		
//		switch(scan.next().charAt(0)) {
//		case '+' :
//			result=num1+num2;
//			break;
//		case '-' :
//			result=num1-num2;
//			break;
//		case '*' :
//			result=num1*num2;
//			break;
//		case '/':
//			result=num1/num2;
//		default : 
//			System.out.println("잘못된 입력입니다.");
//		}
//		
//		System.out.println(result);
		
		
		// 8) 중첩 switch case
		
		int com=(int)(Math.random()*3); // 0, 1, 2
		System.out.println("가위(0), 바위(1), 보(2)");
		int user = scan.nextInt();
		
		switch(com) {
			case 0 : // 컴퓨터 가위
				switch(user){
					case 0 : 
						System.out.println("비겼습니다.");
						break;
					case 1 :
						System.out.println("사용자가 이겼습니다.");
						break;
					case 2 :
						System.out.println("컴퓨터가 이겼습니다.");
				}
			case 1 : // 컴퓨터 바위
				switch(user){
				case 0 : 
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 1 :
					System.out.println("비겼습니다.");
					break;
				case 2 :
					System.out.println("사용자가 이겼습니다.");
			}
			case 2 : // 컴퓨터 보
				switch(user){
				case 0 : 
					System.out.println("사용자가 이겼습니다.");
					break;
				case 1 :
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 2 :
					System.out.println("비겼습니다.");
			}
		}
		
		
		
	}

}
