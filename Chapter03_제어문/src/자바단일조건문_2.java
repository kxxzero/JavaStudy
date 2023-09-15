// 정수 입력을 1개 받는다.
// 같은 숫자

import java.util.Scanner;
public class 자바단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 99 사이의 숫자 입력 : ");
		int num = scan.nextInt();
		
//		if(num>=1 && num<100) {
//			if(num%11==0) {
//				System.out.println("같은 숫자입니다.");
//			}
//			if(num%11!=0) {
//				System.out.println("다른 숫자입니다.");
//			}
//		}
//		
//		if(num<1 || num>99) {
//			System.out.println("잘못된 입력값입니다.");
//		}
		
		int a=num/10;
		int b=num%10;
		
		if(num>=1 && num<100) {
			if(a==b) {
				System.out.println("같은 숫자입니다.");
			}
			if(a!=b) {
				System.out.println("다른 숫자입니다.");
			}
		}
		
		if(num<1 || num>99) {
			System.out.println("잘못된 입력값입니다.");
		}
	}

}
