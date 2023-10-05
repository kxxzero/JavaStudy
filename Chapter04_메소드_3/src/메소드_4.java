
// 로또 6개의 정수(1 ~ 45) 중복없이 추출 => 출력
public class 메소드_4 {
	
	static int[] getRand() 
	{
		int[] lotto=new int[6];
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++)
			{
				if(lotto[i]==lotto[j]) // 같은 숫자일 때
				{
					i--; // 난수 다시 발생
					break;
				}
			}
		}
		return lotto;
	}
	
	
	// 재사용하는 방법
	static int[] getRand(int count) 
	{
		int[] lotto=new int[count];
		for(int i=0; i<lotto.length; i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++)
			{
				if(lotto[i]==lotto[j]) // 같은 숫자일 때
				{
					i--; // 난수 다시 발생
					break;
				}
			}
		}
		return lotto;
	}
	

	static void print(int[] lotto)
	{
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=getRand();
		print(lotto);
		
	}

}
