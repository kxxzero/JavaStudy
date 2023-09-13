// % => 배수 => 화폐매수 구하기

public class 자바산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("====================");
		
		int c = 369;
		// 백단위 : 3, 십단위 : 6, 단단위 : 9
		int num100 = c/100; // 3
		int num10 = (c%100)/10; // 69/10 => 6
		int num1 = c%10; // 369/10 => 9
		
		System.out.println("백단위 : " + num100 + "\n십단위 : " + num10 + "\n단단위 : " + num1);
	}

}
