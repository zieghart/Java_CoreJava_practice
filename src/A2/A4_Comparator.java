package A2;

import java.util.Comparator;


//����һ���Ƚ���

public class A4_Comparator implements Comparator<String>{
	
	public int compare(String s1,String s2)
	{
		return s1.length()-s2.length();
		
	}
	
	

}
