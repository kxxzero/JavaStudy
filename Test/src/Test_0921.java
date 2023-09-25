
import java.util.Scanner;
public class Test_0921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("========== 1번 ==========");
		// 1) Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 10의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
		Scanner scan = new Scanner(System.in);
		System.out.println("두 자리 정수 입력(10 ~ 99) : ");
		int num = scan.nextInt();
		
		if(num%11==0) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("10의 자리와 1의 자리가 다릅니다.");
		}
		
		
		
		System.out.println("========== 2번 ==========");
		// 2) 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.
		System.out.println("달을 입력하세요(1~12) : ");
		int month=scan.nextInt();
		
		if(month>=1 && month<=12) {
			switch(month){
				case 12 :
				case 1 :
				case 2 :
					System.out.println("겨울입니다.");
					break;
				
				case 3 :
				case 4 :
				case 5 :
					System.out.println("봄입니다.");
					break;
				
				case 6 :
				case 7 :
				case 8 :
					System.out.println("여름입니다.");
					break;
				
				default :
					System.out.println("가을입니다.");
			}
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
		System.out.println("========== 3번 ==========");
		// 3) 1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.
			int sum=0, i=1;
			
			while(i<100) {
				if(i%3!=0) {
					i++;
					break;
				}
				else {
					sum+=i;
					i++;
				}
			}
			System.out.println(sum);
			
			
			
			
		System.out.println("========== 4번 ==========");
		// 4) 1에서 50까지의 합을 더하는 while 문이다. 빈칸에 적절한 코드를 삽입하라.
		
		int sum2=0, j=1;
		
		while(j<50) {
			
			if(j<0) {
				break;
			}
			
			sum2+=j;
			j++;
		}
		System.out.println(sum2);
		
		
		
		System.out.println("========== 5번 ==========");
		// 5) 정수를 10개 저장하고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 평균을 출력하라.
		
		int k=1; 
		while(k<10) {
			k=(int)(Math.random()*10)+1;
			System.out.println(k);
		}
		System.out.println(k/10.0);
		
		
		
		System.out.println("========== 6번 ==========");
		// 6) 1부터 100 까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for 문을 사용해 작성해 보세요
		
		int sum3=0;
		
		for(int m=1; m<=100; m++) {
			if(i%2==0) {
				sum3+=i;
				System.out.print(i+ " ");
			}
		}
		
		System.out.println(sum3);
		
		
		
		System.out.println("========== 7번 ==========");
		// 7) 두 개의 주사위가 같은 값이 나올 때까지 while 문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력해 보세요.
		int dice1 = (int)(Math.random()*6)+1;
		int dice2 = (int)(Math.random()*6)+1;
		
		int count=1;
		while(true) {
			if(dice1!=dice2) {
				count++;
				System.out.println(dice1+ ", " + dice2);
			}
			else {
				break;
			}
			System.out.println("반복 횟수 : "+ count);
		}
		
		

		
	}

}
