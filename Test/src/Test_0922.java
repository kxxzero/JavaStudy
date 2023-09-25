public class Test_0922 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) 양의 정수 10개 입력 받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
		int [] num1 = new int[10];

		for(int i=1; i<num1.length; i++){
			num1[i] = (int)((Math.random()*10)+1);
			if(i%3==0){
				System.out.println("3의 배수:");
			}
		}
		

		
		// 2) 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
		int [] num2 = new int[10];
		num2 [10]=(int)((Math.random()*10)+1);
		
		System.out.println(num2 + " ");
		
		
		
		// 3) 5개 정수를 입력받은 후 차례로 출력하는 프로그램 
		int [] num3 = new int[5];
		num3 [5]=(int)((Math.random()*5)+1);
		
		System.out.println(num3 +" ");
		
		
		
		// 4) 문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
		char [] ch = new char[10];
		ch [10]=(char)((Math.random()*10)+65);
		
		System.out.println(ch +" ");
		
		
		
		// 5) 정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램
		int [] num4 = new int[10];
		num4 [10]=(int)((Math.random()*10)+1);
		
		System.out.println(num4 +" ");
		
		
		
		// 6) 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
		
	}

}
