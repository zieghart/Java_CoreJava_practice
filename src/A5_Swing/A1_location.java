package A5_Swing;

import java.awt.*;
import javax.swing.*;

public class A1_location {
	public static void main(String[] args){
		EventQueue.invokeLater(()->
		{
			JFrame frame=new SizedFrame();
			frame.setTitle("nothing");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
			
			
		});
		
		
	}

}

class SizedFrame extends JFrame{
	public SizedFrame(){
		
		//�õ���Ļ��С
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		double screenWidth=screenSize.getWidth();
		double screenHeight=screenSize.getHeight();
		//���ÿ�ܴ�С
		setSize((int)(screenWidth/2),(int)(screenHeight/2));
		setLocationByPlatform(true);
		//����ͼ��
		Image image=new ImageIcon(new String("src\\Picture\\zzw.jpg")).getImage();
		setIconImage(image);
		
		
	}
	
}