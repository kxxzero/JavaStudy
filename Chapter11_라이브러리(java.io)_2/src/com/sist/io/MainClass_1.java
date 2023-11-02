package com.sist.io;

/*
 * 	IO : 입출력
 * 		= 메모리 입출력
 * 		= 파일 입출력
 * 		= 네트워크 입출력
 * 	--------------------
 * 		1. 클래스의 종류
 * 			1) 송수신 => 1byte => 바이트 스트림
 * 			2) 송수신 => 2byte => 문자 스트림
 * 			*** 스트림 :  데이터를 이동하는 통로
 * 			메모리, 파일, 네트워크 ==InputStream(1byte)==> 자바 응용 프로그램 ==OutStream(2byte)==> 화면 출력
 * 								Reader(2byte)							Writer
 * 			3) 클래스
 * 				= 1byte(바이트 스트림) => 파일 전송, 업로드, 다운로드 => byte 단위
 * 				= InputStream(읽기)
 * 					- ★★★FileInputStream
 * 					- FilterInputStream
 * 						· ★★★BufferedInputStream
 * 				= OutPutStream(쓰기)
 * 					- ★★★FileOutputStream
 * 					- FilterOutputStream
 * 						· ★★★BufferedOutputStream
 * 					*** Buffer : 임시 기억 장소 => 속도 최적화
 * 						=> 파일이나 웹 서버에 있는 모든 데이터를 메모리에 올려놓고 시작
 * 				= 문자 스트림 : 한글(2byte) => 파일 제어(파일 읽기/쓰기)
 * 					- Reader
 * 						· FileReader
 * 							BufferedReader
 * 					- Writer
 * 						· FileWriter
 * 							BufferedWriter
 * 				= 객체 단위 저장
 * 					- ★★★ObjectInputStream
 * 					- ★★★ObjectOutputStream
 * 					- 직렬화 / 역직렬화
 * 
 * 						객체 저장
 * 						class A
 * 						{
 * 							int age;
 * 							String name;
 * 							int kor;
 * 						}
 * 						A a=new A(); // 메모리 공간을 생성해서 저장
 * 						--a--
 * 						
 * 						----- ↘ ------100-------
 * 									age = 0; // a.age => '.' 연산자(주소 접근 연산자)
 * 									name = null // a.name
 * 									kor = 0 // a.kor
 * 								----------------
 * 
 * 						메모리 저장
 * 						* 직렬화
 * 						------------------------------
 * 							age	|	name	|	kor
 * 						------------------------------
 * 					
 * 						* 역직렬화 
 *						------100-------
 * 						age = 0; // a.age
 * 						name = null // a.name
 * 						kor = 0 // a.kor
 * 						----------------
 * 				= 파일 관련
 * 					- .txt
 * 					- .xml(Spring, MyBtis => xml 대체(어노테이션) - Spring-Boot(자바만 사용)), .json(JavaScript - 자바의 데이터형과 연동이 안 됨), .csv(데이터 분석 - 공공포털) => 제어(읽기/쓰기) 클래스가 이미 라이브러리 
 * 					- .properties(웹)
 * 				= 파일 정보
 * 					- File : 파일, 디렉토리까지 제어 => 일반 클래스
 * 						사용법)
 * 							· 파일 정보 읽기 : File file=new File("c:\\javaDev\\a.txt")
 * 							· 디렉토리 정보 읽기 : File dir=new File("c:L\\javaDev")
 * 						주요 메소드)
 * 							· long length() : 파일 크기 => byte 단위
 * 							· String getName() : 파일, 디렉토리 이름만 읽는 경우
 * 							· String getPath() : 파일, 디렉토리 이름과 경로를 읽는 경우
 * 							· String getParent() : 파일, 디렉토리 경로만 읽는 경우
 * 							· boolean isFile() : boolean idDirectory() 
 * 							· boolean exists() : 존재 여부 확인
 * 							· File[] listFiles() : 폴더 안에 있는 모든 파일 읽기
 * 							· delete() : 파일 삭제
 * 							· createNewFile() : 파일 생성
 * 							· mkdir() : 폴더 생성
 * 						------------------------------------------------------------
 * 					FileInputStream / FileReader
 * 						=> read(), read(byte[], offset, length), close()
 * 					FileOutputStream / FileWriter
 * 						=> write(), write(String..), close()
 * 									
 */

// Buffered(속도가 빠름) => 파일 읽기
/*
 * 	패키지 설정 => 예외 처리(체크 예외) => 컴파일러가 예외 처리를 했는지 체크
 * 	java.net, java.sql => 
 */
import java.io.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try
//		{
//			String data="";
//			FileReader fr=new FileReader("c:\\javaDev\\genie.txt");
//			int i=0;
//			while((i=fr.read())!=-1) // -1 : EOF
//			{
//				data+=(char)i;
//			}
//			fr.close();
//			System.out.println(data);
//		}catch(Exception ex) {}
		
		
		try
		{
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt");
			BufferedReader in=new BufferedReader(new InputStreamReader(fis));
			// 필터 스트림 => 1byte씩 읽기 => 2byte로 변완
			String data="";
			while(true)
			{
				String s=in.readLine();
				if(s==null) // 더이상 읽어올 데이터가 없는 경우
				{
					break;
				}
				data+=s;
			}
			in.close();
			System.out.println(data);
		}catch(Exception ex) {}
	}

}
