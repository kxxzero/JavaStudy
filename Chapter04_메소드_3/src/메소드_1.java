
/*
 *	변수 / 연산자 / 제어문	
 *		--------------- 명령문
 *	=> 묶어서 사용
 *	변수 : 배열 / 클래스 (O)
 *	명령문 : 관련된 명령
 *		=> 입력 관련 / 출력 관련 / 요청 관련 => 메소드
 *		=> 동작 => 조립해서 사용(객체 지향 프로그램) => 수정, 추가(유지보수)
 *	메소드는 1개의 직능만 수행이 가능
 *	=> 자바는 클래스 영역을 벗어날 수 없음(클래스 종속)
 *
 *	1. 메소드 구성요소
 *		- 리턴형 : 사용자 요청에 대한 처리 결과값
 *				결과값은 반드시 1개만 사용 가능 // 여러 개인 경우 => 배열 / 클래스 / 컬렉션
 *				=> 넘겨줄 결과값을 예측하여 데이터형 설정
 *		- 매개변수 : 사용자가 요청한 값
 *					웹 : 마우스 클릭, 엔터, 버튼 클릭, 데이터 입력
 *				=> 메소드는 사용자의 행위에 의해 호출됨
 *		- 메소드명 : 식별자 명명 규칙
 *				=> 소문자로 시작
 *		- return 문장 : 처리 결과값을 넘겨줌, 메소드의 종료
 *				=> 맨 마지막이 아닌 중간에서 사용하는 것도 가능
 *		메소드()
 *		{
 *			if()
 *			{
 *				return; // 중간 종료
 *			}
 *			else
 *			{
 *				return; // 중간 종료
 *			}
 *		}
 *	
 *	2. 메소드 형식
 *		[접근지정어][옵션] 리턴형 메소드명(매개변수) => 선언부
 *		{
 *			구현부; // 변수 선언, 연산자, 제어문
 *			결과값 도출;
 *			return 결과값;
 *		}
 *			- 접근 지정어
 *				· public : 모든 클래스
 *				· protected : 상속 받는 클래스, 같은 폴더 안에서
 *				· default : 같은 폴더 안에서만
 *				· private : 자신의 클래스에서만 사용 => 캡슐화 => 은닉화 : 데이터 보호
 *			- 옵션
 *				· static : 자동 메모리 저장 => new
 *				· abstract : 추상 메소드 => 선언만 할 때 사용 => 설계론 : 요구사항 분석(이러한 기능이 있다는 것을 알려주는 역할)
 *				· final : 수정 불가능 // 예) String, Math
 *		 	- 리턴형
 *				· 기본형 : int, char, double, boolean 등
 *				· 참조형 : String, 배열, 클래스
 *			- 메소드명 : 식별자
 *			- 매개변수
 *				· 매개변수는 0개 이상으로 사용 가능
 *				· 리턴형은 1개만 사용 가능
 *				· 기본형 : Call By Value
 *				· 참조형 : Call By Reference // 매개변수가 3개 이상일 경우 배열이나 클래스 사용 권장
 *						=> 메소드 매개변수 전송법
 *			- 구현부
 *				· 변수 선언
 *				· 연산자
 *				· 제어문
 *			- 결과값 도출
 *				· return 결과값
 *					=> 자체 처리 : void => return 생략 가능 => 컴파일러가 자동으로 추가
 *					* 모든 메소드는 return 필수
 *			=> return / import java.lang.*; // 자동 추가 : String, Math, System
 *					* return이 생략될 때 : void일 때만 가능
 *
 *			★ 모든 프로그램 과정 ★
 *				1) 입력 : 변수에 대한 초기화
 *				2) 요청 처리 부분 => 추가, 읽기(목록, 상세보기), 수정, 삭제, 검색 등 (CRUD : Create Read Update Delete) // 오라클 : ISUD(Insert Select Update Delete)
 *				3) 출력 => 사용자가 볼 수 있게 만듦 => HTML, CSS
 *
 *			=> main() : 프로그램의 시작과 종료
 *
 *	3. 메소드 유형
 *		리턴형	매개변수
 *		O		O
 *		O		X
 *		X		O
 *		X		X
 *
 *		------------------------------
 * 			리턴형			매개변수
 * 		------------------------------
 * 			 O				  O
 * 			=> String substring(int start) : 원형
 * 		------------------------------
 * 			 O				  X
 * 			=> String trim()
 * 				double random()
 * 		------------------------------
 * 			 X				  O
 * 			=> void main(String[] arg) : 메소드 자체 처리
 * 			=> void println(String s)
 * 		------------------------------
 * 			 X				  X
 * 			=> void println() : 다음 줄 출력
 * 		------------------------------
 * 		=> 1개의 클래스 안에서 메소드명이 동일할 수 있음
 * 		매개 변수의 개수나 데이터형이 다른 경우 다른 메소드
 * 		= aaa(int a) == aaa(int b) // 이런 경우는 같은 메소드
 * 		= aaa(double d)
 * 		= aaa(int a, int b) => 오버로딩 : 중복 정의 메소드
 * 		예) plus(int, int) plus(char, char) plus(double, double)
 * 
 * 	4. 메소드 호출
 * 		- 인스턴스 메소드(new) => 메모리 저장 // 각각 따로 저장
 * 			예) Scanner scan=new Scanner(System.in)
 * 				scan.nextInt()
 * 				String s="";
 * 				s.메소드
 * 		- 클래스 메소드(static) => 공유(하나가 바뀌면 전체가 바뀜) => 자동 저장
 * 			예) Math.random() 
 *		
 *		- static
 *			클래스명.메소드명()
 *			=> 같은 클래스인 경우 클래스명은 생략 가능
 *		= aaa(int a, int b)
 *			=> aaa(10, 20)
 *		= int aaa()
 *			int a=aaa()
 *
 *	5. return갑 설정
 *		= int display()
 *			{
 *				return 10;
 *			}
 *		= double display()
 *			{
 *				return 10.5;
 *			}
 *		= String display()
 *			{
 *				return "";
 *			}
 *		= void display()
 *			{
 *				return; // 생략 가능
 *			}
 *		= int[] display()
 *			{
 *				int[] arr=new int[5];
 *				return arr;
 *			}
 *			=> 중요 내용 => 여러번 호출이 가능(재사용)
 *	6. 메소드 사용 목적
 *		- 반복되는 기능 제거
 *		- 코드 관리가 쉬움(기능별 분리)
 *		- 소스가 간결
 *		- 재사용(다른 클래스 연걸)
 */

