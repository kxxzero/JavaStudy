
// Up & Down 게임

import java.util.*;
public class 메소드_문제_6 {

	static int comRand()
	{
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(1~100):");
		int user=scan.nextInt();
		return user;
	}
	
	static String hint(int com, int user)
	{
		String res="";
		if(com>user)
		{
			res="Up!";
		}
		else if(com<user)
		{
			res="Down!";
		}
		else
		{
			res="Game Over!";
//			break;
//			System.exit(0);
		}
		
		return res;
	}
	
	static void process()
	{
		int com=comRand();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int user=userInput();
			String h=hint(com, user);
			System.out.println(h);
			if(h.contains("Game"))
			{
//				break;
				System.out.print("게임을 다시 할까요?(y|n):");
				char c=scan.next().charAt(0);
				if(c=='y'||c=='Y')
				{
					System.out.println("새로운 게임을 시작합니다.");
					process();
				}
				else
				{
					System.out.println("Game Over");
					System.exit(0);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
//		// 난수 발생
//		int com=(int)(Math.random()*100)+1;
//		
//		while(true)
//		{
//			// 입력 값
//			Scanner scan=new Scanner(System.in);
//			System.out.println("정수 입력(1~100):");
//			int user=scan.nextInt();
//			
//			// 힌트
//			if(com>user)
//			{
//				System.out.println("Up!");
//			}
//			else if(com<user)
//			{
//				System.out.println("Down");
//			}
//			else
//			{
//				System.out.println("Gama Over!");
//				break;
//			}
//		}
	}

}
