
// 1 ~ 10 중복 없는 난수 발생 => 간단한 프로그램
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) { // 10개
			 arr[i]=(int)(Math.random()*10)+1; // 1 ~ 10
			 for(int j=0; j<i; j++) {
				 if(arr[i]==arr[j]) { // 중복이라면
					 i--; // 하나씩 감소 => index를 이용해서 다시 난수 발생
					 break;
				 }
			 }
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
