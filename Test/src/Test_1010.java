
// 1) 영화
class movie
{
	int movieId;
	String poster, titKr, titEng, date, genre, nation, grade, time;
	int score, rank;
	String story;
}

// 2) 뉴스
class news
{
	int newsId;
	String img, tit, txt, date, company;
}

// 3) 맛집 카테고리
class FoodCategory
{
	int foodId;
	String photo, tit, subTxt;
}

// 4) 맛집 정보
class restInfo
{
	int restId;
	String tit, addr, call, category, price, parking, time, menu;
}

// 5) 음식 레시피
class foodRecipe
{
	int recipeId;
	String img, tit, profile, chef;
	int score, reply, watch;
}

// 6) 음악 차트
class songList
{
	int songId;
	int rank, upDown, like;
	String poster, lylic, tit, artist, album;
}

// 7) 온라인 마트 상품 목록
class mart
{
	int productId;
	int sale, price;
	String img, name;
}

// 8) 연극
class con
{
	int conId;
	String poster, tit, genre, date, location, actor, grade, time;
	int state;
}

public class Test_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
