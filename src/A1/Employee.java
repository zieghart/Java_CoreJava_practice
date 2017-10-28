package A1;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>{//接口注意加<>
	//初始化
	private String name;
	private double salary;
	private LocalDate hireday;
	
	//静态域/ID设置
	private static int nextId=0;
	private int id=++nextId;
	
	//private int id=setID();                                  ***
	
	//构造器
	public Employee(String name,double salary,int year,int month,int day)
	{
		super("man");
		this.name=name;
		this.salary=salary;
		this.hireday=LocalDate.of(year,month,day);
	}	
	//默认构造器
	public Employee()
	{
		this("nobody",1500,1700,1,1);
	}
	//重载构造器
	public Employee(String name,double salary)		
	{
		this(name, salary,1998,5,30);
	}
	
	//访问器
	public void raiseSalary(int rate)
	{
		this.salary=this.salary*(1+rate);
	}
	/**
	 *{@link A1.Employee#name()} //生成文档后有效了
	 * @author zieghart
	 *
	 */
	public  String name()
	{
		return this.name;
	}
	public LocalDate hireday()
	{
		return this.hireday;          
	}
	public int ID()
	{
		return this.id;
	}
	public double salary()
	{
		return this.salary;
	}
	
	
	//抽象的方法
	public  String getDescription()
	{
		return "I am a man , who's sex is "+super.sex()+" and name is "+this.name();
	}
	
	
	@Override public boolean equals(Object otherObject)
	{
		if(this==otherObject)	return true;
		
		if(otherObject==null)	return false;
		
		if(getClass()!=otherObject.getClass())	return false;
		
		Employee other=(Employee) otherObject;
		
		return salary==other.salary&&Objects.equals(hireday, other.hireday)&&this.name==other.name();
		
		
	}
	
	public String toString()
	{
		return getClass().getName()+"[name="+name+" salary="+salary+" hireDay="+hireday+"]";
	}
	
	
	//接口实现
	@Override
	public int compareTo(Employee o) {

		return Double.compare(salary, o.salary);
	}
	
	
	
}