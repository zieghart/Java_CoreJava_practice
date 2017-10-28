package A5_Swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class A5_windowListener {
	public static void main(String[] args){
		EventQueue.invokeLater(()->
		{
			JFrame frame=new JFrame();

			//使用匿名内部类添加框架的监听器(适配器
			frame.addWindowListener (new WindowAdapter ()
			{
				
				//没有覆盖不会报错
				 @Override					         
				 public void windowClosing (WindowEvent e )					         
				 {					         
					 /*看好了,如果下面的第一个常量是YES_NO_OP.. 就会有两个选项,选了yes就会返回YES_op...常量
					   选了no就会返回NO_op..  
					   如果第一个常量是YES_No_CANCEL_O.. 会弹出三个选项!自己写对应代码
					   第二个常数是控制图标的,这里是没有.(可以试试QUESTION_MESSAGE
					 */
					 int exi = JOptionPane.showConfirmDialog (null, "你喜欢吃榴莲吗？", "无害问题", 
							 JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);	
					 
					 if (exi == JOptionPane.YES_OPTION)					         				        
						 System.exit (0);					       
					 else       
						 return;					         
				 }					     
			});
			
			//应该是按下右上角X的return反应,必备
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			frame.setSize(500, 300);
			frame.setLocationByPlatform(true);
			frame.setTitle("windowListener");
			frame.setVisible(true);
			
			
				
		});
			
	}

}
