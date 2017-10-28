package A5_Swing;

import java.awt.*;

import javax.swing.*;

public class A4_button1 {									//button ����������ǿ�����
	
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
		setSize(WIDTH,HEIGHT);	//pack�Ḳ�ǵ����
		
		//������壨�ı䱳����ɫҪ������Ȩ���������ڲ�����������Ȩ��
		buttonPanel=new JPanel();	
		
		//������ť
		JButton blueButton=new JButton("blue");			
		JButton zzwButton=new JButton(new ImageIcon("src\\Picture\\zzw.jpg"));
		JButton redButton=new JButton("red");	
		
		//����ťע���������lamda
		redButton.addActionListener(event->  buttonPanel.setBackground(Color.RED));
		zzwButton.addActionListener(event->  buttonPanel.setBackground(Color.GREEN));
		blueButton.addActionListener(event->  buttonPanel.setBackground(Color.BLUE));		
			
		//��Ӱ�ť�����
		buttonPanel.add(blueButton);
		buttonPanel.add(zzwButton);
		buttonPanel.add(redButton);
		
		//�����嵽���
		add(buttonPanel);				//�����˷�����壡����*******
		
		
		
		
	}

	
}