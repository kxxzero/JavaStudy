/*
 *  직렬연산자 : &&(AND) - 기간이나 범위 안에 포함
 *  병렬연산자 : ||(OR) - 기간이나 범위가 아닌 경우
 *  
 *  	(조건1) && (조건2)	(조건1) || (조건2)
 *  	
 *	   	 경우의 수		  &&		   ||
 *	    true true	 =>  true	=>	  true
 *	    true false   =>  false  =>    true
 *	    false false  =>  false  =>    true
 *	    false false  =>  false  =>    false
 *	   
 *  	&&, || 는 효율적인 연산(최적화 연산)을 수행한다
 *  	&& => 앞의 조건이 false면 뒤의 조건은 수행하지 않는다 = 하나의 조건이라도 false일 경우 결과는 false
 *  	|| => 앞의 조건이 true면 뒤의 조건은 수행하지 않는다 = 하나의 조건이라도 true일 경우 결과는 true
 */			

public class 자바논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=9;
//		
//		boolean bCheck=a<b && ++b==a; // AND 연산자
//		System.out.println(bCheck);
//		System.out.println("b="+b); // 앞의 조건이 false이기 때문에 뒤의 조건은 실행하지 않아 b=9
//		
//		bCheck=a<b || ++b==a; // OR 연산자
//		System.out.println(bCheck);
//		System.out.println("b="+b); // 앞의 조건이 false이기 때문에 뒤의 조건을 확인하기 위해 실행함
		
		int a=10;
		int b=20;
		
		boolean bCheck=(a%2==0) && (b%2!=0); // 앞의 조건 : 짝수, 뒤의 조건 : 홀수 (b%2!=0) = (b%2!=1)
		System.out.println(bCheck);
		
		bCheck=(a%2==0) || (b%2==0);
		System.out.println(bCheck);
		
	}

}
