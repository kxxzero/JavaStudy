/*
 * 	문자열 저장 => String => ""
 * 	1개 저장
 * 		String 변수명="";
 * 	여러 개 저장
 * 		String[] 배열명={"","","","",...};
 * 		String[] 배열명=new String[5];
 * 	String은 클래스 => 메소드(기능)
 * 		1. 메소드명 : 기능
 * 		2. 결과값 확인
 * 		3. () => 매개변수 확인
 * 		- length() : 문자 개수
 * 			예) int length()
 * 				String s="Hello";
 * 				s.length() => Hello의 문자 개수가 
 * 		- toUpperCase() : 대문자로 변환
 * 			예) String toUpperCase()
 * 				String ss=s.toUpperCases();
 * 		- toLowerCase() : 소문자로 변환
 * 			예) String toLowerCase()
 * 		- substring() : 문자를 자름
 * 			예) String substring(int begin)
 * 			    ------			----------
 * 				리턴형(요청 처리 결과)  매개변수(사용자 요청)
 * 				예) 로그인
 * 					요청 =>ID, PW => 결과값 boolean
 * 					=> String ss=s.substring(1);
 * 				String substring(int begin, int end)
 * 		- statsWith() : 시작 문자열이 같은지 확인
 * 			예) boolean statWith(String msg)
 * 				= if문에서 주로 처리
 * 				String s="Hello Java";
 * 				if(s.startsWith("H"))
 * 				=> 서제스트(검색어 자동 완성)
 * 		- endsWith() : 끝 문자열이 같은지 확인
 * 			예) boolean endsWith(String msg)
 * 				=> 확장자(jpg, png, gif) => 갤러리 게시판
 * 		- contains() : 문자열 포함 여부 확인
 * 			예) boolean constains(String msg)
 * 				=> 검색
 * 		- trim() : 좌우 공백 제거
 * 			예) String trim()
 * 				=> 유효성 검사(로그인, 회원가입, 검색어 입력)
 * 		- equals() : 같은 문자열인지 확인(대소문자 구분)
 * 			예) boolean equals(String msg)
 * 				=> 로그인(아이디, 비밀번호)
 * 		- replace() : 문자, 문자열 변경 => 데이터베이스
 * 			예) String replace(String s, String s1)
 * 				String replace(char c, char c1)
 * 							   -----    -----
 * 								old		 new
 * 				||(문자열 결합), &(입력값)
 * 				=> 이미지(url 주소)
 * 		- replaceAll() : 문자열 변환
 * 			예) String replaceAll(String regex) // regex : 정규식
 * 		- valueOf() : 모든 데이터형을 문자열로 변환
 * 			에) String valueOf(int a) = boolean b
 * 			=> static : 자동 메모리 할당
 * 				String.valueOf()
 * 		- toString() : 객체의 주소값 확인(생략 가능)
 * 		- indexOf() : 지정된 문자 위치 값 확인
 * 			예) int indexOf(char)
 * 				int indexOf(String s)
 * 		- lastIndexOf() : 지정된 문자 위치 값 확인(문자 번호, length()-1)
 * 			예) int lastIndexOf(char)
 * 				int lastIndexOf(String s)
 * 		- concat() : 문자열 결합(+)
 * 			예) String concat(String s)
 * 		- split() : 특정 문자를 중심으로 자른 후 배열에 저장
 * 			예) String[] split(String regex) // regex : 정규식
 * 		- 
 * 
 *				 		
 */

import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문자열_1 a=new 문자열_1();
		// 클래스 저장
		System.out.println(a);
		
		
		
		String[] names= {"홍길동", "박문수", "심청이", "이순신", "강감찬"};
		// String은 문자 저장 제한이 없다.
		/*
		 * (stack)		(Heap)
		 * 	names		names[0]	names[1]	names[2]	names[3]	names[4]
		 * 	-----		-------------------------------------------------------
		 *	 100		"홍길동"	|	"박문수"	|	"심청이"	|	"이순신"	|	"강감찬" 
		 * 	-----		|------------------------------------------------------
		 * 				메모리 주소(100)
		 * 	1. 선언
		 * 		데이터형[] 배열명 - 권장 방법
		 * 		데이터형 배열명[]
		 * 	2. 초기값
		 * 		데이터형[] 배열명={}
		 * 		데이터형[] 배열명=new 데이터형[개수]
		 * 		배열명[0]=""
		 * 		for문
		 * 		난수 발생 ...
		 * 	3. 활용 / 변경, 출력(for-each)
		 * 		배열명[0]="" => 변경
		 * 
		 */
		
		
		
		for(String name:names) { // 실제 저장된 값을 출력
			System.out.println(name); 
		} // => 속도가 빠르다
		
		System.out.println("==========");
		
		// 조건이 있을 경우 인덱스를 이용해서 출력
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		System.out.println("==========");
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("이름 입력:");
		String name=scan.next();
		
		// 방법1
		int index=0;
		for(String n:names)
		{
			if(n.equals(name))
			{
				break;
			}
			index++;
		}
		System.out.println(name+"는(은) "+(index+1)+"번째에 있습니다.");

		
		// 방법2
		int i=0;
		for(i=0; i<names.length; i++) {
			if(names[i].equals(name)) {
				
				break;
			}
		}
		System.out.println(name+"는(은) "+(i+1)+"번째에 있습니다.");
		
	}

}
