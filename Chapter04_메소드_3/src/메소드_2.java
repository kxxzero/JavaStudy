
// 정수 입력 => 0 ~ 32767(16bit) => 2진법 출력

import java.util.*;
public class 메소드_2 {

	// 입력
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(0~3767):");
		int num=scan.nextInt();
		
		return num;
	}

	// 2진법
	static int[] change(int num)
	{
		int[] binary=new int[16];
		int index=15; // 뒤에서부터 출력
		while(true)
		{
			binary[index]=num%2;
			num=num/2; 
			if(num==0) // num=1 1/2=0;
			{
				break;
			}
			index--;
		}
		return binary;
	}

	// 출력
	static void print(int[] binary)
	{
		for(int i=0; i<binary.length; i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}
	
	
	// 조립
	static void process()
	{
		// 입력값 받기
		int num=userInput();
		
		// 2진법
		int[] arr=change(num);
		
		// 출력
		print(arr);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
	}

}
