package A6_Thread;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

//��������
public class BallComponent extends JPanel{
	private final static int WIDTH=300;
	private final static int HEIGHT=300;
	
	
	private ArrayList<Ball> balls=new ArrayList<>();
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);			//�̳������panel��Ҫ��,��������.
		Graphics2D g2=(Graphics2D)g;
		
		for(Ball b:balls)					//����Ǹ���λ��,��������
			g2.fill(b.getShape());
		
	}
	
	public void add(Ball ball){
		balls.add(ball);											
		
	}
	
	public Dimension getPreferredSize(){	return new Dimension(WIDTH,HEIGHT);}
	

}
