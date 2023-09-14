/*
 *	변수 : 저장 공간. 자바 저장 공간을 설정(자료형, 데이터형)
 *		- 정수
 *			· byte(8bit) : -128 ~ 127 => 2진법(0,1)을 8개 채워서 숫자 한 개 저장
 *			· int(32bit) : -21억 4천 ~ 21억 4천 => 기본값(default) 컴퓨터에서 모든 숫자는 int를 인식
 *			· long(64bit) : 금융권, 빅데이터
 *		- 실수
 *			· double(64bit) : 소수점 15자리 이상 => 기본값(default)
 *		- 문자
 *			· char(16bit) : 0 ~ 65535(문자 번호) => 데이터가 숫자로 저장되며 음수 값은 존재하지 않음(각 문자마다 할당된 번호가 있음)
 *		- 논리
 *			· boolean(8bit) : true, false => 2진법(0,1)
 *			
 *			예) // 정수 3개 저장
 *				int a, b, c;
 *
 *			// 실수 2개 저장
 *				double d1, d2;
 *				
 *			// 문자 1개 저장
 *				char c;
 *				
 *			// true/false
 *				boolean bb;
 *	
 *		=> 데이터 저장 → 데이터 가공(사용자 요청에 맞게 - 연산자) → 사용자 화면 출력
 *		
 *	자바에서 제공하는 연산자
 *		- 단항연산자
 *			· 증감연산자(++, --) : 1 증가, 1 감소
 *				++a : a값 1 증가 시킨 후 다른 연산 수행
 *					예) int a=10;
 *						int b=++a; // 증가(a=11) 후 대입(b=11)
 *				a++ : 먼저 다른 연산 수행 후 a값 1 증가 시킴
 *					예) int a=10;
 *						int b=a++; // 대입(b=10) 후 증가(a=11)
 *				--a : a값 1 감소 시킨 후 다른 연산 수행
 *					예) int a=10;
 *						int b=--a; // 감소(a=9) 후 대입(b=9)
 *				a-- : 먼저 다른 연산 수행 후 a값 1 감소 시킴
 *					예) int a=10;
 *						int b=a--; // 대입(b=10) 후 감소(a=9)
 *
 *			· 부정연산자(!) : boolean에서만 사용 가능
 *				true → false
 *				false → true
 *					예) boolean bCheck = false;
 *						bCheck = !bCheck => bCheck = true;
 *						예약 가능한 날 => !(예약 가능한 날)
 *
 *			· 형변환연산자(type) : 객체지향 형변환(클래스 변경) => 숫자관련만 적용(정수, 실수, 문자)
 *				자동형변환(UpCasting) : 데이터형을 크게 변경
 *					예) int => double
 *						char => int
 *						int a = 'A'; // int 변경('A' => 65)
 *						double d = 100; // double 변경(100 => 100.0)
 *
 *					* 데이터형이 같은 것 끼리 연산
 *					예) double + int (X) // double로 변경
 *						char + int (X) // int로 변경
 *						int + long (X) // long으로 변경
 *
 *						int + char + double // 모두 double로 변경
 *
 *					※ int 보다 작은 데이터형은 연산 시 int로 변경
 *						예) char + byte => int
 *							char + char => int
 *							byte + byte => int
 *
 *				강제형변환(DownCasting) : 데이터형을 작게 변경
 *					예) char c=(char)65; // c='A'
 *						int i=(int)100.0 // i=100
 *
 *				※ 데이터형의 크기
 *					(작음)								  (큼)	
 *					byte < char < int < long < float < double
 *					* 작은 데이터형 → 큰 데이터형 : 자동형변환
 *					* 큰 데이터형 → 작은 데이터형 : 강제형변환
 *
 *		- 이항연산자
 *			· 산술연산자(+, -, *, /, %)
 *				+ : 2개의 값을 더함, 문자를 합침
 *					예) 7+"7"+(7-7); => "770"
 *						"777" - 0; => 오류
 *						7+"7"+7/7 => "771" // 우선 순위 높은 것부터 먼저 계산
 *				- : 2개의 값을 뻄
 *				* : 2개의 값을 곱함
 *				/ : 2개의 값을 나눔(나머지는 버림)
 *					※ 정수 ÷ 정수 = 정수
 *					예) int hit = 135;
 *						int count = 10;
 *						hit/count => 13;
 *						hit/(double)count => 13.5;
 *					※ 0으로는 나눌 수 없음(오류 발생)
 *				% : 2개의 값을 나누고 남은 나머지를 구함 => 윤년 구하기, 숫자 자르기, 배수 구하기 등에서 사용
 *					※ 결과값은 나눠질 대상인 왼쪽 숫자의 부호를 따름
 *				※ 산술 우선 순위
 *					*, /, %   →   +, -
 *					산술 시 우선 순위를 변경하고 싶을 때는 () 사용
 *			· 비교연산자(==, !=, <, >, <=, >=) : 결과 값은 ture/false만 존재 => 문자(''), 정수, 실수만 비교 가능
 *				※ 자바는 Unicode 사용(모든 국가의 언어 사용이 가능) => 한 글자당 2byte
 *				* 한글 사용 시 UTF-8 필수 기입(모든 웹 제작 시 기입)
 *				== : 같다
 *				!= : 같지 않다
 *				< : 작다(왼쪽 기준)
 *				> : 크다 
 *				<= : 작거나 같다
 *				>= : 크거나 같다
 *				※ 날짜나 문자열("")은 비교할 수 없음(자체 메소드 존재)
 *			· 논리연산자(&&, ||)
 *				&& : 직렬연산자(조건 2개가 true일 경우에만 결과값이 true) => 주로 기간, 범위가 포함된 상태에서 사용
 *					(조건1) && (조건2) - AND 연산자
 *				|| : 병렬연산자(조건 1개만 true일 경우 결과값이 true) => 주로 잘못된 입력 시 사용
 *					(조건1) || (조건2) - OR 연산자
 *			· 대입연산자(=, +=, -=)
 *				일반대입
 *					+=
 *						예) a+=1 => a=a+1
 *						여러개 증가 : a=+2 a+=3
 *					-=
 *						예) a-=1 => a=a-1	
 *		- 삼항연산자 = 조건연산자 ?:
 *			(조건)?값1:값2 => true일 경우 값1 도출 / false일 경우 값2 도출 (페이징?)
 *		
 */

// 산술 연산자 - 정수 3개 입력을 받아서 총점, 평균 구하기
import java.util.Scanner; // Scanner 클래스를 가져온다(import)
// c : include
// c# : using
// javaScript : import
// 예외 처리 : 오류를 방지하기 위해 사용
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math; // 같은 유형끼리 묶어주는 것이 좋음
		int total;
		double avg;
		// ==================== 선언(메모리 저장 공간 생성)
		// 변수의 초기화 : 메모리 공간에 값을 첨부
		Scanner scan=new Scanner(System.in); // System.in : 키보드 입력 값. 클래스를 선언할 때 'new' 사용
		System.out.println("국어, 영어, 수학 점수 입력(90 90 90):");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt(); // 초기값이 있어야 활용할 수 있음
		// 연산 처리
		total = kor + eng + math;
		avg = total / 3.0;
		// 결과 출력
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println(); // 한 줄 넘김 기능
		System.out.print(avg>=90 && avg<=100?"A학점":"");
		System.out.print(avg>=80 && avg<90?"B학점":"");
		System.out.print(avg>=70 && avg<80?"C학점":"");
		System.out.print(avg>=60 && avg<70?"D학점":"");
		System.out.print(avg<60?"F학점":"");
	}

}
