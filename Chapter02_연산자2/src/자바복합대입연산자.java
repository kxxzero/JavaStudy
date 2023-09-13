/*
 *	41page - 복합 대입 연산자 : 증감(원하는 개수만큼)
 *
 *		· op=
 *		· += ★
 *		· -= ★
 *		· *=
 *		· /=
 *		· &=
 *		· ^=
 *		· |=
 *		· >>=
 *		· <<=
 *
 *		예)
 *		한 개 증가
 *		 	int a = 10;
 *			a++, ++a, a=a+1 => a+=1
 *
 *		두 개 증가
 *			a++;
 *			a++;
 * 			a=a+2 => a+=2
 * 
 * 		한 개 감소
 * 			a--, --a
 * 			a=a-1, a-=1 => 주로 문자열, 숫자 누적 시에 주로 사용
 */
public class 자바복합대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		a+=100; // a를 100 증가. 이미 선언된 변수 값을 수정하는 것이기 때문에 int(데이터형)을 다시 작성해서 재선언할 필요 없음. 다만 블록({})을 벗어날 경우에는 재선언해야 함
		System.out.println(a);

		a-=50; // a를 50 감소
		System.out.println(a);
		
		/*	변수 수정
		*	int a=10;
		*	a=50;
		*	a=20;
		*/
		
	}

}
