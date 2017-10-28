package A4_collection_noNoteStart;

import java.util.SortedSet;
import java.util.TreeSet;

import A4_collection_noNoteStart.Employee;

public class A2_collection_TreeSet {
	public static void main(String[] args){
		SortedSet<Employee> staff=new TreeSet<>();
		staff.add(new Employee("jack",88000));
		staff.add(new Employee("fakc",8000));
		staff.add(new Employee("tlihs",465177));
		staff.add(new Employee("haws",88000));
		
		for(Employee e:staff){
			System.out.println(e);
		}
		
		
		
	}
	
	
	
	
}
