
import javax.swing.*;
import java.awt.*;
public class GameView {
	Image back, horse; // 변수 초기화
	int x=20, y=560;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg"); // 이미지 불러오기
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\horse.gif");
	}

	public void paint(Graphics g)
	{
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(horse, x, y, 150, 160, this);
	}
}
