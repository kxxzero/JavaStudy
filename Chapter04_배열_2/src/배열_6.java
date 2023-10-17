
// 1 ~ 100 10개 저장 => 총합, 평균, 최댓값, 최솟값, 최댓값의 위치, 최솟값의 위치

import java.util.Arrays;
import java.util.Scanner;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr=new int[10]; // 10개 저장
		
		// 초기화
		int[] arr= {10,20,10,30,40,50,30,10,30,50};
		
//		for(int i=0; i<arr.length; i++) { // 10개 발생
//			arr[i]=(int)(Math.random()*100)+1; // 난수 발생
//		}
		System.out.println("===== 저장된 값 =====");
		System.out.println(Arrays.toString(arr)); // 배열 출력

		int sum=0; // 총합
		for(int i:arr) { // 배열 불러오기
			sum+=i; // 누적(실제 저장된 값 필요)
		}
		System.out.println("총합:"+sum);
		System.out.printf("평균: %.2f\n", (sum/10.0));
		
		int max=0, min=100; // 최댓값 : 가장 작은 값 부여, 최솟값 : 가장 큰 값 부여
		for(int i:arr) {
			if(max<i) { // i가 최댓값보다 크면 최댓값은 i다.
				max=i;
			}
			if(min>i) { // i가 최솟값보다 작으면 최솟값은 i다.
				min=i;
			}
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
		
		// index 번호 필요
		int index=0; // 위치 저장
		for(int i=0; i<arr.length; i++) {
			if(max==arr[i]) {
				index=i;
				break;
			}
		}
		System.out.println("최댓값의 위치:"+(index+1)+"번째 위치합니다.");
		
		for(int i=0; i<arr.length; i++) {
			if(min==arr[i]) {
				index=i;
				break;
			}
		}
	
		System.out.println("최솟값의 위치:"+(index+1)+"번째 위치합니다.");
	}

}
