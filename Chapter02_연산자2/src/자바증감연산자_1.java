/*
 *	증감 연산자 : 1개 증가 : ++ / 1개 감소 : -- (반복문에서 주로 사용)
 *		※ a++ = a=a+1 = a+=1 // 3개 다 같은 의미
 *		- 전치 연산자
 *			예) ++a, --a
 *				int a = 10;
 *				int b = ++a; => a = 11, b = 11 / a를 먼저 증가하고 b에 대입
 *
 *		- 후치 연산자
 *			예) a++, a--
 *				int a = 10;
 *				int b = a++  => a= 11 b = 10 => b에 a값을 대입 후에 나중에 a값을 증가
 * 
 * 
 * 			   	int a = 10;
 * 				int b = ++a + ++a + a++; => a 값은 증가된 수 만큼 a = 13 // 11 + 12 + 12 
 * 				
 * 				int a = 10;
 * 				int b = a++ + a++ + ++a; => a = 13 // 10 + 11 + 13
 * 			
 * 				int a = 10;
 * 				int b = ++a + a++ + ++a + a++ => a = 14 // 11 + 11 + 13 + 13
 * 
 * 				int a = 10;
 * 				int b = a++ + a++ + a++ + a++ => a = 14 // 10 + 11 + 12 + 13
 * 
 * 				int a = 10;
 * 				int b = a-- + a++ + --a + a++ => a 값은 증가/감소된 수 만큼 a = 10 // 10 + 9 + 9 + 9
 */

public class 자바증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10;
		 int b = ++a;
		 
		 System.out.println("a=" + a + " b=" + b);
		 
		 a = 10;
		 b = a++;
		 
		 System.out.println("a=" + a + " b=" + b);
	}

}
