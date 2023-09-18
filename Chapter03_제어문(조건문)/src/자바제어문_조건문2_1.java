/*
 * 	단일 조건문(if) : 여러 개가 동시에 결과값이 있는 경우
 * 	선택 조건문(if ~ else) : 예상되는 결과값이 2개로 나눠서 나오는 경우
 *	다중 조건문(if ~ else if) : 여러 개 중에 1개만 수행하는 경우
 *
 */ 
	
// 국어, 영어, 수학 => 총점, 평균 => 평균 60점 이상 합격 60점 미만 불합격

import java.util.Scanner;
public class 자바제어문_조건문2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int kor, eng, math, total;
		double avg;
		
		// 초기화 => 명시적인 초기화, 입력값을 받아서 저장, 임의 발생
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수 : ");
		kor = scan.nextInt();
		
		System.out.println("영어 점수 : ");
		eng = scan.nextInt();
		
		System.out.println("수학 점수 : ");
		math = scan.nextInt();
		
		// 총점
		total=kor+eng+math;
		
		// 평균
		avg = total/3.0;
		
		// 결과값 도출 =>
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		
		if(avg>=60) {
			System.out.println("합격입니다.");
		}
		else{
			System.out.println("불합격입니다.");
		}
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
	}

}
