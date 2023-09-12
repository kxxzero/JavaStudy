/*
 *	38page
 *		- 산술연산자 : +, -, *, /, %(나눈 후 나머지 값)
 *			· 이항연산자 : 피연산자(연상 대상) 2개
 */
public class 자바산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// + 산술
		// 국어, 영어, 수학 점수의 총점을 구한다.
		
		int kor = 89, eng = 90, math = 87;
		int total = kor + eng + math;
		double avg = total/3.0; // 정수를 정수로 나누면 소수점이 사라지기 때문에 나누는 수를 실수로 변경해야 한다.
		
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + math + "점");
		System.out.println("총점 : " + total + "점");
		System.out.println("평균 : " + avg + "점");
		System.out.printf("평균 : %.2f", avg); // printf : 형식을 변환할 때 사용. %.2f : 소수점 이하 2자리
		System.out.println("========== % ==========");
		
		int a = 5;
		int b = 2;
		System.out.println(a + "%" + b + "=" + (5%2)); // 괄호 먼저 계산
		System.out.println(-a + "%" + b + "=" + (-5%2)); // 앞의 숫자의 부호를 따라감
		System.out.println(a + "%" + -b + "=" + (5%-2));
		System.out.println(-a + "%" + -b + "=" + (-5%-2));
		System.out.println("========== 형변환 ==========");

		//	자동 형변환 : 작은 데이터형 → 큰 데이터형
		//		예) int a = 'A'; => a = 65;
		//			double d = 100; => d = 100.0;
		// 	강제 형변환 : 큰 데이터형 → 작은 데이터형
		// 	※ 데이터형 값
		// 		byte < char < int < long < float < double
		
		int aa = 'A';
		System.out.println("aa=" + aa);
		
		double dd = 100;
		System.out.println("dd=" + dd);
		
		System.out.println(100 + 10.5 + 10.5F + 'A'); // 가장 큰 데이터형의 형식으로 변환
		
		// 자동형변환이 있는 경우 : 연산은 같은 데이터형끼리만 연산
		// 'A' + 10
		// ---------- int
		// char => 65 + 10 = 75
		
		System.out.println('A'+'B'); // 65 + 66 = 131
		// int 이하(byte, char, short)인 데이터형 연산 => 결과값 int
		
	}

}
