
// 	substring() => 문자를 자른다.
/*
 * 	"Hello Java"
 * 	 0123456789
 * 
 * 	substring(6)
 * 	substring(0, 5) // 인덱스 0~4(5번 전까지) 문자열 자르기 => 하나 더 크게 자르기
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		
		String s1=s.substring(0,4);
		System.out.println(s);
		System.out.println(s1);
		
		s1=s.substring(0,5);
		System.out.println(s1);
		
		s1=s.substring(6);
		System.out.println(s1);
		
		System.out.println("====================");
		
		String addr="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
		String addr1=addr.substring(0, 20);
		System.out.println(addr1);
		
		addr1=addr.substring(0, addr.indexOf("지번"));
		System.out.println(addr1);
		
		String addr2=addr.substring(addr.indexOf("지번")+3); // '지번 ' = 3글자 삭제 후 그 다음부터 출력 => 서울시 ~ 출력
		System.out.println(addr2);
		
		String addr3=addr.substring(addr.indexOf("서울시 강남구")+8, addr.indexOf("655"));
		System.out.println(addr3);
		
		int a=addr.lastIndexOf(" ");
		addr3=addr.substring(a-3, a);
		System.out.println(addr3);
		
		String ext="Hello.Java.java";
		String str=ext.substring(ext.lastIndexOf(".")+1); // 제외하지 않음
		System.out.println(str);
		
	}

}
