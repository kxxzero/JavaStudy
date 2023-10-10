
/*
 *  프로그램의 기본 : 데이터를 묶어서 1개의 이름으로 사용
 *  사용자 정의 데이터형
 *  자바에서는 
 */

// 영화 정보
class Movie
{
	int movieId; // 구분자(고유번호) => 상세보기, 찾기 시 이용
	
	// 값이 변하지 않는 경우 String 사용
	String poster, nameKr, nameEng;
	String regdate;
	String genre;
	String nation;
	String grade;
	String time;
	
	// 값이 변하는 경우
	double score;
	int showUser;
	int boxOffice;
	int startDay;
}

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
