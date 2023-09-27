
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class Test_0927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========== 1 ==========");
		// 1) 5명의 학생의 국어 점수를 받아서 등수를 출력하는 프로그램 작성
		int[] kor=new int[5];
		int[] rank=new int[5];
		for(int i=0; i<kor.length; i++) {
			kor[i]=(int)(Math.random()*50)+50;
		}
		System.out.println("국어 점수:"+Arrays.toString(kor));
		
		for(int i=0; i<rank.length; i++) {
			rank[i]=1; // 1등과 비교
			for(int j=0; j<kor.length; j++) {
				if(kor[i]> kor[j]) {
					rank[i]++;
				}
			}
		}
		for(int i=0; i<kor.length; i++) {
			System.out.println(kor[i]+"점 "+rank[i]+"등");
		}
		
		

		System.out.println("========== 2 ==========");
		// 2) 10개의 임의의 정수를 받아서 최대값, 최소값(난수) 구하는 프로그램 작성
		int[] arr=new int[10];
		int max=0, min=100;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100)+1;
			if(max<arr[i]) {
				max=arr[i];
			}
			else if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);


		
		System.out.println("========== 3 ==========");
		// 3) 100개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
		int[] arr1=new int[100];
		int[] count= new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=(int)(Math.random()*10); // 0~9
		}
		System.out.println(Arrays.toString(arr1));
		
		for(int i:arr1) { // i=arr1[]
			count[i]++; // i일 때 증가
		}
		for(int i=0; i<count.length; i++) {
			System.out.printf("count[%d]=%d\n", i, count[i]);
		}


		
		System.out.println("========== 4 ==========");
		// 4) 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
		int[] arr2=new int[10];
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=(int)(Math.random()*100)+1; // double random() => 0.0~0.99
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("인덱스가 1인 곳의 값:"+arr2[1]);

		

		System.out.println("========== 5 ==========");
		// 5) 위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 
		System.out.println(Arrays.toString(arr2));
		int max2=0;
		for(int i=0; i<arr2.length;i++) {
			if(max2<arr2[i])
				max2=arr2[i];
		}
		int index=0;
		for(int i=0; i<arr2.length; i++) {
			if(max2==arr2[i]) {
				index=i;
				break;
			}
		}
		System.out.println("최댓값의 인덱스:"+index);
		

		
		System.out.println("========== 6 ==========");
		// 6) 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
		int[] arr3=new int[10];
		for(int i=0; i<arr3.length; i++) {
			arr3[i]=(int)(Math.random()*100)+1; // double random() => 0.0~0.99
		}
		System.out.println(Arrays.toString(arr3));
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f\n", sum/10.0);
		
		
		
		System.out.println("========== 7 ==========");
		// 7) 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
		int[] arr4=new int[10];
		for(int i=0; i<arr4.length; i++) {
			arr4[i]=(int)(Math.random()*100)+1; // double random() => 0.0~0.99
		}
		System.out.println(Arrays.toString(arr4));
		for(int i=0; i<arr4.length; i++) {
			if(i==3) {
				continue; // 인덱스가 3인 것을 제외
			}
			System.out.print(arr4[i]+" ");
		}
		
		
		
		System.out.println("\n========== 8 ==========");		
		// 8) 5개의 난수를 배열에 저장한 후에 인덱스번호 2개를 받아서 값을 교환하는 프로그램을 작성하시오
		int[] arr5=new int[5];
		for(int i=0; i<arr5.length; i++) {
			arr5[i]=(int)(Math.random()*100)+1;
		}
//		System.out.println(Arrays.toString(arr5));
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("첫번째 인덱스 입력:");
//		int index1=scan.nextInt();
//		System.out.println("두번째 인덱스 입력:");
//		int index2=scan.nextInt();
//		
//		// 교환 => 임시 변수 설정
//		int temp=arr5[index1];
//		arr5[index1]=arr5[index2];
//		arr5[index2]=temp;
//		System.out.println(Arrays.toString(arr5));
		
		
		
		System.out.println("========== 9 ==========");
		// 9) char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
		char[] arr6=new char[26];
		char c='A';
		for(int i=0; i<arr6.length; i++) {
			arr6[i]=c++;
		}
		for(char i:arr6) {
			System.out.print(i+" ");
		}
		
		
		
		System.out.println("\n========== 10 ==========");
		// 10) 위문제를 역순으로 출력하시오
		System.out.println();
		for(int i=arr6.length-1; i>=0; i--) {
			System.out.print(arr6[i]+" ");
		}
		
		
		
		System.out.println("\n========== 11 ==========");
		// 11) 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오
		int[] arr7=new int[10];
		for(int i=0; i<arr7.length; i++) {
			arr7[i]=(int)(Math.random()*100)+1; // double random() => 0.0~0.99
		}
		System.out.println(Arrays.toString(arr7));
		
		for(int i:arr7) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
		System.out.println("\n========== 12 ==========");
		
		// 12) 10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
		
		System.out.println("========== 13 ==========");

		// 13) 3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오


		
	}

}
