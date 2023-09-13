
import java.util.Scanner;
public class Answer_0913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 12) 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성
		Scanner scan = new Scanner(System.in); // 키보드 입력 값을 읽어온다.

//		System.out.println("첫번째 정수 입력 : ")
//		int a = scan.nextInt();
//		System.out.println("두번째 정수 입력 : ")
//		int b = scan.nextInt();
		
		System.out.println("정수 두 개 입력(10 20) :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a-b);
		System.out.println(a*b);
		
	    // 13) 사용자로부터 세 개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그 결과를 출력하는 프로그램을 작성해 보자.
	    // 예를 들어 사용자로부터 순서대로 입력 받은 세 개의 정수가 1, 2, 3 이라면 1 * 2 + 3의 계산 결과를 출력해야 한다.
		System.out.println("세 개 정수 입력(1 2 3) : ");
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		System.out.println(c*d+e);
		
		// 14) 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
		System.out.println("두 개 정수 입력(10 20) : ");
		int f = scan.nextInt();
		int g = scan.nextInt();
		System.out.println(f%g);
	}

}
