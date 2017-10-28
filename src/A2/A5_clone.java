package A2;

public class A5_clone {
	public static void main(String[] args) 
	{
		
		try{
		
			Employee e=new Employee("jack",10000.0);
			Employee cloned=e.clone();
			e.raiseSalary(10);
			System.out.println(e.salary()+"  "+cloned.salary());
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
