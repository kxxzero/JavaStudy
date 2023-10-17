
import java.util.Calendar;
import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year, month;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("연도 입력:");
		year=scan.nextInt();
		
		System.out.println("월 입력:");
		month=scan.nextInt();
		
		// 라이브러리 이용(API)
		Calendar cal=Calendar.getInstance(); // 클래스 저장 => 싱글턴 (예: Scanner scan=new Scanner(System.in))
		
		// 셋팅 => year, month, day
		cal.set(Calendar. YEAR, month); // YEAR : 상수
		cal.set(Calendar. MONTH, month-1);
		cal.set(Calendar. DATE, 1);
		
		char[] strweek= {'일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		// week => 1
		week=week-1;
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
//		System.out.println(year+"년도 "+month+"월 1일은 "+strweek[week]+"요일입니다.");
		
		
		// 달력 출력		
		System.out.println(year+"년도 "+month+"월");
		
		System.out.println(); // 한 줄 띄기
		
		for(int i=0; i<strweek.length; i++) {
			System.out.print(strweek[i]+"\t"); // 요일 출력
		}
		
		System.out.println(); // 한 줄 띄기
		
		for(int i=1; i<=lastday; i++) { // 일 수 출력
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

}
