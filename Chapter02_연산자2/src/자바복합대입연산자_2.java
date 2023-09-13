/*
 * 쉬프트 연산자(비트이동연산자) : <<=,  >>=
 * 	- << : 비트를 왼쪽으로 이동
 * 	- >> : 비트를 오른쪽으로 이동
 * 
 * 		예) 
 * 			int a=27;
 * 			a=a<<3 => a<<=3
 * 			27 = 11011(2진법)
 * 			11011을 왼쪽으로 3칸 이동 => 11011(0)(0)(0) // 빈자리는 0으로 채움 => 11011000 = 216
 * 		
 * 
 */
public class 자바복합대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=27;
//		a<<=3;
//		System.out.println("a="+a);
//		
//		a=27;
//		a>>=3;
//		System.out.println("a="+a);
		
		// a=33; => 왼쪽으로 2 이동, 오른쪽으로 2 이동
		int a=33;
		a<<=2;
		System.out.println("a="+a);
		
		a=33;
		a>>=2;
		System.out.println("a="+a);
	}

}
