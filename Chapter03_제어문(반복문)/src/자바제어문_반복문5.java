
// 1 ~ 100 => 3의 배수의 합, 5의 배수의 합, 7의 배수의 합
public class 자바제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num3=0, num5=0, num7=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) { // 15
				num3+=i; // num3에 3의 배수의 합 대입
			}
			if(i%5==0) { // 15
				num5+=i;
			}
			if(i%7==0) {
				num7+=i;
			}
		}
		System.out.println("1~100 3의 배수 합 : " + num3);
		System.out.println("1~100 5의 배수 합 : " + num5);
		System.out.println("1~100 7의 배수 합 : " + num7);
		
	}

}
