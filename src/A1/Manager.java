package A1;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager(String name,double salary,int year,int month,int day)
	{
		super(name,salary,year,month,day);
		this.bonus=1;
	}
	public Manager()
	{
	}

	public  double salary()
	{
		
		
		return this.bonus+super.salary(); 
	}
	public void setBonus(double bonus)
	{
		this.bonus=bonus;
	}
	
	
	@Override public boolean equals(Object otherObject)
	{
		super.equals(otherObject);
		Manager other =(Manager)otherObject;
		return bonus==other.bonus;
		
	}
	
	public String toString()
	{
		return super.toString()+"[bonus="+bonus+"]";
	}
	
}
