
// 20개의 정수 난수 발생 => 짝수, 홀수
public class 자바제어문_반복문11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int even=0, odd=0;
		int num3=0, num5=0, num7=0;
		
		for(int i=0; i<20; i++) {
			int rand=(int)(Math.random()*10)+1;
			System.out.println(rand+" ");
			
			if(rand%3==0) {
				num3++;
			}
			
			if(rand%5==0) {
				num5++;
			}
			
			if(rand%7==0) {
				num7++;
			}
			
			
			
			if(rand%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("3의 배수의 개수 : " + num3);
		System.out.println("5의 배수의 개수 : " + num5);
		System.out.println("7의 배수의 개수 : " + num7);
		
		System.out.println("\n===== 결과값 =====");
		System.out.println("짝수의 개수 : " + even);
		System.out.println("홀수의 개수 : " + odd);
		
		// for문 수행 시 수열(숫자마다 패턴을 가지고 있어야 반복문이 수행된다.)
		
		
		System.out.println("====================");
		// 1-2+3-4+5-6+7-8+9=10
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				sum-=i;
			}
			else {
				sum+=i;
			}
		}
		
		// BDFHJLN
		for(char ch='B'; ch<='N'; ch+=2) {
			System.out.print(ch+ " ");
		}
	}

}
