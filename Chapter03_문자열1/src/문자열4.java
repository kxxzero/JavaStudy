
//charAt() : 문자열의 첫 문자를 가져오는 메소드 
// 대문자 / 소문자 변경
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		// 대문자 출력
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			System.out.print((char)(c-32));
		}
		
		System.out.println("\n" + s.toUpperCase());
		
		// A: 65 / a: 97
		s="ABCDEF";
		
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			System.out.print((char)(c+32));
		}
		System.out.println("\n" + s.toLowerCase());
	}

}
