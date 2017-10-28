package A6_Thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class A1_Bounce {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			JFrame frame=new BounceFrame();
			frame.setTitle("bounce");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
			
		});
	}
}

class BounceFrame extends JFrame{
	
	//框架负责加入按钮,创建放球的组件,加入球并调用球的移动方法,重新绘制.
	//球负责实现能动性,框架调用动.  add和move理应分开,但这里合在一起 了
	private final static int WIDTH=300;
	private final static int HEIGHT=400;
	private BallComponent comp=new BallComponent();
	
	public BounceFrame(){
		setSize(WIDTH,HEIGHT);
		
		JPanel buttonPanel=new JPanel();
		//加入两个按钮,负责加球和停止
		makeButton(buttonPanel,"start",event-> addBall());
		makeButton(buttonPanel,"stop",event->System.exit(1));
		
		add(comp,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
		
	}
	public void makeButton(Container c,String title,ActionListener listener){
		JButton button=new JButton(title);
		button.addActionListener(listener);
		c.add(button);
		
	}
	
	public void addBall(){
		Ball ball=new Ball();
		comp.add(ball);
		
		try{
			for(int i=0;i<1000;i++){
				ball.move(comp.getBounds());
				comp.paint(getGraphics());;
				Thread.sleep(3);
			}
		}
		catch(Exception e){
				
		}
	}
	
}