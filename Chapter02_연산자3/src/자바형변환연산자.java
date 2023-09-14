/*
 * 형변환 연산자
 * 
 * (int)값
 * 
 * ※ byte < char < int < long < float < double
 * 
 */

public class 자바형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;
		double d = (double)a; // upCasting(자동형변환)
		char c = (char)a; // DownCasting => 특수한 경우(실제 값만 적용할 때 : cher c = 65;) 생략 가능하나, 연산 처리가 된 경우 생략 불가능
		
//		int i = 10;
//		int j = 55;
//		char c1 = 10;
//		char c2 = i + j; // 자동형변환 불가능(변수를 적용했을 때)
		
		System.out.println("a=" + a);
		System.out.println("d=" + d);
		System.out.println("c=" + c);

		c = '0'; // A = 65, a = 97, 0 = 48
		System.out.println("c=" + (int)c);
	}

}
