/*
 * 	new => 메모리 확보
 * 		--------------- 메모리 크기
 * 		메모리 주소 전송 => new를 사용할 때마다 메모리 주소가 달라진다.
 * 		예) int[] arr=new int[5];
 * 			arr
 * 		----------		---[0]-----[1]-----[2]-----[3]-----[4]---
 * 			100				0		0		0		0		0
 * 		----------		-----------------------------------------
 * 		메모리 주소를 이용해서 데이터를 제어 => 참조변수(배열, 클래스)
 * 		=> 데이터형의 형변환
 * 		예) double[] arr={10, 20, 'A', 'B', 30}
 * 			=> 	arr[0] = 10.0
 * 				arr[1] = 20.2
 * 				arr[2] = 65.0
 * 				arr[3] = 66.0
 * 				arr[4] = 30.0
 * 			int[] arr={10.0, 'A', 'B', 20, 30} // 오류 발생 => int 안에 double값(10.0)을 저장할 수 없음
 * 			boolean[] arr={true, false, true...}
 * 			데이터형[] 배열명;
 * 			=> 전체 크기(저장된 개수) => length
 * 			=> 데이터형[] 배열명=new 데이터형[배열 크기]; // 오류 발생
 * 			=> 배열 복사
 * 				- 얕은 복사 : 참조(공유) => 배열, 클래
 * 					저장된 주소값이 같은 경우에는 같은 메모리를 제어
 * 					
 * 				- 깊은 복사 : 새로운 배열을 만든다.
 * 			int a=10;
 * 			int b=a;
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 얕은 복사 => Call By Reference
		// 	Call By Value
		
		int[] arr=new int[5]; // 0으로 초기화 => 연속적인 메모리 구조
//		int arr2=arr; // 얕은 복사
		
		System.out.println("arr="+arr);
//		System.out.println("arr2="+arr2);
		arr[0]=100;
		arr[1]=200;
		
//		System.out.println("arr2:"+arr2[0]);
//		System.out.println("arr2:"+arr2[1]);
		
		
		
		
	}

}
