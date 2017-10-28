package A5_Swing;

import java.awt.*;

import javax.swing.*;

//Windows    com.sun.java.swing.plaf.windows.WindowsLookAndFeel

public class A4_button2LookAndFeel {				//button ����������ǿ�����
													//Windows�۸в���			
	
	public static void main(String[] args){
		EventQueue.invokeLater(()->
				{     
					  JFrame frame=new buttonFrame2();
					  frame.setTitle("button");
					  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					  frame.setVisible(true);
				});
	}
}

class buttonFrame2 extends JFrame{				
	private static final int WIDTH=900;
	private static final int HEIGHT=500;
	private JPanel buttonPanel;
	
	public buttonFrame2(){		
		setSize(WIDTH,HEIGHT);
		buttonPanel=new JPanel();	
		
		//�õ����ù۸е�����
		UIManager.LookAndFeelInfo[] infos=UIManager.getInstalledLookAndFeels();
		
		//���ù۸�
		for(UIManager.LookAndFeelInfo info:infos){
			makeButton(info.getName(),info.getClassName());
			System.out.println(info.getName()+"    "+info.getClassName());
		}
		
		add(buttonPanel);		
	
	}
	
	//������ť��ע������������������
	public void makeButton(String name,String className){
	
		JButton button=new JButton(name);
		buttonPanel.add(button);
		
		button.addActionListener(event->{
			try{
				UIManager.setLookAndFeel(className);
				SwingUtilities.updateComponentTreeUI(this);			//����������
			}
			catch(Exception e){
				e.printStackTrace();
			}
		});
		
	}

	
}