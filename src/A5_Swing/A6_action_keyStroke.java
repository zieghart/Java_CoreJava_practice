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

//取消动作P454
//action类是一个可以放入描述属性的类,并且有监听器动作,创建这个对象,可以传到JButton构造器里面.
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
	
	
	//构造器
	public ButtonFrameS(){
		setSize(WIDTH,HEIGHT);
		Action blueAction =new ColorAction("blue",Color.BLUE);
		Action yellowAction=new ColorAction("yellow",Color.YELLOW);;
		JButton blueButton=new JButton(blueAction);			//传递动作给按钮
		JButton yellowButton=new JButton(yellowAction);			//传递动作给按钮
		
		buttonPanel=new JPanel();
		buttonPanel.add(blueButton);
		buttonPanel.add(yellowButton);
		
		//设置快捷键
		InputMap imap=buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		imap.put(KeyStroke.getKeyStroke("ctrl B"),"panel.blue");//后面那个blue可能是一个属性,键值对
		imap.put(KeyStroke.getKeyStroke("ctrl Y"),"panel.yellow");
		
		
		ActionMap amap=buttonPanel.getActionMap();
		amap.put("panel.blue", blueAction);
		amap.put("panel.yellow", yellowAction);
		
		add(buttonPanel);//别忘了加面板
	}
	
	
	class ColorAction extends AbstractAction {

		//JPanel buttonPanel;
		public ColorAction(String name,Color color){
			
			//放属性:名字颜色,图标,描述
			putValue(Action.NAME,name);
			putValue("color",color);		//这里传入必须是个Color对象!!还要用的.
			putValue(Action.SMALL_ICON,new ImageIcon("src\\Picture\\button.png"));//传入ICON而不是IMAGE
			putValue(Action.SHORT_DESCRIPTION,"I am "+name.toLowerCase()+" button.");//name是参数
			
			
		}
		
		//动作,用一下颜色属性
		@Override
		public void actionPerformed(ActionEvent event){
			Color c=(Color)getValue("color");//注意强制转化
			buttonPanel.setBackground(c);						//这个面板别在外部类的方法里定义
			
		}
		
	}
	
}

	