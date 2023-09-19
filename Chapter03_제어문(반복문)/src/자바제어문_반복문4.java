// 1 ~ 100 => 루프 변수
// 총합, 짝수합, 홀수합 => 누적 변수

public class 자바제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, even=0, odd=0;
		// 0 => 장바구니 => 결제 금액
		for(int i=1; i<=100; i++) {
			sum+=i; // 총합 구하는 공식
//			System.out.println("i=" + i + ", sum=" + sum);
			if(i%2==0) {
				even+=i; // 짝수 누적 => 짝수의 합
			}
			else {
				odd+=i; // 홀수의 합
			}
		}
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
		System.out.println("총합 : " + sum);
	}

}
