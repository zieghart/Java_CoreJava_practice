package A3;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;//zlshisb
import javax.swing.Timer;



public class A3_innerClass2noName {
	public static void main(String[] args){
		
		
		TalkingClock2 clock=new TalkingClock2(1000,true);
		clock.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
		}
		
	}
		
		

class TalkingClock2{
		
		private boolean beep;
		private int interval;
		
		public TalkingClock2(int interval,boolean beep){
			this.beep=beep;
			this.interval=interval;
		}
		
		
		public void start(){
			ActionListener listener=new ActionListener(){
				public void actionPerformed(ActionEvent event){
					System.out.println("zl «sb");
					if(beep)Toolkit.getDefaultToolkit().beep();
					}
			};
			
			Timer t=new Timer(interval,listener);
			t.start();
			
		}
		
	
		
	}