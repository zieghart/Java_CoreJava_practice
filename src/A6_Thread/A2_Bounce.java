package A6_Thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class A2_Bounce {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			JFrame frame=new BounceFrame2();
			frame.setTitle("bounce");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
class BounceFrame2 extends JFrame{
	private final static int WIDTH=300;
	private final static int HEIGHT=400;
	private BallComponent comp=new BallComponent();
	
	public BounceFrame2(){
		setSize(WIDTH,HEIGHT);
	
		JPanel buttonPanel=new JPanel();
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
																		//多线程出现点
		Runnable r=()->{
			try{
				for(int i=0;i<1000 ;i++){
					ball.move(comp.getBounds());
					comp.paint(getGraphics());;
					Thread.sleep(5);
				}
			}
			catch(InterruptedException e){  							//循环是sleep就这样
				Thread.currentThread().interrupt();						//中断当前进程
			}
		};
		//控制线程
		Thread t=new Thread(r);
		t.start();
		
		
	}
	
}
