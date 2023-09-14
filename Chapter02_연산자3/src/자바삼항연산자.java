// if ~ else
// (조건)?값1:값2 ==> 조건이 true면 값1, false면 값2
// java.lang.* String, System, Math => import를 붙이지 않음

public class 자바삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1; // ① Math.random()*100 → ② (int) → ③ +1
		// Random r = new Random() r.next(100)
		System.out.println(a%2==0 ? a+"는(은) 짝수다" : a+"는(은) 홀수다");
		
		char ch='a';
		char c = (char)((Math.random()*26)+65); // 'A' ~ 'Z'. char로 변경할 부분을 전체 묶기
		System.out.println(c>='A' && c<='Z'? c + "는(은) 대문자입니다." : c + "는(은) 소문자입니다.");
		
		int s = (int)(Math.random()*2); // 0, 1 
		ch=s==0?c:(char)(c+32);
		// 'A' + 32 => 'a' = 97
		System.out.println(ch>='A' && ch<='Z'? ch + "는(은) 대문자입니다." : ch + "는(은) 소문자입니다.");
		
	}

}
