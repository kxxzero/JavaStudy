// 증감연산자, 부정연산자, 형변환연산자
import java.util.Scanner;
// 1개의 정수를 입력 받아서 1개를 증가한 값을 출력
/*	 a++
 *	 ++a
 *	 a+=1
 *	 a=a+1
 */
public class 자바단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a;
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력");
//		a = scan.nextInt();
		
//		a++;
//		++a;
//		a+=7;
//		int b = ++a; // 증가 후 대입
		
//		int b = a++;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		
		System.out.println("===== 부정연산자 =====");
		boolean bCheck = true;
		System.out.println("변경 전 : " + bCheck);
		
		bCheck=!bCheck; // 부정연산자(!)는 boolean에서만 사용
		System.out.println("변경 후 : " + bCheck);
		
//		boolean aa=true;
//		while(true) {
//			aa=!aa;
//			if(aa==true) {
//				System.out.println("사용자");
//			}else {
//				System.out.println("컴퓨터");
//			}
//		}
	}

}
