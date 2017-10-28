package A5_Swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

//ȡ������P454
//action����һ�����Է����������Ե���,�����м���������,�����������,���Դ���JButton����������.
public class A6_action_keyStroke {
	public static void main(String[] args){
		EventQueue.invokeLater(()->{
			JFrame a=new ButtonFrameS();
			a.setTitle("action");
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setVisible(true);
			
		});
		
		
		
	}
}

class ButtonFrameS extends JFrame{
	
	private JPanel buttonPanel;
	private final static int WIDTH=300;
	private final static int HEIGHT=400;
	
	
	//������
	public ButtonFrameS(){
		setSize(WIDTH,HEIGHT);
		Action blueAction =new ColorAction("blue",Color.BLUE);
		Action yellowAction=new ColorAction("yellow",Color.YELLOW);;
		JButton blueButton=new JButton(blueAction);			//���ݶ�������ť
		JButton yellowButton=new JButton(yellowAction);			//���ݶ�������ť
		
		buttonPanel=new JPanel();
		buttonPanel.add(blueButton);
		buttonPanel.add(yellowButton);
		
		//���ÿ�ݼ�
		InputMap imap=buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		imap.put(KeyStroke.getKeyStroke("ctrl B"),"panel.blue");//�����Ǹ�blue������һ������,��ֵ��
		imap.put(KeyStroke.getKeyStroke("ctrl Y"),"panel.yellow");
		
		
		ActionMap amap=buttonPanel.getActionMap();
		amap.put("panel.blue", blueAction);
		amap.put("panel.yellow", yellowAction);
		
		add(buttonPanel);//�����˼����
	}
	
	
	class ColorAction extends AbstractAction {

		//JPanel buttonPanel;
		public ColorAction(String name,Color color){
			
			//������:������ɫ,ͼ��,����
			putValue(Action.NAME,name);
			putValue("color",color);		//���ﴫ������Ǹ�Color����!!��Ҫ�õ�.
			putValue(Action.SMALL_ICON,new ImageIcon("src\\Picture\\button.png"));//����ICON������IMAGE
			putValue(Action.SHORT_DESCRIPTION,"I am "+name.toLowerCase()+" button.");//name�ǲ���
			
			
		}
		
		//����,��һ����ɫ����
		@Override
		public void actionPerformed(ActionEvent event){
			Color c=(Color)getValue("color");//ע��ǿ��ת��
			buttonPanel.setBackground(c);						//����������ⲿ��ķ����ﶨ��
			
		}
		
	}
	
}

	