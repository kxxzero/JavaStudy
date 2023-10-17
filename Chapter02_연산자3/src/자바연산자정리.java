/*
 *	웹 관련 필수 연산자
 *		---------- 메소드(기능 수행)
 *		증감 연산자 : 반복문에서 주로 사용 (++, --)
 *		부정 연산자 : 반대 효과
 *		형변환 연산자 : 클래스
 *		--------------------
 *		산술 연산자 : +(문자열 결합)
 *					%(년도 계산, 페이지)
 *		비교 연산자 : 반복문, 조건문
 *		논리 연산자 : 기간, 범위 => &&
 *		대입 연산자 : =, +=
 *		--------------------
 *	 
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.*;
public class 자바연산자정리 {

	public static void main(String[] args) throws Exception // 예외 처리
	{ 
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력");
		String fd=scan.next();

		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("a.title");
		Elements artist=doc.select("a.artist");
		for(int i=0; i<50; i++) {
			if(title.get(i).text().contains(fd)) {
				System.out.println(title.get(i).text() + "(" + artist.get(i).text()+")");
			}
		}
		
	}

}
