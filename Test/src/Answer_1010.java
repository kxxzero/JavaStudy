
import java.text.DecimalFormat;

// 1) 영화
class 영화
{
	int movieId;
	String poster, titKr, titEng, date, genre, nation, grade, time;
	int score, rank;
	String story;
}

// 2) 뉴스
class 뉴스
{
	int news_no;
	String poster;
	String title;
	String content;
	String regdate;
	String author;
}

// 3) 맛집 카테고리
class 맛집_카테고리
{
	int food_cate_no;
	String title;
	String subject;
	String poster;
}

// 4) 맛집 정보
class 맛집
{
	int food_no;
	String name;
	double score;
	String address;
	String phone;
	String type;
	String price;
	String parking;
	String time;
	String menu;
}

// 5) 음식 레시피
class 레시피
{
	int recipe_no;
	String poster;
	String title;
	String chef;
	int score;
	int hit;
	int showUser;
}

// 6) 음악 차트
class 음악
{
	int music_no;
	int rank;
	String state; // 유지, 상승, 하강
	int idcrement; // 등폭
	String poster;
	String title;
	String artist;
	String album;
	int like;
}

// 7) 온라인 마트 상품 목록
class 상품
{
	int goods_no;
	int goods_discount;
	String goods_poster;
	String goods_name;
	int goods_price;
}

// 8) 연극
class 연극
{
	int con_no;
	String poster, title, genre, regdate, location, actor, grade, time;
	int state;
}


public class Answer_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int like=12345679;
		// 라이브러리 => 숫자 => int
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println("♡ "+df.format(like));
	}

}
