
import java.util.*;
public class 메소드_매개변수전송법3 {

	static void change2(String s) // String은 기본형 취급
	{
		s="Hello Method";
	}
	static void change(int[] arr)
	{
		// temp=arr
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 얕은 복사 : 주소가 같으면 같은 값을 제어한다.
		int[] temp=new int[5];
		System.out.println("적용 전:");
		System.out.println(Arrays.toString(temp));
		
		System.out.println("적용 후:");
		System.out.println(Arrays.toString(temp));
		
		change(temp);
		System.out.println(Arrays.toString(temp));
		
		String ss="";
		change2(ss);
		System.out.println("ss="+ss);
		
		int[] a={1,2,3};
		int[] b=a;
		int[] c=a;
		int[] d=a; // a, b, c, d 모두 서로를 제어한다.
		d[0]=10;
		System.out.println("a[0]="+a[0]);
		System.out.println("b[0]="+b[0]);
		System.out.println("c[0]="+c[0]);
		
		
	}

}
