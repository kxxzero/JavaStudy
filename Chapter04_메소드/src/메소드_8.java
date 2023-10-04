
public class 메소드_8 {
	
	static void increment()
	{
		int num=1; // 지역 변수 => 메소드 안에서만 사용 가능
		System.out.println(num);
		num++; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		increment(); // 1
		increment(); // 1 
		increment(); // 1 => num 값은 증가되지 않음
	}

}
