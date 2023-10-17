// 메소드 => 어떤 값을 받을지, 결과값을 넘겨줄지 결정

// 로그인 처리
// 사용자로부터 입력 받는 값 : id pwd
// 로그인 여부 확인 : void(해당 메소드 처리), 결과값을 받을지 결정 => 결과값을 받아서 처리 : boolean(true, false), int(0,1), String
import java.util.Scanner;
public class 메소드_7 {

	static String userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(msg+" 입력:");
		String input=scan.next();
		return input; // return은 1개의 값만 넘겨줄 수 있음
	}
	
	static boolean isLogin(String id, String pwd)
	{
		final String ID="admin"; // 상수
		final String PWD="1234";
		// 파일이나 오라클에 저장되어 있는 데이터를 불러와서 일치하는지 확인
		boolean bCheck=false;
		
		if(id.equals(ID) && pwd.equals(PWD)) // 정확히 일치하는 경우
		{
			bCheck=true;
//			return true; // else문을 생략할 경우 if문 안에 return 값 입력 가능
		}
//		else
//		{
//			bCheck=false; // bCheck의 기본값이 false이기 때문에 else문은 생략 가능
//		}
		
		return bCheck;
	}
	
	static void process()
	{
		String id=userInput("아이디");
		String pwd=userInput("비밀번호");
		
		boolean bCheck=isLogin(id, pwd); // 위 메소드에서 선언한 bCheck와는 다른 것임
		
		// boolean => bXxxx
		// isXxxx() => 리턴형 boolean
		
		if(bCheck==true)
		{
			System.out.println("메인 화면으로 이동... (response.sendRedirect('main.jsp')");
		}
		else
		{
			System.out.println("아이디나 비밀번호가 틀립니다. (history.back())");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); // 미리 제작해 놓은 메소드를 호출하여 바로 사용 가능
		
	}

}
