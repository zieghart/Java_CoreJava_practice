package A2;

public class A2_enum {
	
	public static void main(String[] args)
	{
		String s="SMALL";
		Size a=Enum.valueOf(Size.class, s);
		Size b=Size.SMALL;
		
		System.out.println(a.toString());
		System.out.println(b.abbreviation());
	}

}

enum Size{
	SMALL("S"),BIG("B"); //有方法就一定要定义,第一行创建实例.
	
	private String s;
	private Size(String s){	this.s=s;};
	public String abbreviation(){
		return this.s;
	}
	
	
}