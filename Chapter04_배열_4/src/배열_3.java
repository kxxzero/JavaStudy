/*
 * 	*** 알고리즘 : 정렬(선택 정렬, 버블 정렬)
 * 	*** 자료구조 : 데이터 관리(저장, 불러오기)
 * 				- 스택(LIFO: Last In First Out 마지막에 들어간 것이 먼저 나옴) => 메모리
 * 				- 큐(FIFO: First In First Out 처음 들어간 것이 먼저 나옴) => 네트워크
 * 				- 데큐(양방향)
 * 
 *	--------------------------------------------------------------------------------
 *	선택 정렬 : 1개를 선택해서 변경
 *		예)	30 10 20 50 40 => 10 20 30 40 50
 *			-- --
 *			10 30
 *			--	  --
 *			10	  20
 *			-- 		 --
 *			10		 50
 *			-- 			--
 *			10			40
 *			--------------
 *			10 30 20 50 40
 *			   -- --
 *			   20 30
 *			   --	 --
 *			   20    50
 *			   --      	--
 *			   20		40
 *			--------------
 *			10 20 30 50 40
 *				  -- --
 *				  30 50
 *				  --	--
 *				  30	40
 *			--------------
 *			10 20 30 50 40
 *					 -- --
 *					 40 50
 *			--------------
 *			10 20 30 40 50
 *
 *	버블 정렬 : 인접한 것끼리 변경 => 오른쪽 정렬
 *		예)  30 10 20 50 40
 *			-- --
 *			10 30
 *			   -- --
 *			   20 30
 *				  -- --
 *				  30 50
 *					 -- --
 *					 40 50
 *			--------------
 *			10 20 30 40 50
 * 
 */

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5]; // 초기화
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("★★★★★ 정렬 전 ★★★★★");
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) { // 비교 기준이 비교 대상보다 더 큰 경우 변경
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("====="+(i+1)+"Round=====");
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println();
		
		System.out.println("★★★★★ 정렬 후 ★★★★★");
		System.out.println(Arrays.toString(arr));
	}

}
