
// 1~10 => 짝수만 출력
// 반복문 안에 조건문 : for - if / while - if

public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("===== for =====");
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println("\n===== while =====");
		
		int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		
		System.out.println("\n===== while =====");
		
		i=1;
		do {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=10);
		
//		int i=1;
//		do{
//			System.out.print(i+ "");
//			i++;
//		}while(i<=10);
		
		
	}

}
