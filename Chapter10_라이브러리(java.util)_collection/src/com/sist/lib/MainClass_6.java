package com.sist.lib;


// 멜론 => 곡명,
// 지니뮤직 => 곡명 => 중복이 없는 노래만 추출
// 공통 / 차집합 / 교집합 / 합집합
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MainClass_6 {
	public static Set<String> genieMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			
			for(int i=0; i<title.size(); i++)
			{
				set.add(title.get(i).text());
			}
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	
	public static Set<String> melonMusic()
	{
		
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			
			for(int i=0; i<title.size(); i++)
			{
				set.add(title.get(i).text());
			}
			
		}catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== Genie Music =====");
		Set<String> genie=genieMusic();
		for(String title:genie)
		{
			System.out.println(title);
		}
		
		System.out.println("\n===== Melon Music =====");
		Set<String> melon=melonMusic();
		for(String title:melon)
		{
			System.out.println(title);
		}
		
		
//		// 차집합(removeAll) [1,2,3,4,5]-[1,2,3,6,7]=[4,5] // 없는 데이터를 가져옴 => MINUS
//		System.out.println("\n===== Genie Music에만 있는 노래 =====");
//		
//		genie.removeAll(melon);
//		for(String title:genie)
//		{
//			System.out.println(title);
//		}
		
//		// 교집합(retainAll)
//		System.out.println("\n===== Genie와 Melon에 둘 다 있는 노래 =====");
//		genie.retainAll(melon);
//		System.out.println("곡 수: "+genie.size()+"곡");
//		for(String title:genie)
//		{
//			System.out.println(title);
//		}
		
		// UNION ALL(중복 있는 전체 데이터) 
		// 합집합(list) => 중복 가능
		System.out.println("\n===== Genie와 Melon에 있는 전체 노래(중복 있음) =====");
		List<String> list=new ArrayList<String>();
		
		list.addAll(genie);
		list.addAll(melon); // 데이터값 전체 추가 addAll
		System.out.println("곡 수: "+list.size()+"곡");
		for(String title:list)
		{
			System.out.println(title);
		}
		
		/*
		 * 	장바구니 => 동일 상품 관계 없이 처리
		 */
		
		// UNION(중복 없는 전체 데이터)
		System.out.println("\n===== Genie와 Melon에 있는 전체 노래(중복 없음) =====");
		Set<String> hap=new HashSet<String>();
		hap.addAll(genie);
		hap.addAll(melon);
		System.out.println("곡 수: "+hap.size()+"곡");
		for(String title:hap)
		{
			System.out.println(title);
		}
		
	}

}
