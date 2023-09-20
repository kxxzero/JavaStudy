/*
 *	while문
 *	=> 10개의 난수 : 1 ~ 100
 *	=> 최대값 / 최소값
 *
 */


public class 자바제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max=1, min=100; // 초기값 부여
		int i=1; // 루프 변수 => 1 ~ 100
		while(i<=10) // 10개 난수 발생
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.println(rand+" ");
			i++;
			
			// 최대값, 최소값
			if(max<rand) {
				max=rand;
			}
			if(min>rand) {
				min=rand;
			}
			i++;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
