package A5_Swing;

import java.awt.*;

import javax.swing.*;

public class A4_button1 {									//button 不是组件，是框架里的
	
	public static void main(String[] args){
		EventQueue.invokeLater(()->
				{     
					  JFrame frame=new buttonFrame();
				
				
					  frame.setTitle("button");
					  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					  frame.setVisible(true);
				
				});
		
	}
}

class buttonFrame extends JFrame{				
	private static final int WIDTH=500;
	private static final int HEIGHT=300;
	private JPanel buttonPanel;
	
	public buttonFrame(){		
		setSize(WIDTH,HEIGHT);	//pack会覆盖掉这个
		
		//创建面板（改变背景颜色要面板调用权，可以做内部类监听器获得权限
		buttonPanel=new JPanel();	
		
		//创建按钮
		JButton blueButton=new JButton("blue");			
		JButton zzwButton=new JButton(new ImageIcon("src\\Picture\\zzw.jpg"));
		JButton redButton=new JButton("red");	
		
		//给按钮注册监听器（lamda
		redButton.addActionListener(event->  buttonPanel.setBackground(Color.RED));
		zzwButton.addActionListener(event->  buttonPanel.setBackground(Color.GREEN));
		blueButton.addActionListener(event->  buttonPanel.setBackground(Color.BLUE));		
			
		//添加按钮到面板
		buttonPanel.add(blueButton);
		buttonPanel.add(zzwButton);
		buttonPanel.add(redButton);
		
		//添加面板到框架
		add(buttonPanel);				//别忘了返回面板！！！*******
		
		
		
		
	}

	
}