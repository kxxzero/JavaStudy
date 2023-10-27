package com.sist.main;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BoxOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/boxoffice/weekly").get();
			Elements link=doc.select("div.box_boxoffice strong.tit_item a");
			for(int i=0; i<link.size(); i++)
			{
				System.out.println(link.get(i).attr("href"));
				String subLink="https://movie.daum.net"+link.get(i).attr("href");
				System.out.println(subLink);
				
				Document doc2=Jsoup.connect(subLink).get();
				
				// 제목
				Element title=doc2.selectFirst("h3.tit_movie span.txt_tit");
				System.out.println(title.text());
				Element state=doc2.selectFirst("h3.tit_movie span.txt_state");
				System.out.println(state.text());
				Elements detail=doc2.select("div.detail_cont dl.list_cont");
				System.out.println(detail);
				
				String release="";
				String genre="";
				String nation="";
				String grade="";
				String time="";
				String rating="";
				String user="";
				
				
				for(int j=0; j<detail.size(); j++)
				{
					String str=detail.get(j).text();
					if(str.equals("개봉"))
					{
						Element e=doc2.select("div.detail_cont dl.list_cont dd").get(i);
						release=e.text();
					}
					else if(str.equals("장르"))
					{
						Element e=doc2.select("div.detail_cont dl.list_cont dd").get(i);
						genre=e.text();
					}
					else if(str.equals("국가"))
					{
						Element e=doc2.select("div.detail_cont dl.list_cont dd").get(i);
						nation=e.text();
					}
					else if(str.equals("등급"))
					{
						Element e=doc2.select("div.detail_cont dl.list_cont dd").get(i);
						grade=e.text();
					}
					else if(str.equals("러닝타임"))
					{
						Element e=doc2.select("div.detail_cont dl.list_cont dd").get(i);
						time=e.text();
					}
					else if(str.equals("평점"))
					{
						Element e=doc2.select("div.detail_cont dl.list_cont dd").get(i);
						rating=e.text();
					}
					else if(str.equals("누적관객"))
					{
						Element e=doc2.select("div.detail_cont dl.list_cont dd").get(i);
						user=e.text();
					}
//					else
//					{
//						System.out.println("데이터 없음");
//					}
					
					String msg=(i+1)+"|"
						+title.text()+"|"
						+state.text()+"|"
						+release+"|"
						+genre+"|"
						+nation+"|"
						+grade+"|"
						+time+"|"
						+rating+"|"
						+user+"\r\n";
						
					System.out.println(msg);
						
						
				}
				
//				String msg=(i+1)+"|"
//						+title.text()+"|"
//						+state.text()+"\r\n";
			}
		}catch(Exception ex) {}
		
	}

}
