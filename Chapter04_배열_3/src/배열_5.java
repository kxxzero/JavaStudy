
/*
 *	선택 정렬 / 버블 정렬	
 *	
 *	30 10 50 40 20
 *	---------------
 *	10 30 
 *	10    50
 *	10       40
 *  10          20
 *  --------------- 1Round
 *  10 30 50 40 20
 *  ---------------
 *     30 50
 *     30
 *     30
 *     20
 *  --------------- 2Round
 *  
 *  
 *  --------------- 3Round
 *  
 *  
 *  --------------- 4Round
 *  
 *  i	j		=> i+j=4	=> j=4-i
 *  ----------
 *  0	4
 *  1	3
 *  2	2
 *  3	1
 *   *  
 *
 *	ASC(오름차순) : 10 20 30 40 50 
 *	DESC(내림차순) : 50 40 30 20 10
 */

import java.util.Arrays;
import java.util.Scanner;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1; // 1 ~ 100
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(arr));
		
		// 정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("===== 정렬 후(ASC) =====");
		System.out.println(Arrays.toString(arr));
		
		
		
		// 정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("===== 정렬 후(DESC) =====");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("===== API =====");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
