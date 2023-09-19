
import java.util.Scanner;
public class Test_0919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n===== 1 =====");
		
		// 1) 2+4+6+....100까지의 정수의 합을 구하고 출력하라
		int sum=0;
		for(int i=2; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println("2+4+6+...100까지의 합 : " + sum);
		
		
		System.out.println("\n===== 2 =====");
		
		// 2) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라
		for(int j=5; j<=50; j+=5) {
			System.out.print(j+ " ");
		}
		
		
		System.out.println("\n===== 3 =====");		
		
		// 3) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라
		for(char ch='B'; ch<='N'; ch++) {
			System.out.println(ch);
		}
		
		System.out.println("\n===== 4 =====");
		
		// 4) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
		System.out.println("1개의 정수 입력 : ");
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int n2 = scan.nextInt();
		int sum2= 0;

		for(num=1; num<=n2; num++) {
			sum2+=num;
		}System.out.println(sum2);
		
		System.out.println("\n===== 5 =====");
		
		// 5) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
		for(int k=1; k<=30; k++) {
			if(k%2==0) {
				System.out.println(k);
			}
		}
		
		System.out.println("\n===== 6 =====");
		
		// 6) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라
		
		System.out.println("\n===== 7 =====");
		
		// 7) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라
		for(int m=1; m<=10; m++) {
			if(m%3!=0) {
				System.out.println(m);
			}
		}
		
		System.out.println("\n===== 8 =====");
		
		// 8) 100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
		int count7=0, total7=0;
		
		for (int n=100; n<=999; n++) {
			if(n%7==0) {
				count7++;
				total7+=n;
			}
		}
		System.out.println("7의 배수 개수 : " + count7);
		System.out.println("7의 배수 합 : " + total7);

		
		System.out.println("\n===== 9 =====");
		
		// 9) 100~999 사이의 4의 배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
		int count= 0, total = 0;
		
		for(int o=100; o<=999; o++) {
			if(o%4!=0) {
				count++;
				total+=o;
			}
		}
		System.out.println("개수 : " + count);
		System.out.println("합 : " + total);
		
		
		System.out.println("\n===== 10 =====");
		
		// 10) 1~30 짝수합,홀수합을 출력하는 프로그램을 작성
		int even=0, odd=0;
		for(int p=1; p<=30; p++) {
			if(p%2==0) {
				even+=p;
			}
			else {
				odd+=p;
			}
		}
		
		System.out.println("짝수 합 : " + even);
		System.out.println("홀수 합 : " + odd);
		
		
		System.out.println("\n===== 11 =====");
		
		//11) 1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
		
		int num3=0, num5=0;
		for(int q=1; q<=100; q++) {
			if(q%3==0) {
//				num3*q;
				System.out.println(num3);
			}
		}
	}

}
