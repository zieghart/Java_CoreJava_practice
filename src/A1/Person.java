package A1;

public abstract class Person {
	
	private String sex;
	
	public Person(String sex)
	{
		this.sex=sex;
	}
	
	public String sex()
	{
		return sex;
	}
	
	public abstract String getDescription();
	

}
