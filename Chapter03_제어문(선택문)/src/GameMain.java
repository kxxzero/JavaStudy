
import javax.swing.*; // 윈도우 관련 프로그램
import java.awt.*;
import java.awt.event.*;
//import java.util.EventListener;
public class GameMain extends JFrame implements KeyListener{

	GameView gv=new GameView();
	
	public GameMain()
	{
		add("Center", gv);
		setSize(1920, 1080); // 창 크기
		setVisible(true);
		addKeyListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this)
		{
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_UP:
				gv.y-=5;
				if(gv.y<0)
					gv.y=768;
				break;
			case KeyEvent.VK_DOWN:
				break;
			case KeyEvent.VK_LEFT:
				break;
			case KeyEvent.VK_RIGHT:
				break;
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
