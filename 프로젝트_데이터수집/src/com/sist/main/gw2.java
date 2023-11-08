package com.sist.main;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class gw2 {

	public static void main(String[] args) {
		try
		{
			Document doc=Jsoup.connect("https://www.gangwon.to/gwtour/only/attraction?catgry=%EC%9E%90%EC%97%B0").get();
			Elements link=doc.select("div.list-bx div.list-type-col3 strong");
			System.out.println(link.get(0).text());
//			for(int i=0; i<link.size(); i++)
//			{
			
//			}
		
		}catch(Exception ex) {}
	}
}
