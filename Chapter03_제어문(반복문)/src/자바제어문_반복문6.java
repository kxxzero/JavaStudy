
// 1 ~ 100 => 5의 배수의 합, 개수
public class 자바제어문_반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num5=0, count=0;
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				num5+=i;
				count++; // 5의 배수일 경우 개수 하나씩 증가
			}
		}
		
		System.out.println("1~100 5의 배수의 합 : " + num5);
		System.out.println("1~100 5의 배수의 개수 : " + count);
	}

}
