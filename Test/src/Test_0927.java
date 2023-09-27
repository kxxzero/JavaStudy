
import java.util.Scanner;
public class Test_0927 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// 1) 5명의 학생의 국어 점수를 받아서 등수를 출력하는 프로그램 작성
//		System.out.println("국어 점수 입력:");
//		String[] kor= new String[5];
//		for(int i=0; i<kor.length; i++) {
//		}
		

		System.out.println("========== 2 ==========");
		
		
		// 2) 10개의 임의의 정수를 받아서 최대값,최소값(난수) 구하는 프로그램 작성
		int[] num=new int[10];
		int max=0, min=100;
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
			if(max<num[i]) {
				max=num[i];
			}
			else if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);


		System.out.println("========== 3 ==========");
		
		
		// 3) 100개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
		int[] num100=new int[100];
		int count=0;
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
		}


		System.out.println("========== 4 ==========");
		
		
		// 4) 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
		int[] num10=new int[10];
		for(int i=0; i<num10.length; i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		
		
		System.out.println(num10[1]);


		System.out.println("========== 5 ==========");
		
		
		// 5) 위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 

		System.out.println("========== 6 ==========");
		
		// 6) 10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
		
		System.out.println("========== 7 ==========");

		// 7) 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
		
		System.out.println("========== 8 ==========");
		
		// 8) 5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
		
		System.out.println("========== 9 ==========");

		// 9) char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
		
		System.out.println("========== 10 ==========");

		// 10) 위문제를 역순으로 출력하시오
		
		System.out.println("========== 11 ==========");

		// 11) 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오
		System.out.println("정수 10개 입력(10,10,10,10,10,10,10,10,10,10):");
		int[] num3=new int[10];
//		num3[]=scan.next();
		
		System.out.println("========== 12 ==========");
		
		// 12) 10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
		
		System.out.println("========== 13 ==========");

		// 13) 3명의 학생에 대한 국어,영어,수학 점수를 입력받아서 저장후에 총점,평균,등수를 구하고 국어점수 총점,영어점수 총점,수학점수의 총점을 구해서 출력하는 프로그램을 작성하시오


		
	}

}
