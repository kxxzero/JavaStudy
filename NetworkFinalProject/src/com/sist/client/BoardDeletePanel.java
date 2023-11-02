package com.sist.client;

import com.sist.vo.*;
import com.sist.manager.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoardDeletePanel extends JPanel implements ActionListener{
	ControllPanel cp;// 화면 변경 
    JLabel titleLa;
    JLabel la,la1;
    JPasswordField pf;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
    public BoardDeletePanel(ControllPanel cp)
    {
    	this.cp=cp;
    	titleLa=new JLabel("삭제하기");
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	titleLa.setHorizontalAlignment(JLabel.CENTER);
    	
    	la=new JLabel("비밀번호");
    	pf=new JPasswordField();
    	la1=new JLabel();
    	la1.setVisible(false);
    	b1=new JButton("삭제");
    	b2=new JButton("취소");
    	setLayout(null);
    	titleLa.setBounds(610, 15, 700, 50);
  	    add(titleLa);
  	    add(la1);
  	    
  	    la.setBounds(800, 200, 80, 30);
  	    pf.setBounds(880, 200, 200, 30);
  	    add(la);
  	    add(pf);
  	    
  	    JPanel p=new JPanel();
  	    p.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
  	    b1.setFont(new Font("맑은 고딕",Font.BOLD,15));
	    b2.setFont(new Font("맑은 고딕",Font.BOLD,15));

  	    p.add(b1);
  	    p.add(b2);
  	    p.setBounds(0, 270, 1920, 35);
  	    add(p);
  	    
  	    b1.addActionListener(this);
  	    b2.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			cp.card.show(cp, "detail"); // 이전 화면으로 이동 => history.back()
		}
		else if(e.getSource()==b1)
		{
			// 1. 번호 => la1
			String no=la1.getText();
			// 2. 비밀번호 => Manager
			String pwd=String.valueOf(pf.getPassword());
			if(pwd.trim().length()<1) // 입력이 안 된 상태
			{
				// 유효성 검사 => HTML(JavaScript)
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요.");
				pf.requestFocus();
				return;
			}
			// 비밀번호 확인
			String res=bm.boardDelete(Integer.parseInt(no), pwd);
			// 웹 => 출력 시 문자열 / 처리 시 정수형
			// 웹 3대 클래스 => ArrayList, Integer, String
			if(res.equals("YES"))
			{
				// 목록으로 이동
				JOptionPane.showMessageDialog(this, "삭제되었습니다");
				cp.blp.boardList(); // 변경된 내용을 다시 읽어옴
				cp.card.show(cp, "board");
			}
			else if(res.equals("NO"))
			{
				// 비밀번호 다시 입력 요청
				JOptionPane.showMessageDialog(this, "비밀번호가 틀렸습니다.");
				pf.setText("");
				pf.requestFocus();
			}
		}
	}
}
