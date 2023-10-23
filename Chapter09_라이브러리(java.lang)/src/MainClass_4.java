
/*
 * 	finalize() : 소멸자 함수 => 객체가 메모리 해제 시 자동 호출
 * 	소멸자
 * 	A(), ~A()
 * 	클래스는 	① 객체 생성(메모리 저장)
 * 				A a=new A()
 * 			② 객체 기능 활용
 * 				a.메소드명()
 * 			③ 메모리 해제 a=null => 가비지 컬렉션(GC)
 * 				finalize() => 바로 회수가 안 됨 => 메모리가 크기 때문 => 메모리 회수 시 자동 호출
 */	

class A
{
	public A()
	{
		System.out.println("A객체 생성:"+this);
	}
	public void action()
	{
		System.out.println("객체 활용...");
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제...");
	}
}

public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		a.action();
		a=null; // GC
		System.gc(); // 직접 GC 호출
		
	}

}
