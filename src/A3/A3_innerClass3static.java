package A3;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class A3_innerClass3static {
	
	public static void main(String[] args){
		double[] d=new double[20];
		for(int i=0;i<20;i++)
			d[i]=100*Math.random();
	
		
		 ArrayAlg.Pair p=ArrayAlg.minmax(d);
		System.out.println(p.getMax()+"    "+p.getMin());
		
		
		
	}
		
}
	
		

class ArrayAlg{			//all good
	
	public static class Pair{
		private double max;
		private double min;
		
		public Pair(double a,double b){
			max=a;
			min=b;
		}
		
		public double getMax(){
			return max;
		}
		public double getMin(){
			return min;
		}
		
	}
	
	public static Pair minmax(double[] a){
		double max=Double.NEGATIVE_INFINITY;
		double min=Double.POSITIVE_INFINITY;
		
		for(double d:a){
			if(max<d)max=d;
			if(min>d)min=d;
			
		}
		
		return new Pair(max,min);
	}
	
	
	
}