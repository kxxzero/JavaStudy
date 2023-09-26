
// 대소문자 변환
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg="Hello Java";
		msg.toUpperCase(); // 대문자로 변환
		System.out.println(msg);
		
		msg=msg.toLowerCase(); // 소문자로 변환 후 처리된 내용을 반드시 다시 저장해야 함
		System.out.println(msg);
		
		System.out.println(msg.toUpperCase()); // 대문자로 출력
		System.out.println(msg.toLowerCase()); // 소문자로 출력
		System.out.println(msg); // 처리 후 다시 저장하지 않는 경우에는 원본을 유지
	}

}
