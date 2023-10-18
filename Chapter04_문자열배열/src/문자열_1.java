/*
 * 	자바 => 문자열(웹, 윈도우) => 가장 많이 사용되는 데이터형
 * 	
 * 	문자열 사용법
 * 		String : 저장 개수 제한 없음
 * 			- 일반 데이터형
 * 				예) String name="홍길동"
 * 			- 클래스형으로 사용이 가능
 * 				예) String name=new String("박문수")
 * 			=> char[]을 클래스화한 것
 * 				예) "Hello Java"
 * 				= {'H','e','l','l','o',' ','J','a','v','a'}
 * 					0	1	2	3	4	5	6	7	8	9
 * 			- 기능(메소드) : 라이브러리(변경해서 사용 불가) => final class(java.lang에 있는 대부분의 클래스는 final)
 * 				· toUpperCase() : 대문자 변환
 * 				· toLowerCase() : 소문자 변환
 * 				------------------------- 변환
 * 
 * 				· ★★★ valueOf() : 모든 데이터형을 String으로 변경★★★
 * 					예) int a=10;
 * 						valueOf(a)+100 => "10"+100 => "10100"
 * 				------------------------- 변경
 * 
 * 				· substring() : 문자 자르기 
 * 				------------------------- 제어
 * 
 * 				· trim() : (좌, 우)공백 제거
 * 				· replace() : 문자, 문자열 변경
 * 				· replaceAll() : 문자열 변경(정규식)
 * 				· split() : 문자열 분리
 * 				------------------------- 변경
 * 
 * 				· indexOf() : 앞에서부터 위치 찾기
 * 				· lastIndexOf() : 뒤에서부터 위치 찾기
 * 				------------------------- 찾기
 * 
 * 				· concat() : 문자열 결합
 * 				------------------------- 결합
 * 
 * 				· eqauls() : 같은 문자열인 경우(예: 로그인, 아이디 찾기)
 * 				· contains() : 해당 문자열을 포함하는 경우(예: 검색)
 * 				· startsWith() : 시작 문자열이 같은 경우(예: 쿠키)
 * 				· endsWith() : 끝 문자열이 같은 경우
 * 				------------------------- 비교
 * 
 * 				· charAt() : 문자 중에 1개의 char를 얻는다
 * 				· toCharArray() => char[]
 * 				------------------------- 기타
 * 
 * 			
 * 
 */

import java.util.Arrays;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기능 처리 = 메소드 : 기능 처리한 후에 반드시 결과값을 보내준다.
		// 결과값 : 리턴형
		// double Math.random()
		// Math.random();
		// String => char[] toCharArray

		String s="Hello Java";
		System.out.println(s);
		char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println();
		
		char[] arr=new char[10];
		
		// 초기값
		for(int i=0; i<arr.length; i++) {
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(arr));
		s=String.valueOf(arr); // 배열을 문자열 변환
		System.out.println(s);
		// char[] => String valueOf
		// String => char  toCharArray
		// charAt() => char
		/*
		 * Hello Java
		 * 0123456789
		 * 
		 * charAt(4) => 'o'
		 */
		
		for(int i=0; i<10; i++) {
<<<<<<< HEAD
			char ch=s.charAt(i);
			System.out.println("ch="+ch);
=======
			c=s.charAt(i);
			System.out.println("c="+c);
>>>>>>> refs/heads/master2
		}
		
	}

}
