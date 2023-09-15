/*
 *	단일 조건문
 *		형식 : if(조건문)
 *				{
 *					수행 문장 => 조건문이 true일 때만 수행 가능
 *				}
 *		* 주의점 : 조건문은 반드시 결과가 true/false가 나와야 함 - 비교연산자 / 논리연산자 / 부정연산자
 *
 *		2개의 정수와 연산자(+, -, *, /)를 입력 받는다 => 간단한 계산기
 */

import java.util.Scanner;
public class 자바단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num1, num2; // 정수 2개 저장
		char op; // 연산자 1개 저장
		
		System.out.println("첫번째 정수 입력 : " );
		num1=scanner.nextInt();
		
		System.out.println("두번째 정수 입력 : " );
		num2=scanner.nextInt();
		
		System.out.println("연산자 입력(+, -, *, /) : ");
		op = scanner.next().charAt(0); // 원래 문자는 입력 받을 수 없기 때문에 charAt을 사용하여 문자를 입력 받음
		
		if(op=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		if(op=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		if(op=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		if(op=='/') {
			// 중첩 조건문
			if(num2==0) { // 0일 때
				System.out.println("0으로 나눌 수 없다.");
			}
			if(num2!=0) { // 0이 아닐 때
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
		}
		if(!(op=='+' || op=='-'|| op=='*' || op=='/'));
			System.out.println("잘못된 연산자다.");
	}

}
