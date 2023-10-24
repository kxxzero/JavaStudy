package com.sist.music;

// Music을 제어하는 프로그램

import java.io.*;
import java.util.*;
public class MusicManager {

	private static Music[] musics=new Music[49];
	/*
	 * 	접속하는 모든 유저에게 공유 => 목록 => static
	 * 	초기화 => 클래스 블록에서는 초기화가 불가능
	 * 		1) 인스턴스 블록 : 인스턴스, static
	 * 		2) static 블록 : static => 인스턴스 초기화(객체 생성 후에 가능)
	 * 		3) 생성자 : 인스턴스, static
	 */ 
	
	public MusicManager() // 생성자 => 메모리 할당
	{
		/*
		 * 	try(FileReader fr=new FileReader();)
		 * 	{
		 * 	}catch(Exception ex) {}
		 */
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\genie.txt"); // FileNotFoundException
			int i=0;
			String music_data="";
			while((i=fr.read())!=-1) // -1 : EOF(파일 끝까지 읽음)
			{
				music_data+=(char)i;
			}
			// 1.
			String[] mds=music_data.split("\n");
			i=0;
			for(String s:mds)
			{
				try
				{
					System.out.println(s);
					StringTokenizer st=new StringTokenizer(s, "|");
					musics[i]=new Music();
					musics[i].setRank(Integer.parseInt(st.nextToken())); // 정수형을 바꿔주어야 함
					musics[i].setTitle(st.nextToken());
					musics[i].setSinger(st.nextToken());
					musics[i].setAlbum(st.nextToken());
					musics[i].setKey(st.nextToken());
				}catch(Exception ex) {}
			}
		}catch(Exception ex)
		{
			// 에러 확인
			ex.printStackTrace();
		}
		finally
		{
			// 파일 닫기
			// 서버 닫기
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}
	
	public Music[] musicAllData()
	{
		return musics;
	}
}
