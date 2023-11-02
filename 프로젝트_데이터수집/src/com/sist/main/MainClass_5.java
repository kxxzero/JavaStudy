package com.sist.main;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/boxoffice/weekly").get();
			Elements link=doc.select("div.section_ranking strong.tit_item a");
			for(int i=0; i<link.size(); i++)
			{
				try
				{
					System.out.println(link.get(i).attr("href"));
					String subLink="https://movie.daum.net"+link.get(i).attr("href"); // 서버 주소
					System.out.println(subLink);
					Document doc2=Jsoup.connect(subLink).get();
					
					// 제목
					Element title=doc2.selectFirst("h3.tit_movie span.txt_tit");
					System.out.println(title.text());
					Element state=doc2.selectFirst("h3.tit_movie span.txt_state");
					System.out.println(state.text());
					
					Elements detail=doc2.select("div.detail_cont dl.list_cont dd");
//					Element dd1=doc2.select("div.detail_cont dl.list_cont dd").get(0);
//					Element dd2=doc2.select("div.detail_cont dl.list_cont dd").get(1);
//					Element dd3=doc2.select("div.detail_cont dl.list_cont dd").get(2);
//					Element dd4=doc2.select("div.detail_cont dl.list_cont dd").get(3);
//					Element dd5=doc2.select("div.detail_cont dl.list_cont dd").get(4);
//					Element dd6=doc2.select("div.detail_cont dl.list_cont dd").get(5);
//					Element dd7=doc2.select("div.detail_cont dl.list_cont dd").get(6);
					System.out.println(detail);
					
//					System.out.println(dd1.text());
//					System.out.println(dd2.text());
//					System.out.println(dd3.text());
//					System.out.println(dd4.text());
//					System.out.println(dd5.text());
//					System.out.println(dd6.text());
//					System.out.println(dd7.text());
					
					Element poster=doc2.selectFirst("div.info_poster span.bg_img");
					String image="";
					try
					{
						image=poster.attr("style");
						image=image.substring(image.indexOf("(")+1, image.lastIndexOf(")"));
					}catch(Exception ex)
					{
						image="이미지 없음";
					}
					
					
					String regdate="개봉일 정보 없음",genre="장르 정보 없음",nation="국가 정보 없음",grade="등급 정보 없음",time="러닝타임 정보 없음",score="평점 정보 없음",make_share="누적관객 정보 없음";
				       Elements etc=doc2.select("div.detail_cont dl.list_cont dt");
				       //System.out.println(etc);
				       for(int a=0;a<etc.size();a++)
				       {
				    	   String ss=etc.get(a).text();
				    	   if(ss.equals("개봉"))
				    	   {
				    		   Element e=doc2.select("div.detail_cont dl.list_cont dd").get(a);
				    		   regdate=e.text();
				    	   }
				    	   else if(ss.equals("장르"))
				    	   {
				    		   Element e=doc2.select("div.detail_cont dl.list_cont dd").get(a);
				    		   genre=e.text();
				    	   }
				    	   else if(ss.equals("국가"))
				    	   {
				    		   Element e=doc2.select("div.detail_cont dl.list_cont dd").get(a);
				    		   nation=e.text();
				    	   }
				    	   else if(ss.equals("등급"))
				    	   {
				    		   Element e=doc2.select("div.detail_cont dl.list_cont dd").get(a);
				    		   grade=e.text();
				    	   }
				    	   else if(ss.equals("러닝타임"))
				    	   {
				    		   Element e=doc2.select("div.detail_cont dl.list_cont dd").get(a);
				    		   time=e.text();
				    	   }
				    	   else if(ss.equals("평점"))
				    	   {
				    		   Element e=doc2.select("div.detail_cont dl.list_cont dd").get(a);
				    		   score=e.text();
				    	   }
				    	   else if(ss.equals("누적관객"))
				    	   {
				    		   Element e=doc2.select("div.detail_cont dl.list_cont dd").get(a);
				    		   make_share=e.text();
				    	   }
				       }
//				       System.out.println("번호:"+m);
//				       System.out.println("업체명:"+title.text());
//				       System.out.println("점수:"+score.text());
//				       System.out.println("주소:"+addr);
//				       System.out.println("전화:"+phone);
//				       System.out.println("음식종류:"+tp);
//				       System.out.println("가격대:"+pr);
//				       System.out.println("주차:"+pa);
//				       System.out.println("영업시간:"+ti);
//				       System.out.println("메뉴:"+mu);
					
					
					
//					String temp="";
//					for(int j=0; j<detail.size(); j++)
//					{
//						temp+=detail.get(j).text()+"|";
//						System.out.println(detail.get(j).text());
//					}
					
//					Element poster=doc2.selectFirst("div.thumb_img span.bg_img");
//					String image=poster.attr("style");
//					image=image.substring(image.indexOf("(")+1, image.lastIndexOf(")"));
//					System.out.println(image);
					
					String msg=
//							(i+1)+"|"+
							title.text()+"|"
							+image+"|"
							+regdate+"|"
							+genre+"|"
							+nation+"|"
							+grade+"|"
							+time+"|"
							+score+"|"
							+make_share+"\r\n";
//							+state.text()+"|"

//							+temp							
//							+dd1.text()+"|"
//							+dd2.text()+"|"
//							+dd3.text()+"|"
//							+dd4.text()+"|"
//							+dd5.text()+"|"
//							+dd6.text()+"|"	
//							+dd7.text()+"\r\n";
															
//					msg=msg.substring(0, msg.lastIndexOf("|")); // 맨 마지막 역슬래시는 삭제
//					msg="\r\n";
					
					FileWriter fw=new FileWriter("c:\\java_data\\movie_boxOffice.txt", true);
					fw.write(msg);
					fw.close();
				
			}catch(Exception ex) {}
		
		}
		
	}catch(Exception ex) {}

	}
}
