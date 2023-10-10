
/*
 * 	
 */
import java.util.*;
public class MainClass2 {

	static int[] lastday= {31,28,31,30,31,30,
							31,31,30,31,30,31};
	static String[] strWeek= {"일", "월", "화", "수", "목", "금", "토"};
	static int year, month, week; // 전역변수 : 클래스 안에 있는 모든 메소드에서 사용 가능

	// 연도, 월 입력
	static void userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("연도 입력:");
		year=scan.nextInt();
		
		System.out.println("월 입력:");
		month=scan.nextInt();
	}
	
	// 요일 구하기
	static void dayTotal()
	{
		// 1년도 1월 1일 ~ 요청한 날짜까지의 총일수%7 => 요일(각 월의 1일자에 대한 요일을 구함)
		// ① 전년도까지의 합
		int total=(year-1)*365
				+(year-1)/4 // 4년마다 윤년
				-(year-1)/100 // 100년마다 제외
				+(year-1)/400; // 400년마다 윤년
		
		int[] lastday= {31,28,31,30, 31,30,31,31, 30,31,30,31}; // 명시적 초기화
		
		// * 윤년일 때 2월 : 29일 / 윤년이 아닐 때 2월 : 28일
		if((year%4==0) && (year%100!=0) || (year%400==0)) { // 윤년이라면
			lastday[1]=29; // 인덱스 번호 1 => 두번째
		}
		else {
			lastday[1]=28;
		}
		
		// ② 전달까지의 합
		for(int i=0; i<month-1;i++) {
			total+=lastday[i];
		}
		
		// ③ +1
		total++;
		
		// ④ 요일 구하기
		week=total%7;
	}
	
	static void print()
	{
		System.out.println(year+"년도 "+month+"월 1일은 "+strWeek[week]+"요일입니다.");
		System.out.println(year+"년도 "+month+"월");
		
		System.out.println(); // 한 줄 띄기
		
		for(int i=0; i<strWeek.length; i++) {
			System.out.print(strWeek[i]+"\t"); // 요일 출력
		}
		
		System.out.println(); // 한 줄 띄기
		
		for(int i=1; i<=lastday[month-1]; i++) { // 일 수 출력
			if(i==1) {
				for(int j=0; j<week; j++) { // 일주일
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i); // 여백 생성
			
			week++;
			if(week>6) { // 토요일이면
				week=0; // 일요일로 바꿈
				System.out.println(); // 줄 바꿈
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		userInput();
        dayTotal();
        print();
	}

}
