
/*
 * 	제어문 : 반복 수행, 선택한 부분만 출력 => 프로그램 제어, 사용자 요청 처리
 * 		- for : 반복 횟수가 존재 => 웹 프로그램 Front(화면 UI)
 * 			형식 : for(① 초기값; ② 조건식; ④ 증가식){
 * 					③ 반복 수행 문장
 * 				}
 * 				=> ① 초기값 → ② 조건식 ┌ true : ③ 반복 문장 수행 => ④ 증감식
 * 								   └ false : 종료
 * 			중첩 for문(2차 for문) : 알고리즘(정보처리)
 * 				형식 : for(① 초기값; ② 조건식; ⑦ 증가식){ // 줄 수
 * 						for(③ 초기값; ④ 조건식; ⑥ 증가식{
 * 							⑤ 반복 수행 문장; // 한 줄에 출력할 내용
 * 						}
 * 					} 
 * 		- while : 반복 횟수가 없는 경우 => 서버 Back(크롤링, 데이터베이스, 파일 읽기) => 선 조건 : 수행을 못할 수도 있다.
 * 			형식 : ① 초기값;
 * 					while(② 조건식){
 * 						③ 반복 수행 문장;
 * 						④ 증감식;
 * 					}
 * 					=> while(true) : false가 나올 때까지 무한 루프 => 데이터베이스
 * 		- do ~ while : 무조건 1회 이상 수행 => 웹, 모바일에선 사용 빈도 낮음 => 후 조건 : 1회는 반드시 수행
 * 			형식 : ① 초기값;
 * 				do{
 * 					② 반복 수행 문장;
 * 					③ 증감;
 * 				}while(조건식); // 증가된 값을 가지고 조건식 확인
 * 			예) int i = 1;
 * 				do{
 * 					System.out.println(i); // 1, 2, 3 ... 10
 * 					i++; // i=2, i=3 ... i=10
 * 				}while(i<=10); // i=11일 때 종료
 * 
 * 			
 * 		
 * 
 */

public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== for =====");
		for(int i=1; i<=10; i++){
			System.out.print(i+ " ");
		}
		
		
		
		System.out.println("\n===== while =====");
		
		int i=1;
		while(i<=10) {
			System.out.print(i+ " ");
			i++;
		}
		
		
		
		System.out.println("\n===== do ~ while =====");
		
		i=1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=10);
		
	}

}
