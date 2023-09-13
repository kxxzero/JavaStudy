/*
 *	*=
 *		예)
 * 		int a=10;
 * 		a*=20; => a=a*20 => a=10*20 => a=200
 * 
 * 	/=
 * 		예)
 * 		int a=10;
 * 		a/=3 => a=a/3 => a=10/3 => a=3
 * 
 */

public class 자바복합대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
			a*=20; // a=200
			System.out.println("a="+a);
			
			a/=3;
			System.out.println("a="+a);
			
//		final int A=10; // 상수(대문자)의 경우 값을 변경할 수 없음. 
//			int b=A*20;
//			b=A/3; // 따라서 추가로 변수를 선언해서 사용해야 함
	}

}
