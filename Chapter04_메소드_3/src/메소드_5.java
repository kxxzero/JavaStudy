
// 5개 정수를 받아서 max, min
import java.util.Arrays;
public class 메소드_5 {
	
	// 입력
	static int[] userInput()
	{
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	// 최댓값
	static int max(int[] arr)
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i>m)
			{
				m=i;
			}
		}
		return m;
	}
	
	// 최솟값
	static int min(int[] arr)
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i<m)
			{
				m=i;
			}
		}
		return m;
	}

	
	// 출력
	static void print(int max, int min)
	{
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
	}
	
	
	// 조합
	static void process()
	{
		int[] arr=userInput();
		System.out.println(Arrays.toString(arr));
		int max=max(arr);
		int min=min(arr);
		print(max, min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자로부터 입력값을 받는다 / 초기화 => 한 단락
//		System.out.println(Arrays.toString(arr));
		
		// 최댓값, 최솟값
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(int i:arr)
//		{
//			if(i>max)
//			{
//				max=i;
//			}
//			if(i<min)
//			{
//				min=i;
//			}
//		}
		
		process();
		
	}

}
