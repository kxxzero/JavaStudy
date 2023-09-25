
// 문자열 입력 후 A, a가 몇 개인지 확인

import java.util.Scanner;
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String data=scan.next();
		int count=0; // A || a
		
		for(int i=0; i<data.length();i++) // 문자열 개수 > 문자열 인덱스(index) 번호 => 1개 적은 범위로 입력
		{
			char c=data.charAt(i); // charAt() : 문자를 1개씩 잘라올 때 사용하는 메소드
			if(c=='A' || c=='a') {
				count++;
			}
			
		}
		System.out.println("A|a의 개수는 " + count + "개 입니다.");
		
	}

}
