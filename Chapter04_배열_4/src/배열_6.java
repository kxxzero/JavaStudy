
// 알파벳 난수 10개
import java.util.Arrays;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr=new char[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("===== 정렬 전 =====");
		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println("===== 정렬 후 =====");
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=0; j<arr.length-1-i; j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
