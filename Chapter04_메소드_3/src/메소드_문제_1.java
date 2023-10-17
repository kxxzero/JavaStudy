
// 정수 1개 입력 => 짝수, 홀수 구분
import java.util.Scanner;
public class 메소드_문제_1 {
	
	// 입력
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 1개 입력:");
		int num=scan.nextInt();
		return num;
	}
	
	// 처리
	static String check(int num)
	{
		String res="";
		if(num%2==0)
		{
			res=num+"는(은) 짝수입니다.";
		}
		else
		{
			res=num+"는(은) 홀수입니다.";
		}
		return res;
//		return num%2==0?num+"는(은) 짝수입니다.":num+"는(은) 홀수입니다." // 삼항연산자로 축약 가능
	}
	
	// 출력
	static void print(String res)
	{
		System.out.println(res);
	}
	
	// 조합
	static void process()
	{
		int num=userInput();
		String res=check(num);
		print(res);
		
//		print(check(userInput())); // 이런 축약형으로도 사용 가능
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
