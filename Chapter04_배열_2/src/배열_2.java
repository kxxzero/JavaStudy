/*
 * 	응용
 * 	=> 정수를 1개 입력 받아서 => 2진법 출력
 * 	32bit => 0,1 => 16bit(0~32767) => 양수만 출력
 * 
 * 	16bit
 * 	예) 10 => 0000 0000 0000 1010
 */

import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16]; // 16개의 데이터 값 : 0
		int index=binary.length-1; // length-1: 마지막 인덱스 번호 => 0 ~ 15
	
		// 역순으로 값을 배치
		Scanner scan=new Scanner(System.in);
		System.out.println("0~32767 사이의 정수 입력:");
		int num=scan.nextInt();
		
		System.out.println("===== Lib(라이브러리) =====");
		System.out.println(Integer.toBinaryString(num));
		
		while(true) { // 횟수 지정 불가 : 무한 루프
			binary[index]=num%2; // num을 2로 나눈 나머지 값 도출
			num=num/2;
			if(num==0) {
				break;
			}
			index--; // 역순
		}
		for(int i=0; i<binary.length; i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
