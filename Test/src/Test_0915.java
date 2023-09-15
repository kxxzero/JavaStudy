
import java.util.Scanner;
public class Test_0915 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1) 정수 한 개를 입력 받아서, 그 수가 50 이상의 수인지 50 미만의 수인지 판단해 보자.
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수 1개 입력 : ");
		int num=scan.nextInt();
		
		if(num>=50)
			System.out.println(num + "는(은) 50 이상의 수입니다.");
		
		if(num<50)
			System.out.println(num + "는(은) 50 미만의 수입니다.");
		
		
		// 2) 정수 한 개를 입력 받아서, 그 수가 3의 배수인지 판단해 보자.
		System.out.println("정수 1개 입력 : ");
		int num2=scan.nextInt();
		
		if(num2%3==0)
			System.out.println(num2 + "는(은) 3의 배수입니다.");
		
		if(num2%3!=0)
			System.out.println(num2 + "는(은) 3의 배수가 아닙니다.");

		
		// 3) 1학년부터 4학년까지 중간고사 시험을 보았다.
		// 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
		// 이를 판단하는 프로그램을 작성해 보자.
		// 점수가 0미만 100초과이면 경고 문구 출력!
		System.out.println("학년 입력 (1 ~ 4) : ");
		int grade=scan.nextInt();
		System.out.println("점수 입력 : ");
		int score=scan.nextInt();
		
		if(grade==4) {
			if(score>=70 && score<=100) {
				System.out.println("합격입니다.");
			}
			if(score<70) {
				System.out.println("불합격입니다.");
			}
		}
		
		if(grade<4) {
			if(score>=60 && score<=100) {
				System.out.println("합격입니다.");
			}
			if(score<60) {
				System.out.println("불합격입니다.");
			}
		}
			
		if(score<0 || score>100)
			System.out.println("잘못된 입력값입니다.");
		
		
		// 4) 사용자로부터 세 개의 정수를 입력 받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
		System.out.println("정수 3개 입력 : ");
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		
		int max, min;
		int total = num3 + num4 + num5;
		double avg = total/3.0;
		
//		System.out.printf(num3, num4, num5);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);

		
		// 5) 사용자로부터 정수를 입력 받아서 양수인지 음수인지 확인하는 프로그램 작성
		System.out.println("정수 1개 입력 : ");
		int num6 = scan.nextInt();
		
		if(num6<0)
			System.out.println("음수입니다.");
		
		if(num6>0)
			System.out.println("양수입니다.");

		
		// 6) 임의의 문자를 추출하여 대문자(65)인지 소문자(97)인지 확인하는 프로그램 작성
		char ch1=(char)((Math.random()*26)+65); // 대문자
		char ch2=(char)((Math.random()*26)+97); // 소문자
		int a=(int)(Math.random()*2); // 0, 1
		char ch3=' ';
		
		if(a==0)
			ch3=ch1;
		if(a==1)
			ch3=ch2;
		
		if(ch3>='A' && ch3<='Z')
			System.out.println(ch3 + "는(은) 대문자입니다.");

		if(ch3>='a' && ch3<='z')
			System.out.println(ch3 + "는(은) 소문자입니다.");
			
			
		// 7) 정수 3개를 입력 받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
		//(90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F)
		System.out.println("국어 점수 입력 : ");
		int kor = scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		int eng = scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		int math = scan.nextInt();
		
		int totalScore = kor + eng + math;
		double avgScore = totalScore/3.0;
		
		if(avgScore >= 90 && avgScore <= 100)
			System.out.println("A 학점");
		if(avgScore >= 80 && avgScore < 90)
			System.out.println("B 학점");
		if(avgScore >= 70 && avgScore < 80)
			System.out.println("C 학점");
		if(avgScore >= 60 && avgScore < 70)
			System.out.println("D 학점");
		if(avgScore < 60)
			System.out.println("F 학점");
		

	}

}
