
/*
 * 	1. 값만 전송하는 방식 => 원본 훼손 없이 값만 전송 => Call By Value
 * 		- 기본형 : 메모리가 다르다
 * 
 * 	2. 메모리 주소를 전송하는 방식 => Call By Reference
 * 		- 배열/클래스 : 같은 메모리에서 작업
 * 		= 예외) String (Call By Value)
 * 		= Spring
 * 		= 얕은 복사 : 
 * 		
 * 	
 */

public class 메소드_매개변수전송법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10, 20, 30};
		System.out.println("arr="+arr);
		
		// 얕은 복사 : Call By Reference(참조)
		int[] temp=arr;
		System.out.println("arr="+arr);
		System.out.println("temp="+temp);
		
		System.out.println("temp[0]="+temp[0]);
		System.out.println("arr[0]="+arr[0]); // AS
		
		temp[0] = 1000;
		System.out.println("arr[0]="+arr[0]);
		
		int a=10;
		int b=a;
		System.out.println("b="+b);
		b=100;
		System.out.println("b="+b);
		
	}

}
