
// 사용자로부터 정수 1개 => 구구단

import java.util.Scanner;
public class 자바제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=0, b=0, c=0, d=0, e=0;
//		int[] arr=new int[10]; // 배열
		
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan=scan.nextInt();
		int i=1;
		while(i<=9) {
			System.out.printf("%d*%d=%d\n", dan, i, dan*1);
			i++;
		}
	}
}
