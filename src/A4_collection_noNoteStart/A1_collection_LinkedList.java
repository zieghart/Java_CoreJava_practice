package A4_collection_noNoteStart;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

import A2.Employee;

public class A1_collection_LinkedList {
	public static void main(String[] args){	
		List<Employee> staff=new LinkedList<>();		//�����洢Employee������,Queue�ӿ��Ƕ���,Set�ӿ�������Ĳ��ظ���,����iterû��add
		staff.add(new Employee("Jack",1000));
		
		Employee w=new Employee("WuYiFan",2000);								//WuYiFan�Ĺײ�
		
		staff.add(new Employee("WuYiFan",2000));
		staff.add(new Employee("Zieghart",3000));
		staff.add(new Employee("John",4000));
	
		for(Employee e:staff)							//��ӡ
			System.out.println(e);
		
		Iterator<Employee> iter=staff.iterator();		//������,	listIterator����add����ǰ����

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
	//Collection.sort()��������List����,����Ҫ�ȽϽӿڻ��뷽��P390,���㷨P393,����������ת��P395
	
	
}