// 5개의 정수를 전송 => 정렬
// 5자리(만 단위) 정수를 전송 => 역순으로 출력

import java.util.*;

public class 메소드_1 {
	
	// ASC : 오름차순
	static int[] sortASC(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
				
			}
		}
		return arr;
	}
	
	// DESC : 내림차순
	static int[] sortDESC(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		return arr;
	}
	
	
	
	// ASC + DESC 2개 메소드 통합
	static int[] sort(int[] arr, String type)
	{
		boolean bCheck=false;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(type.equals("ASC"))
				{
					bCheck=arr[i]>arr[j];
				}
				else
				{
					bCheck=arr[i]<arr[j];
				}
				if(bCheck)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		return arr;
	}
	
	
	
	static void sort_1(int[] arr, String type)
	{
		boolean bCheck=false;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(type.equals("ASC"))
				{
					bCheck=arr[i]>arr[j];
				}
				else
				{
					bCheck=arr[i]<arr[j];
				}
				if(bCheck)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
//		return arr;
	}
	
	
	
	// reverse ==> 일반 숫자는 뒤집기 어렵기 때문에 문자열로 바꿔서 처리
		static String reverse(int num)
		{
			String str=String.valueOf(num);
			String res="";
			
			for(int i=str.length()-1; i>=0; i--)
			{
				res+=str.charAt(i);
			}
			return res;
		}
	
		
	
	// 조립
	static void process()
	{
		// 5개 정수 설정
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전="+Arrays.toString(arr));
		
//		int[] result=sortASC(arr);
//		System.out.println("ASC 정렬 후="+Arrays.toString(result));
//		result=sortDESC(arr);
//		System.out.println("DESC 정렬 후="+Arrays.toString(result));
		
//		int[] result=sort(arr,"ASC");
//		System.out.println("ASC 정렬 후="+Arrays.toString(result));
//		result=sort(arr,"DESC");
//		System.out.println("DESC 정렬 후="+Arrays.toString(result));
		
		// Call By Reference
		sort_1(arr, "ASC");
		System.out.println("ASC 정렬 후="+Arrays.toString(arr));
		sort_1(arr, "DESC");
		System.out.println("DESC 정렬 후="+Arrays.toString(arr));
		
		System.out.println(reverse(123));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메소드 호출
		process();
	}

}
