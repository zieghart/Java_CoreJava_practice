package A1;

public class A5_easy_Employee {
	
	public static void main(String[] args)
	{
		Employee[] arr=new Employee[3];
		
		arr[0]=new Manager("jack",8000,1998,5,30);
		arr[1]=new Employee("zieghart",9000);
		arr[2]=new Employee("blue",100000);
	
		for(Employee one: arr)
		{	
			one.raiseSalary(8);
			System.out.println(one.salary()+"   "+one.name() +"  "+one.hireday() +"  "+one.ID());
		}
		
		Manager fuck=new Manager();
		System.out.println(fuck.name());
		System.out.println(arr[1].getDescription());
		
		
		//œ‡µ»–‘≤‚ ‘
		System.out.println(arr[1].equals(arr[1]));
		
		Manager dick=new Manager("dick",8000,1998,5,30);
		dick.setBonus(500);
		
		Manager dick2=new Manager("dick2",8000,1998,5,30);
		dick.setBonus(5000);
		
		System.out.println(dick.equals(dick2));
		
		//toString
		System.out.println(arr[2].toString());
		System.out.println(dick);
		
	}	
}

	