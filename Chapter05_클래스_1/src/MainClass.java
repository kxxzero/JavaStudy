
/*
 * 	프로그램
 * 	1. 데이터 관리
 * 		1) 데이터 저장(메모리 저장 / 파일 저장(영구적인 저장) / RDBMS 저장(영구적인 저장)
 * 			- 1개 저장 : 변수
 * 			-------------------------
 * 			- 같은 데이터 저장 : 배열			
 * 			- 다른 데이터 저장 : 클래스
 * 			-------------------------> 메모리 주소를 이용하는 프로그램(참조 변수 : 사용자 정의 데이터형)
 * 		2) 데이터 가공
 * 			-------------------------
 * 			- 명령문 : 세미콜론(;)
 * 			- 연산자 
 * 			- 제어문
 * 			-------------------------> 메소드
 * 		3) 가공된 데이터 출력
 * 			- 명령 프롬프트 / 윈도우 창 => Application
 * 			- 브라우저 => Web Application
 * 			-------------------------
 * 			- 모바일 => Mobile Application => 코틀린(Kotlin)
 * 			-------------------------> 문법 형식은 동일
 * 			Front End(React, Vue) => React Query
 * 
 * 	2. 데이터 관리를 위한 사용자 정의
 * 		1) 클래스의 구성 요소
 * 			class 클래스명
 * 			{
 * 				① 변수 설정 : 프로그램 종료시까지 사용 가능
 * 						  => 지역 변수 : 메소드 종료 시 사라지는 변수 => 리턴형, 매개변수
 * 						  => 전역 변수 : 리턴형, 매개변수가 단순해짐
 * 							- 공유 변수
 * 							- 인스턴스 변수 
 * 				--------------------
 * 				② 생성자 설정 : 변수에 대한 초기화
 * 							=> 여러 개 사용 가능
 * 							=> 사용하지 않는 경우 : 컴파일러에 의해 자동 생성
 * 				--------------------
 * 				③ 메소드 설정 : 기능
 * 			}
 * 		2) 클래스 변수의 종류
 * 			- 멤버 변수 : 클래스 영역에 선언하는 변수
 * 				· 인스턴스 변수(객체 변수) : new를 사용할 때마다 따로 저장 => heap 영역에 저장
 * 				· 클래스 변수(공유 변수) : static => Method area에 저장
 * 			* 자바의 메모리
 * 			-------------------------
 * 			Method Area(static) : 메소드 저장, 정적(static) 변수
 * 			-------------------------
 * 			Heap : 인스턴스 변수(멤버 변수) => 프로그래머가 메모리에 저장/해제
 * 									  => 가비지컬렉션(GC)을 통해 자동으로 메모리 해제
 * 									  => System.gd() : 멀티미디어
 * 			-------------------------
 * 			Stack : 지역 변수, 매개 변수, 블록 변수 => 메모리 자체 관리 
 * 			-------------------------
 * 		
 * 			------------------------------------------------------------
 * 				변수 유형			선언 위치			메모리 저장			사용 범위		
 * 			------------------------------------------------------------
 * 				인스턴스 변수		클래스 영역			new(새로운 공간 생성)		=> 클래스를 메모리에 저장한 상태(인스턴스)
 * 			------------------------------------------------------------
 * 				정적 변수			클래스 영역			컴파일 시 자동 저장
 * 			------------------------------------------------------------
 * 				지역 변수			메소드 영역			메소드 호출할 때마다	
 * 			------------------------------------------------------------
 * 			=> 메모리 저장
 * 				인스턴스(메모리에 저장된 상태) = 객체 : 클래스에 대한 변수명 => 메모리 주소
 * 				예)
 *  				int a=10;
 *  				class A
 *  				{
 *  					int a
 *  					int b
 *  					int c
 *  				}
 *  				=> malloc(sizeof(A)) => new
 *  				=> free(A) => delete => 보통 사용하지 않음(C/C++)
 *  
 *  				A a=new A();
 *  					---> 메모리 크기를 확인 => 메모리 확보 => 확보된 메모리 주소를 넘겨주는 역할
 *  						---> 생성자 : 멤버 변수에 대한 초기화
 *  					-------> 초기값
 *  			=> 클래스 : 1개의 정보를 모아둔 곳
 *  					=> 설계(필요한 데이터를 모음) => 메모리 저장 => 활용 => 메모리 해제
 *  			class Movie
 *  			{
 *  
 *  			}
 *  			Movie m1=new Movie();
 *  			Movie m2=new Movie();
 *  			Movie m3=new Movie();
 *  			활용 : m1.변수명 => '.'은 주소 접근 연산자
 *  			해제 : m1=null
 *  	-------------------------
 * 		3) 메소드 처리하는 방법
 * 		4) 생성자 확인
 * 		-------------------------> 객체 지향
 * 		5) 초기화 블록
 * 		6) 클래스의 종류
 * 		7) 라이브러리
 * 		8) ★ 예외 처리
 * 
 * 		
 * 
 * 		* 클래스
 * 			- 파일명 : .java 파일과 동일
 * 				예)
 * 				class A
 * 				public class
 */

