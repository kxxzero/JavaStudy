
import java.util.Scanner;
public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] bin=new int[16];
		int index=15;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num=scan.nextInt();
		System.out.println(Integer.toBinaryString(num));
	}

}
