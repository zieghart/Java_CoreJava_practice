package A2;

import java.util.Comparator;

public class A4_Compara_String {
	
	public static void main(String[] args)
	{
		Comparator<String> comp=new A4_Comparator();
		System.out.println(comp.compare("abcd", "abc"));
		
	}

}
