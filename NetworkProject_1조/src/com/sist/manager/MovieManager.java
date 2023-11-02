package com.sist.manager;

import com.sist.vo.MovieReservationVO;

import java.util.*;
import java.io.*;

public class MovieManager {
		private static ArrayList<MovieReservationVO> mList=new ArrayList<MovieReservationVO>();
		static {
			FileReader fr=null;
			ObjectOutputStream ois=null;
			FileOutputStream fis=null;
			try {
				fr=new FileReader("c:\\java_data\\movie_cate.txt");
				String data="";
				int i=0;
				while((i=fr.read())!=-1) {
					data+=(char)i;
				}
				fr.close();
				
				int k = 0;
				String[] cates=data.split("\n");
				for(String s:cates) {
					StringTokenizer st=new StringTokenizer(s,"|"); // 파일의 인코딩이 UTF-8일때 오류가 남 ==> 다른이름으로 저장=> ANSI로 저장 => 해결
					MovieReservationVO vo=new MovieReservationVO();
					vo.setMno(++k);
					vo.setTitle(st.nextToken());
					vo.setImage(st.nextToken());
					vo.setRegdate(st.nextToken());
					vo.setGenre(st.nextToken());
					vo.setNation(st.nextToken());
					vo.setGrade(st.nextToken());
					vo.setTime(st.nextToken());
					vo.setScore(st.nextToken());
					vo.setMake_share(st.nextToken());
//					String[] ss=s.split("\\|");
//					FoodCategoryVO 
					mList.add(vo);
				}
				
//				fis=new FileOutputStream("c:\\java_data\\aac.txt");
//				ois=new ObjectOutputStream(fis);
//				ois.writeObject(mList);
				
			}catch(Exception ex){
				ex.printStackTrace();
			}finally {
				try {
					fis.close();
					ois.close();
				}catch(Exception ex) {}
			}
		}
		
		public ArrayList<MovieReservationVO> MovieReservationData(int no)
		{
			ArrayList<MovieReservationVO> list=new ArrayList<MovieReservationVO>();
			int start=0;
			int end=0;
			if(no==1) {
				start=0;
				end=9;
			}
			else if(no==2) {
				start=10;
				end=19;
			}
			else if(no==3) {
				start=20;
				end=29;
			}
			else if(no==4) {
				start=30;
				end=39;
			}
			else if(no==5) {
				start=40;
				end=49;
			}
			for(int i=start;i<=end;i++) {
				list.add(mList.get(i));
			}
			return list;
		}
		
		public MovieReservationVO movieInfoData(String title)
		{
			MovieReservationVO vo=new MovieReservationVO();
			for(MovieReservationVO mvo:mList)
			{
				if(mvo.getTitle().equals(title))
				{
					vo=mvo;
					break;
				}
			}
			return vo;
		}
		
		public MovieReservationVO movieInfoDate(int mno)
		{
			MovieReservationVO vo=new MovieReservationVO();
			for(MovieReservationVO mvo:mList)
			{
				if(mvo.getMno()==mno)
				{
					vo=mvo;
					break;
				}
			}
			return vo;
		}
		
//		public ArrayList<MovieReservationVO> movieListData(int mno)
//		{
//			ArrayList<MovieReservationVO> list=new ArrayList<MovieReservationVO>();
//			for(MovieReservationVO mvo:mList)
//			{
//				if(mvo.getCon()==cno)
//				{
//					list.add(mvo);
//				}
//			}
//			return list;
//		}
		

		
		public ArrayList<MovieReservationVO> movieFindData(String title)
	    {
		   ArrayList<MovieReservationVO> list= new ArrayList<MovieReservationVO>();
		   for(MovieReservationVO mvo:mList)
		   {
			   if(mvo.getTitle().contains(title))
			   {
				   list.add(mvo);
			   }
		   }
		   return list;
	    }
		
}