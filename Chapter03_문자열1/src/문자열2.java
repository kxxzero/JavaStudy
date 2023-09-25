
/*
 * 	문자열(String)
 * 		1. 문자열 개수 확인
 * 			- length() : 공백 포함 문자열 개수 확인
 * 		2. 검색
 * 			- startWith() : 시작하는 문자열이 일치하는 경우
 * 			- endWith() : 끝나는 문자열이 일치하는 경우
 * 			- ★★★ contains() : 일치하는 문자열이 포함되어 있는 경우 => 추천
 * 			- ★★★ equals() : 같은 값인 경우 => ID PassWord
 * 		3. 문자열 제어
 * 			- replace(), raplaceAll() : 변경
 * 				예) replace('a', 'b') // a → b 변경
 * 					replaceAll("[가-힣", "") // 가-힣 : 한글 전체 → 공백으로 변경
 * 					replaceAll("[0-9A-Za-z]", "")
 * 			- substring() : 문자열 자르기
 * 				예) String s="Hello Java"
 * 							 0123456789
 * 					substring(1) // 1번에 해당하는 문자
 * 					substring(4,7) // 4~6(7전)까지 => 4, 5, 6(7은 제외)
 * 			- toUpperCase : 대문자
 * 			- toLowerCase : 소문자
 * 		4. 모든 데이터형을 문자열로 변경
 * 			예) valueOf(1) => "1"
 * 				윈도우 - 웹
 * 		5. 분리
 * 			- split() => Spring[]
 * 			- charAt(index)
 * 				예) "Hello Java" => charAt(0) => 'H'
 * 				** index 번호 : 자바는 무조건 0부터 시작(오라클 : 1번)
 * 
 * 		String => 일반형
 * 			- Call By Value : String은 변경 불가
 * 			- Call By Reference : 저장 후 제어 => 배열/클래스
 * 			
 * 			예) String s="";
 * 				String s=new String("");
 * 			
 */

public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java!!"; // 공백 포함 12자
		System.out.println(s.length()); // 문자열의 총 개수
		
		if(s.startsWith("Hello")) { // 시작하는 문자 확인 => 서제스트(단어 시작 문자 일부 입력 시 검색어 자동 추천 기능

			System.out.println("포함됨");
		}
	}

}
