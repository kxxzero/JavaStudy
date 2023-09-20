/*
 *	while => 1차
 *		응용 : 파일 읽기, 데이터 베이스(오라클 연동)
 *		일반 프로그램의 반복문(for) 
 *		형식 : ① 초기값;
 *			while(② 조건식){ // 무한 루프(while(true))
 *				③ 반복 수행 문장;
 *				④ 증가식; => ②번으로 이동(true : 수행 문장 실행 / false : 종료)
 *			}
 *		응용
 *			for()
 *			{
 *				while()
 *				{
 *					if()
 *					{
 *						for()
 *						{
 *						
 *						}
 *					}
 *				}
 *			}
 * 	
 * 
 */

// 1~100 사이의 짝수의 합, 홀수의 합 구해서 출력
public class 자바제어문_반복문1 {
	public static void main(String[] args) {
		int even=0, odd=0;
		int i=1; // 초기값
		while(i<=100) { // 조건식
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
			i++; // 증감식
		}
		System.out.println("1~100 사이의 짝수의 합 : " + even);
		System.out.println("1~100 사이의 홀수의 합 : " + odd);
	}
}
