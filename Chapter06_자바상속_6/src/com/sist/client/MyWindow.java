package com.sist.client;
import javax.swing.*;
public class MyWindow {
	JFrame fr=new JFrame(); // 캡술화(X) => 데이터 은닉화 필요 없음
	public MyWindow()
	{
		fr.setSize(800, 600);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		new MyWindow();
	}

}
