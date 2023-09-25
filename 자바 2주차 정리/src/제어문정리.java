/*
 * 	제어문
 * 		- 조건문 => 범위가 많을 때 주로 사용
 * 			· 단일 조건문 => 독립적일 경우
 * 				if(조건문){ // true/false => 부정연산자, 논리연산자, 비교연산자
 * 					조건이 true일 때 수행할 문장
 * 				}
 * 			· 선택 조건문 => 예) 로그인, ID중복체크, 검색
 * 				if(조건문){
 * 					조건이 true일 때 수행할 문장
 * 				}
 * 				else{
 * 					조건이 false일 때 수행할 문장
 * 				} 
 * 			· 다중 조건문 => 조건에 맞는 1개의 문장만 수행
 * 				if(조건문){
 * 					조건이 true일 때 수행할 문장
 * 					조건이 false일 때 다음 조건으로 이동
 * 				}
 * 				else if(조건문){
 * 					조건이 true일 때 수행할 문장
 * 					조건이 false일 때 다음 조건으로 이동
 * 				}
 * 				else if(조건문){
 * 					조건이 true일 때 수행할 문장
 * 					조건이 false일 때 다음 조건으로 이동
 * 				}
 * 				else{
 * 					해당 조건이 없을 때 수행할 문장
 * 				}
 * 		- 선택문 1개의 값을 선택한 경우에 처리 => 카테고리 선택
 * 			· switch(정수, 문자, 문자열){
 * 				case 값 : 
 * 					처리 문장;
 * 					break;
 * 				case 값 :
 * 					처리 문장;
 * 					break;
 * 				case 값 :
 * 					처리 문장;
 * 				default :
 * 					처리 문장;
 * 			}			
 * 			
 * 		- 반복문
 * 			· for : 횟수 지정 => 배열, 컬렉션
 * 				* 인덱스 번호
 * 				* for(for-each) => 웹 목록
 * 				1차
 * 					for(초기값; 조건식; 증감식;){
 * 						반복 문장;
 * 					}
 * 				
 * 				2차(중첩) => short, 등수 구하기
 * 					for(① 초기값; ② 조건식; ⑧ 증감식;){
 * 						for(③ 초기값; ④ 조건식; ⑥ 증감식;){
 * 							⑤ 반복 문장;
 * 						}
 * 						⑦ 줄 바꿈;
 * 					}
 * 			· while
 * 		- 반복제어문
 */
public class 제어문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1, 2, 3, 4, 5};
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
