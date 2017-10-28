package A2;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class A3_TimePrinter implements ActionListener {
	

	@Override
	public void actionPerformed(ActionEvent event) {

		System.out.println("Your potential is endless"+new Date());
		Toolkit.getDefaultToolkit().beep();		
	}
	

}

