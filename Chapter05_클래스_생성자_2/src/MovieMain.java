
/*
 *	
 */

import java.util.*;
import java.io.*;

// 사용자 정의 데이터형
class Movie
{
	String rank;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}

class MovieSystem
{
	static Movie[] movies=new Movie[1938];
	
	// 1. 초기화 => 생성자
	MovieSystem()
	{
		try // 예외처리
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer data=new StringBuffer();
//			String data="";
			int i=0; // char => fr.read() => 1글자씩 정수
			while((i=fr.read())!=-1) // -1 EOF
			{
//				data+=(char)i;
				data.append((char)i);
			}
			fr.close();
			String[] datas=data.toString().split("\n");
			i=0;
			for(String ss:datas)
			{
				String[] s=ss.split("\\|");
				movies[i]=new Movie();
				movies[i].rank=(s[0]);
				movies[i].title=(s[1]);
				movies[i].genre=(s[2]);
				movies[i].poster=(s[3]);
				movies[i].actor=(s[4]);
				movies[i].regdate=(s[5]);
				movies[i].grade=(s[6]);
				movies[i].director=(s[7]);
				i++;
			}
//			System.out.print(data);
		}catch(Exception ex) {}
	}
	// ---------------
	
	// 2. 목록 출력
	void list()
	{
		for(Movie m:movies)
		{
			System.out.println(m.rank+"."+m.title);
		}
	}
	// ---------------
	
	// 3. 상세보기
	void detail(int mno)
	{
		// 배열 => 인덱스 => 구분자는 필요 없음 => rank
		Movie m=movies[mno-1]; // 인덱스 번호 0번부터 시작
		System.out.println("===== 영화 상세 내용 =====");
		System.out.println("영화명:"+m.title);
		System.out.println("감독:"+m.director);
		System.out.println("출연:"+m.actor);
		System.out.println("장르:"+m.genre);
		System.out.println("등급:"+m.grade);
		System.out.println("개봉일:"+m.regdate);
		System.out.println("영화순위:"+m.rank);
	}
	// ---------------
	
	// 4. 영화명으로 찾기
	void movieNameFind(String title)
	{
		System.out.println("===== 검색 결과 =====");
		for(Movie m:movies)
		{
			if(m.title.contains(title))
			{
				System.out.println(m.title);
			}
		}
		System.out.println("===================");
	}
	// ---------------
	
	// 5. 출연으로 찾기
	void movieActorFind(String actor)
	{
		for(Movie m:movies)
		{
			if(m.actor.contains(actor))
			{
				System.out.println(m.title+"("+m.actor+")");
			}
		}
	}
	
	// 6. 장르 찾기
	
	void movieGenreFind(String genre)
	{
		for(Movie m:movies)
		{
			if(m.genre.contains(genre))
			{
				System.out.println(m.title+"("+m.genre+")");
			}
		}
	}
}

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JSP
		MovieSystem ms=new MovieSystem();
		ms.list();
		
		System.out.println("====================");
		Scanner scan=new Scanner(System.in);
		
//		System.out.println("상세하게 볼 영화 선택(1~1938):");
//		int mno=scan.nextInt();
//		ms.detail(mno);
		
		// 영화 제목 검색
//		System.out.println("검색어 입력:");
//		String title=scan.next();
//		ms.movieNameFind(title);
		
		// 배우 검색
//		System.out.println("검색어 입력:");
//		String actor=scan.next();
//		ms.movieActorFind(actor);
		
		// 영화 장르 검색
		System.out.println("검색어 입력:");
		String genre=scan.next();
		ms.movieGenreFind(genre);
	}

}
