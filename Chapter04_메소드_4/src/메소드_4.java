
/*
 * 	달력 만들기
 * 	1) 절차적 언어(main에서 생성)
 * 	2) 구조적 프로그램(메소드 => 지역변수 => 매개변수 전송, 리턴형)
 * 	3) 객체 지향 프로그램(메소드 => 전역변수 => void) // 전달할 값이 필요없기 때문에 void 사용
 * 	
 * 	1. 사용자로부터 연도, 월을 입력 받는다.
 * 	2. 전년도까지의 총 일 수(1년 1월 1일 ~ 12. 31)
 * 	3. 전달까지의 총 일 수(요청한 달의 1일자를 구함)
 * 	4. 총일수%7 => 요일
 * 	5. 달력 출력
 * 	6. 조립
 * 
 * 	
 * 
 */
import java.util.Scanner;
public class 메소드_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 사용자로부터 연도, 월을 입력 받는다.
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		// 2. 전년도까지의 총 일 수(1년 1월 1일 ~ 12. 31)
		int total=(year-1)*365
				 +(year-1)/4
				 -(year-1)/100
				 +(year-1)/400;
		
		// 3. 전달까지의 총 일 수
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
		// 윤년 조건
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastday[1]=29;
		}
		else
		{
			lastday[2]=28;
		}
		for(int i=0; i<month-1; i++)
		{
			total+=lastday[i];
		}
		 
		// 요청한 달의 1일자 요일
		total++;
		
		// 요일 구하기
		int week=total%7;
		
		// 달력 출력
		String[] strWeek= {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year+"년도 "+month+"월");
		
		System.out.println(); // 한 줄 띄움
		
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		
		System.out.println(); // 한 줄 띄움
		
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				// 공백 
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				System.out.println();
				week=0;
			}
		}
		
	}

}
