package com.sist.dao;

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class FestivalDAO {

	public static void main(String[] args) {
		try
		{
			int s=1;
			for(int i=1; i<4; i++)
			{
				String url="https://www.visitbusan.net/index.do?uc_seqs=&ucMtmUcSeq=&ucMtmItemUcSeq=&file_name=&gugun_nm=&cate2_nm=&ucc1_seq=20&cate1_nm=&ucdpp_seqs=&uct_seqs=&ucum_seqs=&ucl_seq=7&ucl_use_yn=Y&exclude_uc_seq=&place=&title=&subtitl=&hash_tag=&middle_size_rm2=&menuCd=DOM_000000201005000000&list_type=TYPE_SMALL_CARD&order_type=NEW&listCntPerPage2=16&ucum_seq=&ub_seq=&distance=0.0&cate2_month=&favoriteThis=N&myFavoriteUserId=&sel_visit_place=N&user_id=&search_keyword=&num_room=&ulg_seq=&ucc1_use_yn=&ucc2_seq=&ucg_seq=&ucogl_seq=&main_img_ucmf_seq=&main_title=&charger_positn=&charger_nm=&charger_tel=&tripadvisor_id=&lat=&lng=&bundle_cntnts_yn=&use_yn=Y&sort_num=&page_no="+i;
				Document doc=Jsoup.connect(url).get();
				Elements link=doc.select("div.travel_list div.info p.tit a");
				Elements image=doc.select("div.travel_list div.box img");
				
				for(int j=0; j<link.size(); j++)
				{
//					System.out.println(link.get(i).attr("href"));
					String subLink="https://www.visitbusan.net"+link.get(j).attr("href"); // 서버 주소
//					System.out.println(subLink);
					Document doc2=Jsoup.connect(subLink).get();
					
					// 제목
					Elements title=doc2.select("section#title div.innerwrap h4.tit");
					System.out.println(title.text());
					
					// 이미지
					String poster="https://www.visitbusan.net"+image.get(j).attr("src").replace("thumbL", "ttiel");
					System.out.println("https://www.visitbusan.net"+image.get(j).attr("src").replace("thumbL", "ttiel"));

					// 상세 정보
					Elements info=doc2.select("div#tab_con div.cont");
					System.out.println(info.text());
					
					Elements detailTitle=doc2.select("div.cntInfoDetails ul.InfoD-List li p");
					// System.out.println(detailTitle);
					String address="정보 없음", rate="정보 없음", tel="정보 없음", time="정보 없음";
					for(int a=0; a<detailTitle.size(); a++)
					{
						String dt=detailTitle.get(a).text();
						if(dt.contains("주소"))
						{
							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
							address=detailInfo.text();
						}
						if(dt.contains("요금"))
						{
							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
							rate=detailInfo.text();
						}
						if(dt.contains("전화번호"))
						{
							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
							tel=detailInfo.text();
						}
						if(dt.contains("시간"))
						{
							Element detailInfo=doc2.select("div.cntInfoDetails ul.InfoD-List li span").get(a);
							time=detailInfo.text();
						}
			       	}
					
					// 태그
					Elements tag=doc2.select("div.tag ul.taglist li a");
					System.out.println(tag.text());
					
					String msg=(s++)+"|"
							+title.text()+"|"
							+poster+"|"
							+info.text()+"|"
							+address+"|"
							+rate+"|"
							+tel+"|"
							+time+"|"
							+tag.text()+"\r\n";
					
					FileWriter fw=new FileWriter("C:\\javaDev\\javaData\\festival.txt", true);
					fw.write(msg);
					fw.close();
				}
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
}
