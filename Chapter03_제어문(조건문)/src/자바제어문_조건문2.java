/*
 * 56page
 * 	단일 조건문 : true일 때만 수행 / false일 때는 점프
 *  선택 조건문 : true일 때 따로 수행, false일 때 따로 수행 => 페이지네이션, ID 중복체크(중복인 경우 : 이미 사용중입니다. / 중복이 아닌 경우 : 사용 가능합니다.), 짝수홀수, 대소문자
 * 		- 형식 : if(조건문){
 * 					조건문이 true일 경우 수행
 * 				}
 * 				else(조건문){
 * 					조건문이 false일 경우 수행
 * 				}
 * 				=> 삼항연산자로 대신 사용 가능
 * 
 * 		
 */			

public class 자바제어문_조건문2 {
	public static void main(String[] args) {
		// 대소문자 확인
		char c='A';
		
//		if(c>='A' && c<='Z') {
//			System.out.println(c+"는(은) 대문자입니다.");
//		}
//		if(c>='a' && c<='z') {
//			System.out.println(c+"는(은) 소문자입니다.");
//		}
		
		if(c>='A' && c<='Z') {
			System.out.println(c+"는(은) 대문자입니다.");
		}
		else {
			System.out.println(c+"는(은) 소문자입니다.");
		}
		
		// else 문장은 독립적으로 사용 불가 => if문과 같이 사용
		// if 조건문이 false일 경우 else를 실행하기 때문에 else에는 조건문을 붙이지 않는다.
		// 예상되는 결과값이 2개로 나눠서 나오는 경우 사용
		
		int a=10;
		
		if(a%2==0) {
			System.out.println(a+"는(은) 짝수입니다.");
		}
		else {
			System.out.println(a+"는(은) 홀수입니다.");
		}
	}

}
