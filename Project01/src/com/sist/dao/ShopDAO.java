package com.sist.dao;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class ShopDAO {

	public static void main(String[] args) {
		try
		{
			int s=1;
			for(int i=1; i<10; i++)
			{
				String url="https://egnmall.kr/kwa-ABS_goods_l-1009003?PB_1410486717="+i;
				Document doc=Jsoup.connect(url).get();
				Elements link=doc.select("div.bdShop div.goodsListGnmall table tr td.-tblGoodsList div.calc div.-fdGoodsName a");
//				Elements image=doc.select("div.travel_list div.box img");
				
				for(int j=0; j<link.size(); j++)
				{
//					System.out.println(link.get(i).attr("href"));
					String subLink="https://egnmall.kr"+link.get(j).attr("href"); // 서버 주소
//					System.out.println(subLink);
					Document doc2=Jsoup.connect(subLink).get();
					
					// 제목
					Elements title=doc2.select("div.articleHead div.ABA-container-box div.bdGoodsInfoR h4");
					System.out.println(title.text());
					
//					// 이미지
//					String poster="https://www.visitbusan.net"+image.get(j).attr("src").replace("thumbL", "ttiel");
//					System.out.println("https://www.visitbusan.net"+image.get(j).attr("src").replace("thumbL", "ttiel"));
//
//					// 상세 정보
//					Elements info=doc2.select("div#tab_con div.cont");
//					System.out.println(info.text());
//					
//					Elements detailTitle=doc2.select("div.cntInfoDetails ul.InfoD-List li p");
//					// System.out.println(detailTitle);
//					String address="정보 없음", rate="정보 없음", tel="정보 없음", time="정보 없음";
//					for(int a=0; a<detailTitle.size(); a++)
//					{
//						String dt=detailTitle.get(a).text();
//						if(dt.contains("주소"))
//						{
//							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
//							address=detailInfo.text();
//						}
//						if(dt.contains("요금"))
//						{
//							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
//							rate=detailInfo.text();
//						}
//						if(dt.contains("전화번호"))
//						{
//							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
//							tel=detailInfo.text();
//						}
//						if(dt.contains("시간"))
//						{
//							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
//							time=detailInfo.text();
//						}
//			       	}
//					
//					// 태그
//					Elements tag=doc2.select("div.tag ul.taglist li a");
//					System.out.println(tag.text());
					
					String msg=(s++)+" | "
							+title.text()+" | ";
//							+poster+" | "
//							+info.text()+" | "
//							+address+" | "
//							+rate+" | "
//							+tel+" | "
//							+time+" | "
//							+tag.text()+"\r\n";
					
//					FileWriter fw=new FileWriter("C:\\javaDev\\javaData\\festival.txt", true);
//					fw.write(msg);
//					fw.close();
				}
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
