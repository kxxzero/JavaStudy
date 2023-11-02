package com.sist.client;

import com.sist.manager.BoardManager;
import com.sist.vo.BoardVO;

import java.awt.Color;
import java.awt.Font;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BoardInsertPanel extends JPanel implements ActionListener{

	ControllPanel cp;
	JLabel la;
	JLabel la1, la2, la3, la4;
	JTextField tf1, tf2, tf3;
	JTextArea ta;
	JButton b1, b2;

	public BoardInsertPanel(ControllPanel cp)
	{
		this.cp=cp;
		la=new JLabel("자유게시판");
		setLayout(null); // 사용자 정의 배치
		la.setHorizontalAlignment(JLabel.CENTER);
		la.setFont(new Font("맑은 고딕", Font.BOLD,35));
		la.setBounds(320, 15, 1260, 50);
		add(la);
		
		la1=new JLabel("이름");
		la2=new JLabel("제목");
		la3=new JLabel("내용");
		la4=new JLabel("비밀번호");
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		
		b1=new JButton("글쓰기");
		b2=new JButton("취소");
		
		// 배치
		la1.setBounds(320, 125, 70, 30);
		la1.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf1.setBounds(400, 125, 1180, 30); // 이름 입력 칸
		add(la1);
		add(tf1);
		
		la2.setBounds(320, 165, 450, 30);
		la2.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf2.setBounds(400, 165, 1180, 30); // 제목 입력 칸
		add(la2);
		add(tf2);
		
		la3.setBounds(320, 205, 70, 30);
		la3.setFont(new Font("맑은 고딕",Font.BOLD,14));
		js.setBounds(400, 205, 1180, 500); // 글쓰기 창
		add(la3);
		add(js);
		
		la4.setBounds(320, 715, 70, 30);
		la4.setFont(new Font("맑은 고딕",Font.BOLD,14));
		tf3.setBounds(400, 715, 1180, 30); // 비번 입력 칸
		add(la4);
		add(tf3);
		
		JPanel p=new JPanel();
		b1.setFont(new Font("맑은 고딕",Font.BOLD,15));
		b2.setFont(new Font("맑은 고딕",Font.BOLD,15));
//		b1.setBackground(Color.GRAY);
//      b1.setForeground(Color.WHITE);
		p.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
		p.add(b1);
		p.add(b2);
		p.setBounds(0, 755, 1920, 35);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==b1)
		{
			String name=tf1.getText();
			if(name.trim().length()<1)
			{
				tf1.requestFocus();
				return;
			}
			
			String subject=tf2.getText();
			if(subject.trim().length()<1)
			{
				tf2.requestFocus();
				return;
			}
			
			String content=ta.getText();
			if(content.trim().length()<1)
			{
				ta.requestFocus();
				return;
			}
			
			String pwd=tf3.getText();
			if(pwd.trim().length()<1)
			{
				tf3.requestFocus();
				return;
			}
			
			BoardManager bm=new BoardManager();
			BoardVO vo=new BoardVO();
			vo.setNo(bm.boardSequence());
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			vo.setHit(0);
			vo.setRegdate(new Date());
			bm.boardInsert(vo);
			
			// 화면 이동
			cp.card.show(cp, "board");
			cp.blp.boardList();
			
		}
	}
}