// 학생 => 이름, 국어, 영어, 수학 점수
import java.util.*;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	// 멤버 변수 사용 => 기본형, 클래스, 배열
}
public class MainClass {

	public static void main(String[] args) {
//		String[] names=new String[3];		
//		int[] kor =new int[3];
//		int[] eng =new int[3];
//		int[] math =new int[3];
//		System.out.println(names);
		
		
		/*
		 * 	names
		 * 	----------		----------------------------------------
		 * 	@6504e3b2	=>	names[0]	|	names[1]	|	names[2]
		 * 	----------		----------------------------------------
		 * 					6504e3b2		6504e3b2+4		6504e3b2+8
		 * 	=> 모든 클래스는 변수 선언 시 4byte(주소)
		 */
		
		
//		Scanner scan=new Scanner(System.in);
//		for(int i=0; i<3; i++)
//		{
//			System.out.println((i+1)+"번째 이름 입력:");
//			names[i]=scan.next();
//			System.out.println((i+1)+"번째 국어 점수 입력:");
//			kor[i]=scan.nextInt();
//			System.out.println((i+1)+"번째 영어 점수 입력:");
//			eng[i]=scan.nextInt();
//			System.out.println((i+1)+"번째 수학 점수 입력:");
//			math[i]=scan.nextInt();
//		}
//		for(int i=0; i<3; i++)
//		{
//			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",
//								kor[i], eng[i], math[i],
//								kor[i]+eng[i]+math[i],
//								(kor[i]+eng[i]+math[i]/3.0));
//			
//		}
		
		// 클래스 이용
		Student hong=new Student(); // 사용자 정의 데이터형
		hong.name="홍길동";
		hong.kor=78;
		hong.eng=90;
		hong.math=80;
		System.out.println(hong.name+" " + hong.kor+" " + hong.eng+" " + hong.math+" " + (hong.kor+hong.eng+hong.math));
		System.out.println("hong="+hong);
		
		Student shim=new Student();
		shim.name="심청이";
		shim.kor=78;
		shim.eng=90;
		shim.math=80;
		System.out.println("shim="+shim);
		
		Student park=new Student();
		park.name="박문수";
		park.kor=78;
		park.eng=90;
		park.math=80;
		System.out.println("park="+park);
		
		/*
		 *	stack => 주소
		 * 	hong
		 * 	-----
		 * 	0x100
		 * 	-----	heap(실제 데이터)
		 * 			new Student()
		 * 			0x100 -----name-----
		 * 					
		 * 			      -----kor------
		 * 					
		 * 			      -----eng------
		 * 					
		 * 				  -----math-----
		 * 					
		 * 				  --------------
		 * 			hong.name, hong.kor, hong.eng => 주소 연산자
		 * 
		 */
	}
}
