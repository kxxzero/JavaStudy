/*
 * 	40 30 10 50 20 => ASC
 * 	-- --
 * 	30 40
 * 	   -- --
 * 	   10 40
 * 		  -- --
 * 		  40 50
 * 			 -- --
 * 			 20 50
 * 	-------------- 1Round (1일 때 4바퀴)
 * 	30 10 40 20 50(고정)
 * 	-- --
 * 	10 30
 * 	   -- --
 * 	   30 40
 * 	      -- --
 * 		  20 40
 * 	-------------- 2Round (2일 때 3바퀴)
 * 	10 30 20 40 50
 * 	-- --
 * 	10 30
 * 	   -- --
 * 	   20 30
 * 	-------------- 3Round (3일 때 2바퀴)
 * 	10 20 30 40 50
 * 	-- --
 * 	10 20
 * 	-------------- 4Round (4일 때 1바퀴)
 * 	10 20 30 40 50
 * 
 * 	==>
 * 	i	j 	=>	i+j=4 => j=4(length-1)-i
 * 	0	4
 * 	1	3
 *  2	2
 *  3	1
 *  
 *  
 *  배열
 *  선언 => 초기값
 *  	- 명시적
 *  	- new
 *  		· 자동 초기화
 *  			예) int => 0
 */

import java.util.Arrays;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===== 정렬 후 =====");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
