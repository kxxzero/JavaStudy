
// 국어, 영어, 수학 점수 입력 => 총점, 평균, 학점
import java.util.*;
public class 메소드_문제_3 {
	
	// 입력
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+"점수 입력:");
		int num=scan.nextInt();
		return num;
	}
	
	// 총점
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	
	// 평균
	static double avg(int total)
	{
		return total/3.0;
	}
	
	// 학점
	static char score(int avg)
	{
		char c='A';
		switch(avg) // 실수는 받을 수 없음
		{
		case 10:
		case 9:
			c='A';
			break;
		case 8:
			c='B';
			break;
		case 7:
			c='C';
			break;
		case 6:
			c='D';
			break;
		default:
			c='F';
		}
		return c;
	}
	
	// 출력
	static void print(int kor, int eng, int math, int total, double avg, char c)
	{
		System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n", kor, eng, math, total, avg, c);
	}
	
	// 조립
	static void process()
	{
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		int total=total(kor, eng, math);
		double avg=avg(total);
		char c=score((int)(avg/10));
		print(kor, eng, math, total, avg, c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
