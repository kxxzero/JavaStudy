package com.sist.io;

/*
 *	데이터 저장 ===== 데이터 가공 ===== 데이터 출력
 *	변수 : 1개
 *	배열
 *	클래스
 *
 *	*** 파일
 *		=> 업로드, 다운로드, Open API
 *	오라클(RDBMS)
 *		=> JDBC = DBCP= ORM(라이브러리 : 마이바티스, JPA)
 *
 *	사용자 정의 클래스 + 라이브러리 => 1개의 프로그램 완성
 *	
 *	라이브러리
 *		= java.lang => Object, String, Math, Wrapper, *** StringBuffer
 *		= java.util => Date, StringTokenizer, List, *** Set, Map
 *		= java.io => File, FileInputStream/FileOutputStream, FileReader/FileWriter => BufferedReader, *** ObjectInputStream/ObjectOutputStram
 *		= java.net => URL / URLEncoder / Socket
 *		= java.sql => Connection / Statement / ResultSet
 *		= java.text => DecimalFormat(천 단위마다 콤마(,) 찍기) / SimpleDateFormat
 *
 *	자바 => 	2차 자바 : 브라우저(Web)
 *			3차 자바 : Spring
 *			
 *		1) IO(Input/Output) => 입출력
 *			= 메모리
 *			= 파일
 *			= 네트워크
 *			=> 클래스가 동일
 *
 *		*** 입출력 방식
 *			메모리(데이터 저장) ==(InputStream)== 자바 응용 프로그램 ==(OutputStream)== 화면 출력
 *			파일, 네트워크		일반 파일(.zip, .png)					Writer
 *							=> 1byte(바이트 스트림)					
 *							문자 저장(.txt, .dat)
 *							=> 2byte(문자 스트림)
 *							*** 영어 외 다른 언어
 *								=> 한 글자당 2byte
 *								Reader
 *			--------------------------------------------------------------------------------
 * 			*** 스트림(Stream) : 데이터 이동 통로로 읽기/쓰기 => 단방향 통신 => 2개 프로그램 동시에 수행(쓰레드) => 네트워크 / 웹에서는 이미 서버가 생성되어 있음 => 기능 추가(톰캣 = 자바 엔진 = 테스트 서버)
 *			
 *				= 바이트 스트림(1byte씩 송수신) : 업로드, 다운로드, 카페...
 *					- FileInputStream
 *					- FilterInputStream
 *						· BufferedInputStream : 메모리에 전체를 저장(속도가 빠름)
 *						· ObjectInputStream : 객체 단위 저장
 *					- FileOutputStream
 *					- FilterOutputStream
 *						· BufferedOutputStream
 *						· ObjectOutputStream
 *				= 문자 스트림(한글은 한 글자당 2byte => UTF-8) : 파일 제어(한글) => 파일 읽기/쓰기
 *					Reader			Writer
 *					FileReader		FileWriter
 *					BufferedReader	BufferedWriter
 *				*** 독립적인 클래스
 *					File : file, directory를 포함
 *				= 보조 스트림 : 읽기/쓰기 속도를 높이기 위해 미리 메모리에 저장
 *					- String / StringBuffer
 *					=> Buffered ~ 
 *					=> 전체를 메모리로 이동 => 메모리 제어
 *				*** 파일
 *					File => 정보
 *					- 파일 읽기 : FileInputStream / FileReader
 *						=> String은 저장 불가 => byte[]로 변경해서 저장
 *					- 파일 쓰기 : FileOutputStream / FileWriter
 *						=> String 자체를 저장
 *					네트워크
 *					- OutputStream (1byte)
 *					- BufferedReader(2byte로 변환 후 수신)
 *				=> 메소드 : read(), write(), close()
 *				=> IO는 반드시 예외 처리 함(체크 예외 처리)
 *
 *			*** File(file 정보 + directory 정보) => 일반 클래스
 *				= 파일 정보 읽기 => 생성자 이용
 *				= file
 *					new File("경로명\\파일명")
 *				= directory
 *					new File("경로명")
 *				= 주요 메소드
 *					파일 특성
 *						- 읽기 전용 : boolean canRead()
 *						- 쓰기 전용 : boolean canWrite()
 *						- 숨김 파일 : boolean isHidden()
 *					파일 정보
 *						- 파일명 : ★★★ String getName()
 *						- 경로명 + 파일명 : ★★★ String getPath()
 *						- 경로명 : String getParent()
 *						- 파일 크기 : ★★★long length()
 *						- 수정일 : long lastModified()
 *					파일 종류
 *						- 파일 : boolean isFile()
 *						- 폴더 : boolean isDirectory()
 *					파일, 디렉토리 만들기
 *						- createNewFile() : 파일 만들 경우
 *						- ★★★ mkdir() 
 *					삭제
 *						- ★★★ void delete() : 폴더 삭제 시 파일이 존재할 경우 파일 삭제 불가
 *							rm 파일명, rm -rf
 *							=> AWS(리눅스=명령어)
 *					존재 여부 확인
 *						- ★★★ exists()
 *					폴더에 있는 모든 파일 읽기
 *						- ★★★ File[] listFiles()
 *					파일 크기
 *						Byte => KB => MB 
 *								파일크기/1024 => (파일크기/1024)/1024		
 */

// 폴더 전체 확인
import java.io.*;
public class MainClass_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{	// directory 확인
			File dir=new File("C:\\javaDev"); // 파일명을 지정하지 않으면 디렉토리(폴더)를 의미함
			// window => \, mac, linux => /
			// 역슬래시(\)는 반드시 \\(2개) 입력
			// 가급적이면 절대 경로를 사용할 것을 권장
			// .(현재 폴더), ..(상위 폴더) => cd => change directory
			
			// 폴더 안에 있는 폴더/파일 읽기
			File[] list=dir.listFiles();
			
			// 출력
			for(File f:list)
			{
//				System.out.println(f.getName());
				if(f.isFile())
				{
					System.out.println(f.getName()+"(file)");
				}
				else if(f.isDirectory())
				{
					System.out.println(f.getName()+"(directory)");
				}
			}
		}catch(Exception ex) {}
	}

}
