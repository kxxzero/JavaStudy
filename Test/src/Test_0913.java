
public class Test_0913 {

	public static void main(String[] args) {
		
	   // TODO Auto-generated method stub
	   
	   // 12) 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성
	   int a = (int)(Math.random()*100)+1;
	   int b = (int)(Math.random()*100)+1;
	   
	   System.out.println("a = " + a);
	   System.out.println("b = " + b);
	   System.out.println("a-b = " + (a-b));
	   System.out.println("a*b = " + (a*b));
	   
	   // 13) 사용자로부터 세 개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그 결과를 출력하는 프로그램을 작성해 보자.
	   // 예를 들어 사용자로부터 순서대로 입력 받은 세 개의 정수가 1, 2, 3 이라면 1 * 2 + 3의 계산 결과를 출력해야 한다.
	   int c = (int)(Math.random()*100)+1;
	   System.out.println("a * b + c = " + (a*b+c));
	   
	   // 14) 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
	   System.out.println("a를 b로 나눈 후 나머지 값 : " + a%b);
	   
	   // 15)
	   int d = 5;
	   int e = 5;
	   System.out.println("d와 e가 같은가요? " + (d==e));
	   System.out.println("d가 e보다 큰가요? " + (d>e));
	   System.out.println("d가 e보다 작은 가요 ? " + (d<e));
	   System.out.println("d가 e와 같은면서 3보다 큰가요? " + (d==e && d>=3));
	   System.out.println("d가 50이 아닌가요? " + (d!=50));

	}

}
