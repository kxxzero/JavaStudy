package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
/*
 * 	Container : 윈도우 창
 * 		=> JFrame : 닫기, 확대, 축소
 * 		=> JDialog 
 * 			= Modal : 해당 기능이 실행중일 때 다른 행동을 할 수 없는 상태 => 예) 로그인
 * 			= Modaless : 해당 기능이 실행중이더라도 다른 행동을 할 수 있는 상태 => 예) 채팅창
 * 		=> JWindow : title바가 없음
 * 		=> JPanel : 단독 실행 불가
 * 			= Button, TextField는 묶어서 사용 => 묶어서 사용할 경우 가운데 배치
 * 		=> JTable
 * 		=> JTree
 * 	Component : 단독 실행 불가
 * 		버튼
 * 			=> JButton : 일반 버튼
 * 			=> JRadioButton, JCheckBox : 토글 버튼
 * 			=> JMenuItem : 메뉴
 * 		입력
 * 			=> JTextField : 한 줄 입력
 * 			=> JTextArea : 여러 줄 입력
 * 			=> JPasswordField : 비밀번호 입력
 * 		기타
 * 			=> JLabel : 문자 출력, 이미지 출력
 * 			=> JTable : 목록 출력(JList)
 * 			=> JTabbedPane, JEditPane, JTextPane
 * 
 */
public class ClientMain implements ActionListener{
	// 생성자 => 오버로딩 
	private JFrame fr=new JFrame("네크워크 미니 프로젝트");
	Login login = new Login();
//	private JButton b1=new JButton("홈");
//	private JButton b2=new JButton("맛집");
//	private JButton b3=new JButton("레시피");
//	private JButton b4=new JButton("서울여행");
	
//	JMenuItem home=new JMenuItem("홈");
//	JMenuItem house=new JMenuItem("맛집");
//	JMenuItem recipe=new JMenuItem("레시피");
//	JMenuItem seoul=new JMenuItem("서울여행");
	
	JTabbedPane pan=new JTabbedPane();
	// 생성자 => 시작과 동시 처리 => 윈도우
	// 네트워크 => 서버 구동
	// 변수의 초기화
	
	public ClientMain()
	{
		pan.setTabPlacement(JTabbedPane.RIGHT);
		pan.addTab("홈", new JPanel());
		pan.addTab("맛집", new JPanel());
		pan.addTab("레시피", new JPanel());
		pan.addTab("서울여행", new JPanel());
		fr.add("Center", pan);
		
//		JMenu menu=new JMenu("메뉴");
//		menu.add(home);
//		menu.add(house);
//		menu.add(recipe);
//		menu.add(seoul);
//		JMenuBar bar=new JMenuBar();
//		bar.add(menu);
//		fr.setJMenuBar(bar);
		
//		JPanel p=new JPanel(); // 버튼을 묶어서 올려줌
//		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		fr.add("North", p);
		
		fr.setSize(1024, 768);
//		fr.setVisible(true);
		login.b1.addActionListener(this);
	}
	public static void main(String[] args) {
		
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		}catch(Exception ex) {}
		
		new ClientMain();
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==login.b1)
		{
			login.fr.setVisible(false);
			fr.setVisible(true);
		}
	}
}
