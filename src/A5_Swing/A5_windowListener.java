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

			//ʹ�������ڲ�����ӿ�ܵļ�����(������
			frame.addWindowListener (new WindowAdapter ()
			{
				
				//û�и��ǲ��ᱨ��
				 @Override					         
				 public void windowClosing (WindowEvent e )					         
				 {					         
					 /*������,�������ĵ�һ��������YES_NO_OP.. �ͻ�������ѡ��,ѡ��yes�ͻ᷵��YES_op...����
					   ѡ��no�ͻ᷵��NO_op..  
					   �����һ��������YES_No_CANCEL_O.. �ᵯ������ѡ��!�Լ�д��Ӧ����
					   �ڶ��������ǿ���ͼ���,������û��.(��������QUESTION_MESSAGE
					 */
					 int exi = JOptionPane.showConfirmDialog (null, "��ϲ����������", "�޺�����", 
							 JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);	
					 
					 if (exi == JOptionPane.YES_OPTION)					         				        
						 System.exit (0);					       
					 else       
						 return;					         
				 }					     
			});
			
			//Ӧ���ǰ������Ͻ�X��return��Ӧ,�ر�
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			
			frame.setSize(500, 300);
			frame.setLocationByPlatform(true);
			frame.setTitle("windowListener");
			frame.setVisible(true);
			
			
				
		});
			
	}

}
