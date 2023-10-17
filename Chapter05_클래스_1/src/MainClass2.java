
/*
 * 	- 클래스는 여러 개의 데이터를 1개로 묶어서 메모리에 저장 후 사용 가능
 * 		=> 클래스 설계 : new를 이용해서 메모리에 저장
 * 	- 주소에 대한 개념이 거의 없음
 * 	- 배열, 클래스는 주소 개념이 있음
 * 	* 상속 => super/this
 * 	- 1개, 1명에 대한 정보를 설계
 * 		사원 10명 => 1개만 제작 => 메모리 공간을 10개(new 10개)
 * 	=> 사용자 정의 데이터형 : Board
 * 	=> 메소드 묶음(액션 클래스) : BoardSystem
 * 	=> 데이터형+메소드 혼합형: 거의 없음
 * 	=> 재사용 가능, 데이터 보호, 수정, 추가 => 객체 지향
 * 
 * 	** 클래스는 단순화(추상화 : 공통적으로 가지고 있는 특성) 작업 후 시뮬레이션 하는 것
 * 		예) 시계 => 시침, 분침, 초침
 * 		   	컴퓨터 => 모니터, 본체, 키보드, 마우스
 * 		   	사원 => 사번, 이름, 부서명, 직위, 근무지, 입사일, 연봉
 * 	*** 클래스는 일반(기본형) 데이터형과 동일하게 사용
 * 		형변환 => 상속(화살표 방향 주의: 상속을 통해 가져오는 것이기 때문에 상속 내리는 것이 더 큼, 화살표 방향은 큰 쪽을 향함), 포함
 * 
 */

class Card
{
	String type;
	int number;
//	int width, height;
	static int width, height; // static : 공유 변수 => Method Area에 별도로 저장되어 생성한 모든 객체가 제어할 수 있음
	
	Card()
	{
		System.out.println("메모리 생성 완료");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("메모리 해제");
	}
	
}
// 카드 52장 => new = 메모리 공간이 다름(다른 값을 저장할 수 있음)
public class MainClass2 {
	public static void main(String[] args) {
		// 카드 1장 생성
		Card card1=new Card();
		card1.type="♥";
		card1.number=1;
		card1.width=150;
		card1.height=200;
		
		Card card2=new Card();
		card2.type="♠";
		card2.number=2;
		card2.width=150;
		card2.height=200;
		
		System.out.println("card1.type="+card1.type);
		System.out.println("card1.number="+card1.number);
		System.out.println("card1.width="+card1.width);
		System.out.println("card1.heigth="+card1.height);
		System.out.println("====================");
		System.out.println("card2.type="+card2.type);
		System.out.println("card2.number="+card2.number);
		System.out.println("card2.width="+card2.width);
		System.out.println("card2.heigth="+card2.height);
		
		card1.width=250; // 같은 주소일 때만 제어 가능
		card1.height=300;
		
		System.out.println("card1.type="+card1.type);
		System.out.println("card1.number="+card1.number);
		System.out.println("card1.width="+card1.width);
		System.out.println("card1.heigth="+card1.height);
		System.out.println("====================");
		System.out.println("card2.type="+card2.type);
		System.out.println("card2.number="+card2.number);
		System.out.println("card2.width="+card2.width);
		System.out.println("card2.heigth="+card2.height);
		
//		card1=null; // 메모리 직접 해제
//		card2=null;
//		
//		System.gc(); // 가비지 컬렉션
		
		
	}
}
