import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;
//������Ʈ ����
public class Avartar extends JPanel{
	Image back;
	Avartar(){
		setLayout(null); //�⺻ ���̾ƿ� ����
		back = Toolkit.getDefaultToolkit().getImage("c:\\image\\gameground.jpg");

	}

	//JButton btn_choice;
	//java.awt.image.BufferedImage buttonIcon = ImageIO.read(new File("c:\\image\\avartar_4.jpg"));

	//BufferedImage buttonIcon = ImageIO.read(new File("buttonIconPath"));
	//button = new JButton(new ImageIcon(buttonIcon));


	@Override
	protected void paintComponent(Graphics g) { //��Ų ���� �� , ��׶��忡 ���
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}

}
