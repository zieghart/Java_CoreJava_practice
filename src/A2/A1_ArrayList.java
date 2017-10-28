package A2;

import java.util.ArrayList;

import A1.*;

public class A1_ArrayList {
	public static void main(String[] args)
	{
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee("jack",10000));
		list.add(new Employee("zieghart",5000));
		int number =list.size();
		list.trimToSize();
		System.out.println(number);
		
		
	}

}
