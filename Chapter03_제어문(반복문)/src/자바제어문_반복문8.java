
// 1 ~ 100 => 알파벳 난수 발생 => A, B, C 각각의 개수
public class 자바제어문_반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, c=0;
		for(int i=1; i<=100; i++) {
			char ch=(char)((Math.random()*26)+65); // A ~ Z 사이의 난수를 문자로 저장
			System.out.println(ch + " "); // 문자열 출력
			
			if(ch=='A') { // 100개의 알파벳 난수 중에 'A' 가 존재한다면
				a++;  // 변수 a(A의 개수)를 하나씩 증가시켜라
			}
			else if(ch=='B') {
				b++;
			}
			else if(ch=='C') {
				c++;
			}
		}
		
		System.out.println("\n===== 결과값 =====");
		System.out.println("A의 개수 : " + a);
		System.out.println("B의 개수 : " + b);
		System.out.println("C의 개수 : " + c);
		
	}

}
