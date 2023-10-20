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
	
	public ClientMainForm()
	{
		setLayout(null); // 기본으로 제공하는 레이아웃 사용 X => 직접 배치
		logo.setBounds(10, 15, 120, 120);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.png"), 100, 150)));
		add(logo);
		
		mp.setBounds(10, 175, 120, 250); // 버튼 전체 크기 조절
		add(mp);
		
		cp.setBounds(135, 15, 865, 705);
		add(cp);
		setSize(1025, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		/*
		 * 	FlowLayout : 일렬로 배치
		 *	GridLayout : 일정 간격을 유지하여 배치
		 *	BoardLayout : 동서남북+가운데s
		 *	CardLayout : 감추기
		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
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
		
	}

}
