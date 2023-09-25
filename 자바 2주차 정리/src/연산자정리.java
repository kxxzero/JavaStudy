/*
 *	연산자 => 결과값(데이터형 사용)
 *		1) 피연산자(연산 대상)
 *			- 단항연산자(1개)
 *					· 증감연산자 : ++(1증가), --(1감소)
 *						전치연산자 : 먼저 증감 후 다른 연산 수행
 *						후치연산자 : 다른 연산 수행 후 증감
 *							예) int a=10;
 *								int b=a++; // b=10, a=11
 *								
 *								int a=10;
 *								int b=++a // b=11, a=11
 * 
 * 								int a=10;
 * 								System.out.println(++a); // 먼저 출력 후 증감
 * 
 *					· 부정연산자 : ! boolean만 사용 가능 => 조건문에서 주로 사용
 *						예) boolean bCheck=false;
 *							!bCheck => true; // 데이터 값은 연산 하는 당시에만 바뀜
 *							bCheck=!bCheck // bCheck 원본 데이터 값 자체는 유지
 *
 *							String s="aaa";
 *							s.replace('a', 'b') => "bbb"
 *					· 형변환연산자 : boolean은 불가
 *						묵시적 타입 변환 : 자동 형변환
 *						명시적 타입 변환 : 강제 형변환
 *			- 이항연산자(2개)
 *					· 산술연산자 : +(산술, 문자열 결합), -, *(장바구니에서 주로 사용 : 값 * 개수), /(0으로 나눌 시 오류 발생 => 0에 대한 처리 필요), %(부호는 왼쪽 부호를 따라감)
 *						* int 이하 데이터형은 연산시 int
 *							예) double + int = double
 *								char + byte = int
 *								byte + byte = int
 *					· 비교연산자 : >, <, ==, !=, <=, >=  => 조건문, 반복문에서 주로 사용
 *						* 문자열은 비교 불가, equals()로 비교 가능
 *					· 논리연산자 :
 *						&& : 모두 true일 때 true => 범위, 기간
 *						|| : 하나라도 true일 때 true => 오류 처리, 잘못된 입력, 범위를 벗어나는 경우
 *						* 효율적 계산 : 앞의 조건 결과에 따라 나머지 조건을 확인할지 말지 결정하는 것
 *					· 대입연산자
 *						=, +=, -=   => 여러 개가 증감할 때 주로 사용(비행기, 총알 게임)
 *			- 삼항연산자(3개) : (조건)?값1:값2 => 페이지 변경
 *				ture  : 값1
 * 				false : 값2 
 */


public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bCheck=false;
		bCheck=!bCheck;
		if(!bCheck) {
			System.out.println("출력");
		}
		System.out.println(bCheck);
		
		
		
		int a=10;
		a++;
		System.out.println(a);
		
		
		
		byte b1=10;
		byte b2=20;
		int b3=b1+b2; // int < long < double < float
		
		
		
		String s="Hello";
		String s1=new String("Hello");
			if(s.equals(s1)) { // 문자열은 같다의 의미로 '=='를 사용하지 않는다. equals : 같다 / !equals : 같지 않다
				System.out.println("같다");
			}
			else {
				System.out.println("다르다");
			}
		
	}

}
