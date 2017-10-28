package A6_Thread;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

//放球的组件
public class BallComponent extends JPanel{
	private final static int WIDTH=300;
	private final static int HEIGHT=300;
	
	
	private ArrayList<Ball> balls=new ArrayList<>();
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);			//继承组件类panel需要的,填满背景.
		Graphics2D g2=(Graphics2D)g;
		
		for(Ball b:balls)					//球儿们告诉位置,我来画满
			g2.fill(b.getShape());
		
	}
	
	public void add(Ball ball){
		balls.add(ball);											
		
	}
	
	public Dimension getPreferredSize(){	return new Dimension(WIDTH,HEIGHT);}
	

}
