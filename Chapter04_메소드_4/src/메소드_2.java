
// 매개변수(O), 리턴형(X) => 아이디 찾기

import java.util.Scanner;
public class 메소드_2 {

	// 사용자 입력값
	static String idInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("ID 입력:");
//		String id=scan.next(); // return에서 입력 가능
		return scan.next();
	}
	
	// 아이디 중복 체크
	static boolean idCheck(String id)
	{
		boolean bCheck=false;
		String[] ids= {"hong","admin","lee","park","shim"};
		for(String i:ids)
		{
			if(id.equals(i))
			{
				bCheck=true;
				break;
			}
		}
		return bCheck;
	}
	
	// 모든 메소드 조립
	static void process()
	{
		String id=idInput(); // 사용자 입력 값
		boolean bCheck=idCheck(id);
		
		if(bCheck)
		{
			System.out.println(id+"는 이미 사용중인 아이디입니다.");
		}
		else
		{
			System.out.println(id+"는 사용 가능한 아이디입니다.");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
