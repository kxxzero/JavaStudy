
import java.util.Scanner;
public class Answer_0919 {

	public static void main(String[] args) {

		System.out.println("\n========== 1 ==========");
		
		// 1) 2+4+6+....100까지의 정수의 합을 구하고 출력하라
		int sum=0;
		for(int i=2; i<=100; i+=2) {
			sum+=i;
		}
		System.out.println("2+4+6+...100까지의 합 : " + sum);
		
		
		
		System.out.println("\n========== 2 ==========");
		
		// 2) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라
		for(int i=5; i<=50; i+=5) {
			if(i==50) {
				System.out.println(i);
			}
			else {
				System.out.print(i+",");
			}
		}
		
		
		
		System.out.println("\n========== 3 ==========");		
		
		// 3) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라
		for(char ch='B'; ch<='N'; ch+=2) {
			if(ch!='N')
			{
				System.out.println(ch);
			}
			else {
				System.out.println(ch);
			}
		}
		
		
		
		System.out.println("\n========== 4 ==========");
		
		// 4) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
		Scanner scan = new Scanner(System.in);
		System.out.println("1개의 정수 입력 : ");
		int num = 0, sum2= 0;
		num=scan.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum2+=i;
		}System.out.println(sum2);
		
		
		
		
		System.out.println("\n========== 5 ==========");
		
		// 5) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
		for(int i=1; i<=30; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
			if(i%6==0) {
				System.out.println();
			}
		}
		
		
		
		System.out.println("\n========== 6 ==========");
		
		// 6) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라
		int sum3=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum3-=i;
			}
			else {
				sum3+=i;
			}
		}
		System.out.println(sum3);
		
		
		
		System.out.println("\n========== 7 ==========");
		
		// 7) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라
		for(int i=1; i<=10; i++) {
			
			if(i%3==0) {
				continue; // i++(다음 순서)로 이동 : 증가식으로 이동
			}
			System.out.println(i+" ");
			
//			if(m%3!=0) {
//				System.out.println(m+" ");
//			}
		}
		
		
		
		System.out.println("\n========== 8 ==========");
		
		// 8) 100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
		int count7=0, total7=0;
		
		for (int i=100; i<=999; i++) {
			if(i%7==0) {
				count7++;
				total7+=i;
			}
		}
		System.out.println("7의 배수 개수 : " + count7);
		System.out.println("7의 배수 합 : " + total7);

		
		
		System.out.println("\n========== 9 ==========");
		
		// 9) 100~999 사이의 4의 배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
		int count= 0, total = 0;
		
		for(int i=100; i<=999; i++) {
			if(i%4!=0) {
				count++;
				total+=i;
			}
		}
		System.out.println("개수 : " + count);
		System.out.println("합 : " + total);
		
		
		
		System.out.println("\n========== 10 ==========");
		
		// 10) 1~30 짝수합,홀수합을 출력하는 프로그램을 작성
		int even=0, odd=0;
		for(int i=1; i<=30; i++) {
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
		}
		
		System.out.println("짝수 합 : " + even);
		System.out.println("홀수 합 : " + odd);
		
		
		
		System.out.println("\n========== 11 ==========");
		
		//11) 1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
		int num3=0, num5=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print (i+" ");
			}
		}
		
		
		// 12) 1~1000까지에서 7의 배수의 합 ,9의 배수의 합
		System.out.println("\n========== 12 ==========");
		
		int a=0, b=0;
		a=b=0;
		for(int i=1; i<=1000; i++) {
			if(i%7==0) {
				a+=i;
			}
			if(i%9==0) {
				b+=i;
			}
		}
		System.out.println("7의 배수 : " + a);
		System.out.println("9의 배수 : " + b);
		System.out.println("7의 배수 + 9의 배수 : " + (a+b));
		
		
		// 13) 10~99까지 정수중에 같은 자리의 정수를 출력하시오
		for(int i=10; i<=99; i++) {
			if(i%11==0)
				System.out.println(i);
		}
	}

}
