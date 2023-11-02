package com.sist.client;

// Home : 맛집 카테고리
// 검색
// 채팅
// 오늘의 뉴스
// 커뮤니티 => 파일 입출력
import javax.swing.*;
import java.awt.*;

// 메뉴바 제작 => Panel 하나가 화면 하나
public class MenuPanel extends JPanel{

	public JButton b1, b2, b3, b4, /*b5,*/ b6;
	public MenuPanel()
	{
		b1=new JButton("HOME");
		b2=new JButton("영화 검색");
		b3=new JButton("실시간 채팅");
		b4=new JButton("커뮤니티");
//		b5=new JButton("뉴스");
		b6=new JButton("종료");
		
		setLayout(new GridLayout(1, 5, 10, 10)); // (row, col, left, right) GridLayout(a,b,c,d) : 버튼 a개를 b줄에 배치 / c,d는 버튼 간 간격 
		add(b1);
		add(b2);
		add(b3);
		add(b4);
//		add(b5);
		add(b6);
		
	}

}
