/*
 * 	다중 조건문 : 결과값을 1개만 도출
 * 		형식 : if(조건문)
 * 			{
 * 				조건이 true일 때 수행문 => 수행 후 종료
 * 					  false일 때 => 다음 조건 확인
 * 			}
 * 			else if(조건문)
 * 			{
 * 				조건이 true일 때 수행문 => 수행 후 종료
 * 					  false일 때 => 다음 조건 확인
 * 			}
 * 			else if(조건문)
 * 			{
 * 				조건이 true일 때 수행문 => 수행 후 종료
 * 					  false일 때 => 다음 조건 확인
 * 			}
 * 			.
 * 			.
 * 			.
 * 			else // (생략 가능)
 * 			{
 * 				해당 조건이 없는 경우 수행
 * 			}
 * 
 * 			=> 1개의 문장만 수행
 * 
 */


// 국어, 영어, 수학 => 총점, 평균, 학점 = > 합격, 불합격

import java.util.Scanner;
public class 자바제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int kor, eng, math, total;
		double avg;
		char score =' '; // 명시적인 초기화
		
		// 입력값 받기
		System.out.println("국어 점수 : ");
		kor = scan.nextInt();
		
		System.out.println("영어 점수 : ");
		eng = scan.nextInt();
		
		System.out.println("수학 점수 : ");
		math = scan.nextInt();
		
		// 초기화 
		total  = kor + eng + math;
		avg = total/3.0;
		
		if(avg>=90) {
			score='A';
		} else if(avg>=80) {
			score='B';
		} else if(avg>=70) {
			score='C';
		} else if(avg>=60) {
			score='D';
		} else {
			score='F';
		}
		
		// 결과값 출력(제어문, 연산자) => DOS, 브라우저, 모바일
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println("학점 :  + "+ score);

	}

}
