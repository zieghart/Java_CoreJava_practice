package A5_Swing;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;

import javax.swing.*;

public class A2_draw {
	
	public static void main(String[] args){
		EventQueue.invokeLater(()->
		{
			JFrame frame=new drawFrame();
			frame.setTitle("draw");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		});
	}

}
class drawFrame extends JFrame{
	
	public drawFrame(){
		add(new drawComponent());
		pack();
	}
}

class drawComponent extends JComponent{//segoe Print

	private static final int WIDTH=400;
	private static final int HEIGHT=500;
	
	public void paintComponent(Graphics g){		//画画
		Graphics2D g2=(Graphics2D)g;

		
		Font f=new Font("segoe Print",Font.BOLD,36);
		g2.setFont(f);
		
		String message="Hello, World!";
		Rectangle2D bounds=f.getStringBounds(message,g2.getFontRenderContext());        //获得描述字体的矩形
		
		double ltx=(getWidth()-bounds.getWidth())/2;			//得到中心矩形左上角的点
		double lty=(getHeight()-bounds.getHeight())/2;
			
		Rectangle2D rect=new Rectangle2D.Double(ltx,lty,bounds.getWidth(),bounds.getHeight());//画出中心矩形
		g2.draw(rect);
		
		double ascent=-bounds.getY();		//获得上坡度
		lty+=ascent;					//左上角点移到基线左
		
		Line2D line=new Line2D.Double(ltx,lty,ltx+bounds.getWidth(),lty);	//基线
		g2.draw(line);
		g2.drawString(message, (int)ltx, (int)lty);		//注意（int）
		
		
		
		
		g2.setPaint(Color.blue);									  //上蓝颜色
		Ellipse2D ellipse=new Ellipse2D.Double();					  //圆形
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		
		Image zzw=new ImageIcon(new String("src\\Picture\\zzw.jpg")).getImage();			//画图片
		g2.drawImage(zzw,0,0,null);
		
		
	}
	@Override
	public Dimension getPreferredSize(){return new Dimension(WIDTH,HEIGHT);}
	

}