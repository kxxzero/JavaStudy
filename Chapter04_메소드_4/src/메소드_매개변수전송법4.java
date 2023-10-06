
public class 메소드_매개변수전송법4 {

	static void swap(int a, int b) // 새로운 메모리 생성
	{
		System.out.println("변경 전 : swap에서 a="+a+", b="+b); // a=10, b=20
		int temp=a;
		a=b;
		b=temp;
		System.out.println("변경 후 : swap에서 a="+a+", b="+b); // a=20, b=10
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20; // 기본형 => 값만 복사 => Call By Value
		System.out.println("변경 전 : main에서 a="+a+", b="+b); // a=10, b=20
		swap(a,b);
		System.out.println("변경 후 : main에서 a="+a+", b="+b); // a=10, b=20
	}

}
