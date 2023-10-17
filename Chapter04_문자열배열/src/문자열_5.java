
/*
 * 	Split => String[]
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String actor="강동원,허준호,이솜,이동휘,김종수,박소이"; // ','를 구분하여 배열로 저장함 => 공백 없이 입력하기
//		String[] movie=actor.split(",");
//		System.out.println(movie[0]);
		
//		String actor="강동원|허준호|이솜|이동휘|김종수|박소이";
//		String[] movie=actor.split("\\|"); // 정규식 'OR' 그대로 출력하기 위해 역슬래쉬(\) 2개 입력
//		System.out.println(movie[0]);
		
		String name=" Hello Java "; // 공백 발생
		System.out.println(name);
		System.out.println(name.trim()); // 좌우 공백 제거 => 사용자 입력 요구 시 주로 사용
		
		// replace() : 원하는 문자를 변경
		String s="Hello Java";
		System.out.println(s.replace('a', 'b'));
		System.out.println(s.replace("Java", "Oracle"));
		System.out.println(s); // 출력만 하고 대입하지 않으면 원본 데이터 그대로 유지
		System.out.println(s=s.replace("Java", "Oracle")); // 변수 s에 변한 데이터값 대입 => print 안에서 대입 가능
		System.out.println(s);
		
		
		// 문자열 결합
		String msg="귀신을 믿지 않는 가짜 퇴마사! 그의 세계를 흔드는 진짜 사건이 나타났다!";
		if(msg.length()>20) { // 20자 초과 시 말 줄임 표시
			msg=msg.substring(0, 20)+"...";
//			msg=msg.substring(0, 20).concat("...");
		}
		System.out.println(msg);
	}

}
