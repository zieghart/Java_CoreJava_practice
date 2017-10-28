package A5_Swing;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class A3_StringStyles {
	public static void main(String[] args){
		EventQueue.invokeLater(()->
		{
			JFrame frame=new stringFrame();
			frame.setTitle("String");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		});
	}
}
class stringFrame extends JFrame{
	public stringFrame(){
		add(new stringComponent());
		pack();
	}
}

class stringComponent extends JComponent{

	static Dimension size=Toolkit.getDefaultToolkit().getScreenSize();//也要静态。。
	private static final int WIDTH=(int)size.getWidth()*2/3;;
	private static final int HEIGHT=(int)size.getHeight()*6/8;
	
	public void paintComponent(Graphics g){		//画画
		Graphics2D g2=(Graphics2D)g;
			
		double x=1.0;						
		double y=20;
		
		String[] fontNames=GraphicsEnvironment			//获得可用字体的字符数组
				.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		
		Font temp=new Font(fontNames[0],Font.BOLD,20);
		for(int i=0;i<fontNames.length;i++){
			temp=new Font(fontNames[i],Font.BOLD,20);	//打印一个特定的字体****
			g2.setFont(temp);
			g2.drawString(fontNames[i], (int)x, (int)y);
			y+=30;
			if((i+1)%27==0){						//循环27个，就会执行。(i+1)是为了从1开始周期，可以画数轴感受下
				x+=300;
				y=20;
			}
		}
	
	}
	
	@Override
	public Dimension getPreferredSize(){return new Dimension(WIDTH,HEIGHT);}
	

}