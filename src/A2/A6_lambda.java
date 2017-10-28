package A2;

import java.util.Arrays;

import javax.swing.Timer;

public class A6_lambda {
	public static void main(String[] args) throws InterruptedException{
		String[] arr={"apple","banana","eleplant","cat"};
		
		Arrays.sort(arr,(first,second)->first.length()-second.length());
		
		System.out.println(Arrays.toString(arr));
		
		Timer t=new Timer(1000,event->
				System.out.println("yeah"));
		t.start();
		
		
		Thread.sleep(2000);  
		System.exit(0);
		
		
	}

}
