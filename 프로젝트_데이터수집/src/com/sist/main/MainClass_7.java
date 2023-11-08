package com.sist.main;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Document doc=Jsoup.connect("https://www.gangwon.to/gwtour/only/attraction?catgry=%EC%9E%90%EC%97%B0").get();
			Elements link=doc.select("div.list-bx div.list-type-col3 strong");
			for(int i=0; i<link.size(); i++)
			{
				try
				{
					System.out.println(link.get(0).text());
				}catch(Exception ex) {}				
		
			}
		}catch(Exception ex) {}

	}
}
