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
		
		//得到屏幕大小
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		double screenWidth=screenSize.getWidth();
		double screenHeight=screenSize.getHeight();
		//设置框架大小
		setSize((int)(screenWidth/2),(int)(screenHeight/2));
		setLocationByPlatform(true);
		//设置图标
		Image image=new ImageIcon(new String("src\\Picture\\zzw.jpg")).getImage();
		setIconImage(image);
		
		
	}
	
}