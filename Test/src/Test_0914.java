
public class Test_0914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) 농구공 5개씩 한 박스에 들어간다. 40개면 8상자, 26개면 6상자이다. ** 삼항연산자를 이용해서 구현하시오 **
		int ball = (int)(Math.random()*100)+1;
		System.out.println(ball);
		System.out.println(ball%5==0? ball/5 + "상자" : ball/5+1 + "상자");
		
		
		// 2) 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.알맞은 코드를 넣으세요.
		// 대문자 'A' = 65
		// 소문자 'a' = 97
		char  ch = 'z';
		boolean b = (ch >='A' && ch <='Z' || ch >= 'a' && ch<='z' || ch >= 0 ?true:false);

		System.out.println(b);
		
		
		// 3) 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
		// 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다. 알맞은 코드를 넣으세요.
		char ch2 = 'A';
		char lowerCase = (ch2);
		
		System.out.println("ch2 : " + ch2);
		System.out.println("ch2 to lowerCase : " + lowerCase);
		
		
		// 4) 윤년 여부
		// 4년마다 윤년
		// 100년마다 제외
		// 400년마다
		
		int year;

	}

}
