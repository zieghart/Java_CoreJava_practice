package A5_Swing;

import java.awt.*;

import javax.swing.*;

//Windows    com.sun.java.swing.plaf.windows.WindowsLookAndFeel

public class A4_button2LookAndFeel {				//button 不是组件，是框架里的
													//Windows观感不错			
	
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
		
		//得到可用观感的数组
		UIManager.LookAndFeelInfo[] infos=UIManager.getInstalledLookAndFeels();
		
		//设置观感
		for(UIManager.LookAndFeelInfo info:infos){
			makeButton(info.getName(),info.getClassName());
			System.out.println(info.getName()+"    "+info.getClassName());
		}
		
		add(buttonPanel);		
	
	}
	
	//创建按钮，注册监听器，并加入面板
	public void makeButton(String name,String className){
	
		JButton button=new JButton(name);
		buttonPanel.add(button);
		
		button.addActionListener(event->{
			try{
				UIManager.setLookAndFeel(className);
				SwingUtilities.updateComponentTreeUI(this);			//更新这个框架
			}
			catch(Exception e){
				e.printStackTrace();
			}
		});
		
	}

	
}