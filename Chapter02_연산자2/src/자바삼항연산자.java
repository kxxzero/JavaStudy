/*
 * 이항 => () + ()
 * 삼항 => () () ()
 * 		  (조건)?값1:값2 
 * 		  true => 값1
 * 		  false => 값2
 *		  * 조건이 true일 경우 값1 출력 / false일 경우 값2 출력
 * 
 *  	  int a = 10;
 *  	  (%2==0)>"짝수":"홀수"
 */

public class 자바삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1; // 1 ~ 100
		System.out.println("a="+a);
		System.out.println(a%2==0?"짝수":"홀수");
		
		// sex=1,3 => 남자 / sex=2,4 => 여자
		int b=(int)(Math.random()*4)+1; // 1 ~ 4
		System.out.println("b="+b);
		System.out.println(b%2==0?"여자":"남자");
//		System.out.println(b%2!=0?"남자":"여자");
		
	}

}
