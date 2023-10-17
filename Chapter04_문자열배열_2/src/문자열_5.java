/*
 * 	라이브러리
 * 	 	- java.lang : Object, String, StringBuffer, Math, Wrapper
 * 		- java.util : List, Set, Map
 * 		- java.io
 * 		- java.net
 * 		- java.text
 */

import java.io.*; // 파일 및 메모리 입출력 관련 메소드
import java.util.*;
public class 문자열_5 {

	static String movie;
	static
	{
		try
		{
			// 파일 읽기
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
//			String data="";
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1) // -1 : EOF(파일 끝)
			{
//				data+=(char)i; // i : 정수
				data.append((char)i);
			}
//			System.out.println(data);
//			System.out.println(data.toString());
			
			movie=data.toString();
			
		}catch(Exception ex) {}
	}
	
	public static void main(String[] args) throws Exception { // throws Exception : 예외 처리
		// TODO Auto-generated method stub
//		System.out.println(movie);		
		String[] movieData=movie.split("\n");
		
		System.out.println(movieData[0]);		
//		System.out.println("영화 개수:"+movieData.length);

		System.out.println("========== 영화 목록 ==========");
		
		for(String movie:movieData) {
			String[] detail=movie.split("\\|"); // | : OR
			System.out.println("순위 : "+detail[0]);
			System.out.println("영화명 : "+detail[1]);
			System.out.println("장르: "+detail[2]);
			System.out.println("출연: "+detail[4]);
			System.out.println("개봉일: "+detail[5]);
			System.out.println("등급: "+detail[6]);
			System.out.println("감독: "+detail[7]);
			System.out.println("----------------");
		}
		
		// 송강호가 출연한 영화를 출력하시오.
		Scanner scan=new Scanner(System.in);
		System.out.println("이름 입력:");
		String name=scan.next();
		
		for(String movie:movieData) {
			String[] detail=movie.split("\\|"); // | : OR
			if(detail[4].contains(name)) {
				System.out.println("순위 : "+detail[0]);
				System.out.println("영화명 : "+detail[1]);
				System.out.println("장르: "+detail[2]);
				System.out.println("출연: "+detail[4]);
				System.out.println("개봉일: "+detail[5]);
				System.out.println("등급: "+detail[6]);
				System.out.println("감독: "+detail[7]);
				System.out.println("----------------");
			}
		}
		
		// 1990년에 개봉한 영화
		for(String movie:movieData) {
			String[] detail=movie.split("\\|"); // | : OR
			if(detail[5].contains("1990")) {
				System.out.println("순위 : "+detail[0]);
				System.out.println("영화명 : "+detail[1]);
				System.out.println("장르: "+detail[2]);
				System.out.println("출연: "+detail[4]);
				System.out.println("개봉일: "+detail[5]);
				System.out.println("등급: "+detail[6]);
				System.out.println("감독: "+detail[7]);
				System.out.println("----------------");
			}
		}
		
		// 12세 이상 관람 영화
		System.out.println("등급 입력:");
		int grade=scan.nextInt();
		for(String movie:movieData) {
			String[] detail=movie.split("\\|"); // | : OR
			if(detail[6].startsWith(String.valueOf(grade))) {
				System.out.println("순위 : "+detail[0]);
				System.out.println("영화명 : "+detail[1]);
				System.out.println("장르: "+detail[2]);
				System.out.println("출연: "+detail[4]);
				System.out.println("개봉일: "+detail[5]);
				System.out.println("등급: "+detail[6]);
				System.out.println("감독: "+detail[7]);
				System.out.println("----------------");
			}
		}
		
	}

}
