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

	static Dimension size=Toolkit.getDefaultToolkit().getScreenSize();//ҲҪ��̬����
	private static final int WIDTH=(int)size.getWidth()*2/3;;
	private static final int HEIGHT=(int)size.getHeight()*6/8;
	
	public void paintComponent(Graphics g){		//����
		Graphics2D g2=(Graphics2D)g;
			
		double x=1.0;						
		double y=20;
		
		String[] fontNames=GraphicsEnvironment			//��ÿ���������ַ�����
				.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		
		Font temp=new Font(fontNames[0],Font.BOLD,20);
		for(int i=0;i<fontNames.length;i++){
			temp=new Font(fontNames[i],Font.BOLD,20);	//��ӡһ���ض�������****
			g2.setFont(temp);
			g2.drawString(fontNames[i], (int)x, (int)y);
			y+=30;
			if((i+1)%27==0){						//ѭ��27�����ͻ�ִ�С�(i+1)��Ϊ�˴�1��ʼ���ڣ����Ի����������
				x+=300;
				y=20;
			}
		}
	
	}
	
	@Override
	public Dimension getPreferredSize(){return new Dimension(WIDTH,HEIGHT);}
	

}