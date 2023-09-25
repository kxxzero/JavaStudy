/*
 * 	변수 : 1개만 저장 가능한 공간
 * 		1. 많은 경우 변수를 제어하기 어렵다.
 * 		2. 보완 : 1개의 이름으로 여러 개의 변수를 제어
 * 	배열 : 여러 개의 변수를 하나로 묶어서 제어
 * 		1. 1차원 배열 / 2차원 배열 ... 다차원 배열, 가변 배열 => 웹에서는 주로 1차원 배열만 사용
 * 		2. 장점
 * 			- 1개의 변수명으로 모아서 제어하기 때문에 반복문 사용이 편리
 * 			- 연속적인 메모리 구조 : 인덱스 번호를 이용
 * 		3. 단점
 * 			- 고정적 : 한 번 메모리 할당을 하면 변경하기 어려움
 * 			- 기존의 배열보다 크게 만들어서 처리
 * 			- 보완 : 컬렉션(가변형) => 웹에서는 기본 문법, 클래스 설계, 데이터베이스 연동, Front
 * 			- 같은 데이터형만 모아서 제어
 * 		4. 
 * 			1) 선언
 * 				데이터형[] 배열명;
 * 				데이터형 배열명[];
 * 			2) 초기값
 * 				- 생성과 동시에 초기화
 * 				 	예) int[] arr={1,2,3,4,5} => 배열 개수 5개 생성
 * 				- 자동 초기화
 * 					예) int[] arr=new int[5]; // 5개를 저장 각각의 값은 아직 '0'인 상태 -> 기본값(default)
 * 					· int => 0
 * 					· double => 0.0
 * 					· float => 0.0f
 * 					· long => 01
 * 					· boolean => false
 * 					· char => '\u0000' => null 문자
 * 								'\0'
 * 					· String => null
 * 								주소가 없는 경우 : NullPointerException
 * 								
 * 				- 메모리 주소
 * 					예) int[] arr={1,2,3,4,5};
 * 					int[] => Stack에 저장 : 주소만 저장
 * 					arr={1,2,3,4,5} => Heap에 저장 : 실제 데이어 저장
 * 					
 * 					Stack(주소)				Heap(실제 데이터 저장)
 * 					arr
 *  				----		----------------------------------------
 *  				0×100	=>		1		2		3		4		5
 *  				----		----------------------------------------
 *								|	  	|		|		|		|
 *							  0×100	  0×104	  0×108	  0×1012  0×1016	
 *								arr[0]	arr[1]	arr[2]	arr[3]	arr[4]
 *								연속적인 메모리의 시작 주소
 *								arr[index] => 연속적으로 배치(몇번째)
 *								
 *						· 인덱스 번호는 0번부터 시작
 *						· 순차적으로 되어있음
 *						· 배열의 인덱스 추가, 삭제 불가능
 *						· 주의점 : 인덱스 초과 시에 에러 발생
 *							예) int[] arr=new int[5]
 *								0 1 2 3 4
 *								arr[5]=100 => 오류 발생
 *						· 개수 : length
 *				- 각 데이터형별 생성
 *					· int[] arr
 *					· doublep[] arr
 *					· char[] arr
 *					· boolean[] arr
 *					· String[] arr
 *
 *					=> 배열 => 변수
 *					---------------
 *					변수) 읽기, 저장, 수정
 *						예) int a=10; // 저장(a 공간에 10 저장)
 *						System.out.println(a);
 *
 *					배열) 읽기, 수정, 저장
 *						예) int[] are=new int[5];
 *						수정
 *						arr[index번호]=10;
 *						arr[0]=10; arr[1]=20...
 *						System.out.println(arr[0]); // 해당 인덱스 번호에 있는 데이터 값 출력
 *						System.out.println(arr); // 주소값만 출력
 *		
 * 			3) 활용 : 인덱스 0 ~
 * 				- 일반 for문 => 값 변경, 수정할 때 사용 권장
 * 					예) int[] arr=new int[5];
 * 					for(int i=0; i<arr.lenght;i++)
 * 					{
 * 						arr[i]=i;
 * 					}
 * 				- for-each(향상된 for문 : 코드가 간결하고 처리 속도가 빠름) => 값을 출력할 때 사용 권장(실제 값을 순수하게 출력만 하는 기능)
 * 					예) int[] arr=new int[5];
 * 					for(int a:arr) // 10, 20, 30, 40, 50
 * 					{
 * 						인덱스 번호가 아닌 실제 저장된 값
 * 					}
 * 		
 */


public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr=new int[5];
//		System.out.println(arr[0]); // 실제 메모리 주소 값
//		arr[0]=100; // 수정
//		System.out.println(arr[0]); // 100
		

		// 정수 5개 저장
//		int[] arr={10,20,30,40,50}; // 생성과 동시에 저장
		int[] arr=new int[1000];
		arr[0]=100;
		arr[3]=400;
		
		// 출력
		System.out.println("===== 일반 for문 =====");
		
		long s=System.currentTimeMillis(); // 시작 System.currentTimeMillis() : 시간대 계산
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		long e=System.currentTimeMillis(); // 끝
		System.out.println("걸리 시간:"+(e-s));
		
		
		System.out.println("===== for-each문 =====");
		
		s=System.currentTimeMillis(); // 시작 System.currentTimeMillis() : 시간대 계산
		for(int i:arr) {
			System.out.println(arr[i]);
		}
		
		e=System.currentTimeMillis(); // 끝
		System.out.println("걸리 시간:"+(e-s));
	}

}
