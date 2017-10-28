package A2;



import java.time.LocalDate;


public class Employee implements Cloneable{//�ɿ�¡�ļ���Employee
	//��ʼ��
	private String name;
	private double salary;
	private LocalDate hireday;
	
	//��̬��/ID����
	private static int nextId=0;
	private int id=++nextId;
	
	//������
	public Employee(String name,double salary,int year,int month,int day)
	{
		
		this.name=name;
		this.salary=salary;
		this.hireday=LocalDate.of(year,month,day);
	}	
	//���ع�����
	public Employee(String name,double salary)		
	{
		this(name, salary,1998,5,30);
	}
	//������
	public void raiseSalary(int rate)
	{
		this.salary=this.salary*(1+rate);
	}
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
	public String toString()
	{
		return getClass().getName()+"[name="+name+" salary="+salary+" hireDay="+hireday+"]";
	}
	
	public Employee clone() throws CloneNotSupportedException
	{
		Employee cloned=(Employee)super.clone();
		//cloned.hireday=(Date)hireday.clone();  ��װ��Date
		return cloned;
		
		
	}
	
	
	
}