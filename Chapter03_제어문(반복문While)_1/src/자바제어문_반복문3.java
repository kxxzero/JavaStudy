
import java.util.Scanner;
public class 자바제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math;
		int total;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		while(true) { // 무한 루프
			System.out.println("국어 점수 입력 : ");
			kor= scan.nextInt();
			if(kor>=0 && kor<=100) {
				break; // 종료
			}
		}
		
		while(true) { // 무한 루프
			System.out.println("영어 점수 입력 : ");
			eng= scan.nextInt();
			if(eng>=0 && eng<=100) {
				break; // 종료
			}
		}
		
		while(true) { // 무한 루프
			System.out.println("수학 점수 입력 : ");
			math= scan.nextInt();
			if(math>=0 && math<=100) {
				break; // 종료
			}
		}
		
		
		// 세번 반복하기 때문에 for문 작성
		
//		for(int i=1; i<=3; i++) {
//			while(true) { // 무한 루프
//				System.out.println("국어 점수 입력 : ");
//				kor= scan.nextInt();
//				if(kor>=0 && kor<=100) {
//					break; // 종료
//				}
//			}
//		}
		
		total = kor+eng+math;
		avg=total/3.0;
		
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("총합 : " + total);
		System.out.printf("평균 : %.2f" , avg);
	}

}
