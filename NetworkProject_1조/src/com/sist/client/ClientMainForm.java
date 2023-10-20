package com.sist.client;
import com.sist.common.ImageChange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMainForm extends JFrame implements ActionListener{
	MenuPanel mp=new MenuPanel();
	ControllPanel cp=new ControllPanel();
	JLabel logo=new JLabel();
	Login login=new Login();
	public ClientMainForm()
	{
		setLayout(null); // 기본으로 제공하는 레이아웃 사용 X => 직접 배치
		/*
		 * 	FlowLayout : 일렬로 배치
		 *	GridLayout : 일정 간격을 유지하여 배치
		 *	BoardLayout : 동서남북+가운데
		 *	CardLayout : 감추기
		 */
		logo.setBounds(320, 20, 120, 60);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 120, 60)));
		add(logo);
		
		mp.setBounds(460, 40, 1120, 40); // 버튼 전체 크기 조절
		add(mp);
		
		cp.setBounds(0, 120, 1920, 940);
		add(cp);
		setSize(1920, 1080);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		// 등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); // 기존
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); // 맥
		}catch(Exception ex) {}
		new ClientMainForm();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b2)
		{
			
		}
		else if(e.getSource()==mp.b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==mp.b4)
		{
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==mp.b5)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==mp.b6)
		{
			System.exit(0);
		}
		
		else if(e.getSource()==login.b1)
		{
			// 서버 연결
			login.setVisible(false);
			setVisible(true);
		}
		
	}

}
