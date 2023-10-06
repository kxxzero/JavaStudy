
// 숫자 야구 게임
import java.util.*;
public class 메소드_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 컴퓨터 임의로 난수 발생
		int[] com=new int[3];
		for(int i=0; i<com.length; i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			
			for(int j=0; j<i; j++) // j는 i가 발생한 만큼
			{
				if(com[i]==com[j]) // 숫자가 같은 경우
				{
					i--; // 난수 다시 발생
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com)); // 확인용
		
		
		// 사용자 입력
		int[] user=new int[3];
		while(true) // 무한 반복
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("세자리 정수 입력:");
			int input=scan.nextInt();
			
			// 예외 처리
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue; // 해당 부분을 제외하고 다시 처음으로 이동 => for문(증가식으로 이동 => 제외), while문(조건식으로 이동 => 처음으로 이동)
			}
			
			// 배열에 숫자 저장
			user[0]=input/100; // 100의 자리
			user[1]=(input%100)/10; // 10의 자리
			user[2]=input%10; // 1의 자리
			
			// 예외 처리
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 업습니다.");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) // 0이 숫자 맨 앞에 붙을 경우 8진법으로 인식(예: 078)
			{
				System.out.println("0은 사용하실 수 없습니다.");
				continue;
			}
			
			// hint 제공
			int s=0, b=0;
			for(int i=0; i<3; i++) // com
			{
				for(int j=0; j<3; j++) // user
				{
					if(com[i]==user[j]) // 같은 수가 있는지 확인
					{
						if(i==j)
						{
							s++; // 같은 자리 수
						}
						else
						{
							b++; // 다른 자리 수
						}
					}
				}
			}
			System.out.printf("입력한 값 : %d, 결과 : %dS-%dB\n", input, s, b);
			
			// 종료 여부 확인
			if(s==3)
			{
				System.out.println("Game Over!");
				break;
			}
		}

	}

}
