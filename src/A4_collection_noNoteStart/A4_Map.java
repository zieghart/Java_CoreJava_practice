package A4_collection_noNoteStart;

import java.util.HashMap;
import java.util.Map;

public class A4_Map {
	public static void  main(String[] args) {
		Map<String,Employee> staff=new HashMap<>();
		staff.put("sb",new Employee("zzw",10086));
		staff.put("talenter",new Employee("jack",4000));
		staff.put("boy",new Employee("monkey",6000));
		
		System.out.println(staff);
		System.out.println("**************����һ��");
		staff.remove("boy");
		System.out.println(staff);
		
		System.out.println("**************��ӡȫ��");
		staff.forEach((a,b)->
			System.out.println(a+b));
		
		
	}

}
