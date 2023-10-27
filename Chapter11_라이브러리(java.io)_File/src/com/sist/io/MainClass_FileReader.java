package com.sist.io;

import java.io.*;
// 파일 읽기 => 송수신 => 2byte씩 읽어 옴 => 문자 스트림
// 파일 자체 제어 : Reader / Writer
public class MainClass_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr=null; // 초기값 부여
		try
		{
			fr=new FileReader("c:\\java_data\\sawon.txt");
			
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); // 정석 입력
		}
		finally
		{
			try
			{
				fr.close(); // 반드시 닫기
			}catch (Exception ex) {}
		}
	}

}
