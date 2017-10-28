package A4_collection_noNoteStart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

import A2.Employee;

public class A1_collection_LinkedList {
	public static void main(String[] args){	
		List<Employee> staff=new LinkedList<>();		//建立存储Employee单链表,Queue接口是队列,Set接口是无序的不重复集,它的iter没有add
		staff.add(new Employee("Jack",1000));
		
		Employee w=new Employee("WuYiFan",2000);								//WuYiFan的棺材
		
		staff.add(new Employee("WuYiFan",2000));
		staff.add(new Employee("Zieghart",3000));
		staff.add(new Employee("John",4000));
	
		for(Employee e:staff)							//打印
			System.out.println(e);
		
		Iterator<Employee> iter=staff.iterator();		//迭代器,	listIterator可以add和向前遍历

		System.out.println("*************************");
		
		while(iter.hasNext()){
			Employee e=iter.next();
			
			if("WuYiFan".equals(e.name()))
				iter.remove();
			else
				System.out.println(e);
		}
	
		System.out.println(staff.contains(w));
		
		
		
		
		
		
	}
	//Collection.sort()可以排序List集合,不过要比较接口或传入方法P390,简单算法P393,集合与数组转换P395
	
	
}
