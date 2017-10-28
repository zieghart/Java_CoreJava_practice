package A3;

import java.awt.Toolkit;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class A3_innerClass1 { //定时器的优化版本
	public static void main(String[] args){
		
		
	TalkingClock clock=new TalkingClock(1000,true);
	clock.start();
	
	JOptionPane.showMessageDialog(null, "Quit program?");
	System.exit(0);
	}
	
}
	
	

class TalkingClock{
	
	private boolean beep;
	private int interval;
	
	
	
	public TalkingClock(int interval,boolean beep){
		this.beep=beep;
		this.interval=interval;
	}
	
	
	public void start(){
		ActionListener listener=new TimePrinter();
		Timer t=new Timer(interval,listener);
		t.start();
		
	}
	
	public class TimePrinter implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent event){
			System.out.println("oh, yes.");
			if(beep)Toolkit.getDefaultToolkit().beep();
		}
	}
	
}