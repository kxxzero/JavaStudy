package com.sist.client;

import com.sist.vo.*;
import com.sist.common.*;
import com.sist.manager.*;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

public class MovieFindPanel extends JPanel implements ActionListener{
	JTextField tf;
	JLabel la1, la2;
	JButton b1, b2;
	JTable table;
	DefaultTableModel model;
	ControllPanel cp;
	MovieManager mm=new MovieManager();

	public MovieFindPanel(ControllPanel cp)
	{
		this.cp=cp; // 화면 이동
		tf=new JTextField(20);
		b1=new JButton("검색");
		b2=new JButton("홈 이동");
		
		String[] col={"","영화명","장르"};
		Object[][] row=new Object[0][3]; // 가변
		// 익명의 클래스 : 상속 없이 오버라이딩 가능 => 내부 클래스 : 멤버클래스(네트워크, 쓰레드) => 두 개의 클래스가 서로 공유하는 데이터가 있는 경우
		/*
		 * 	네트워크(서버)
		 * 		= 대기 => 접속자의 IP
		 * 		= 통신
		 * 
		 * 		class Server
		 * 		{
		 * 			Vector vc=new Vector() => IP 정보 => 접속 시 처리
		 * 			class Client => Thread
		 * 			{
		 * 				=> vc 이용 => 클라이언트마다 통신
		 * 			}
		 * 		}
		 * 		=> 실시간 데이터 수집 => 분석 => 실시간 시각화	
		 */
		
		model=new DefaultTableModel(row, col)
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
			// Class.forName("")	
		};
		table=new JTable(model);
		table.setRowHeight(200);
		table.getTableHeader().setPreferredSize(new Dimension(30,30));
		JScrollPane js=new JScrollPane(table);
		
		// 배치
		tf.setSize(600, 40);
		tf.setLayout(new FlowLayout(FlowLayout.CENTER,30,5));
		JPanel p=new JPanel();
//		b1.setFont(new Font("맑은 고딕",Font.PLAIN,14));
//		b2.setFont(new Font("맑은 고딕",Font.PLAIN,14));
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		setLayout(new BorderLayout());
		
		add("North", p);
		add("Center", js);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);
	}
	
	public void findPrint(String title)
	{
		try
		{
			ArrayList<MovieReservationVO> list=mm.movieFindData(title);
			for(int i=model.getRowCount()-1; i>=0; i--)
			{
				model.removeRow(i);
			}
			
			for(MovieReservationVO vo:list)
			{
				URL url=new URL(vo.getImage());
				Image image=ImageChange.getImage(new ImageIcon(url), 90, 90);
				Object[] obj= {new ImageIcon(image), vo.getTitle(), vo.getRegdate()};
				model.addRow(obj);
			}
		}
		catch(Exception ex) {}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1 || e.getSource()==tf) // 버튼 클릭 또는 엔터 치기
		{
			String title=tf.getText();
			if(title.trim().length()<1) // 입력이 안 된 경우
			{
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			
			findPrint(title);
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp,"home");
		}
	}
}
