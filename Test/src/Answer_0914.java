
import java.util.Scanner;
public class Answer_0914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) 농구공 5개씩 한 박스에 들어간다. 40개면 8상자, 26개면 6상자이다. ** 삼항연산자를 이용해서 구현하시오 **
		Scanner scan=new Scanner(System.in);
		System.out.println("농구공 개수 : ");
		int ball = scan.nextInt();
		System.out.println("필요한 박스 : " + (ball%5==0?ball/5:ball/5+1));
		
		System.out.println("필요한 박스 : " + (int)(Math.ceil(ball/5.0))); // ceil : 반올림 
		
		
		// 2) 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다.알맞은 코드를 넣으세요.
//		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력 : ");
		char ch = scan.next().charAt(0);
		System.out.println("ch=" + ch);
		boolean b = (ch >='A' && ch <='Z' || ch >= 'a' && ch<='z' || ch >= 0? true : false);

		System.out.println(b); // ch = 맨 앞 첫 글자를 가져옴
		
		
		// 3) 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
		// 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다. 알맞은 코드를 넣으세요.
		System.out.println("문자 입력 : ");
		char ch2 = scan.next().charAt(0);
		System.out.println("ch2 : " + ch2);
		char lowerCase = (ch2 >= 'A' && ch <= 'Z' ? (char)(ch2+32):(char)(ch2-32));
		System.out.println("변경된 값 : " + lowerCase);
		
		System.out.println("문자 입력 : ");
		char ch3 = scan.next().charAt(0);
		System.out.println("ch3 : " + ch3);
		char lowerCase2 = (ch2 >= 'a' && ch <= 'z' ? (char)(ch2-32):(char)(ch2+32));
		System.out.println("변경된 값 : " + lowerCase2);
		
		
		// 4) 윤년 여부
		// 4년마다 윤년
		// 100년마다 제외
		// 400년마다 윤년
		System.out.println("년도 입력 : ");
		int year = scan.nextInt();
		System.out.println(
				(year%4==0 && year%100!=0 && year%4==0)?year+"년도는 윤년입니다.":year+"년도는 윤년이 아닙니다."
		);
	}

}
