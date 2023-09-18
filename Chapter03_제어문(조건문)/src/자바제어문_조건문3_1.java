/*
 *	정수 2개 입력, 연산자 => 연산 처리
 *
 *	if(op=='+')
 *	else if(op=='-')
 *	else if(op=='*')
 *	else if(op=='/')
 *	else % ^ | => 잘못된 연사자일 경우
 * 
 */

import java.util.Scanner;
public class 자바제어문_조건문3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 명시적 초기화
		// 사용자로부터 입력받은 값을 저장하기 위한 메모리 공간 설정
		int num1 = 0, num2 = 2;
		char op=' ';
		// 사용자의 입력값 받기
		// 사용자 요청에 따라 결과값을 출력 (가공) = 연산자, 제어문
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		num1=scan.nextInt();
		
		System.out.println("두번째 정수 입력 : ");
		num2=scan.nextInt();
		
		System.out.println("연산자 입력(+, -, *, /)");
		op=scan.next().charAt(0);
		
		if(op=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(op=='-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(op=='*') {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(op=='/') {
			// 0으로 나눌 경우 오류 발생
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
		}
		else {
			System.out.println("잘못된 연산자입니다.");
		}
	}

}
