package A2;

import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import A1.Employee;

public class A3_interface_test {

public static void main(String[] args) /*throws InterruptedException*/{
		
		//接口运用1_sort工具_实现在Employee
		Employee[] arr=new Employee[3];
		arr[0]=new Employee("jack",8848000,1998,5,30);
		arr[1]=new Employee("zieghart",9000);
		arr[2]=new Employee("blue",100000);
	
		Arrays.sort(arr);
		System.out.println(arr[0].salary()+"   "+arr[1].salary()+"   "+arr[2].salary());//为毛必须加toString?
		
		//接口运用2_timer
		ActionListener listener=new A3_TimePrinter();
		Timer t=new Timer(1000,listener);
		t.start();
		//Thread.sleep(100000);  
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
		
	}
}
