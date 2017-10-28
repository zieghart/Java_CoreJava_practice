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
	SMALL("S"),BIG("B"); //�з�����һ��Ҫ����,��һ�д���ʵ��.
	
	private String s;
	private Size(String s){	this.s=s;};
	public String abbreviation(){
		return this.s;
	}
	
	
}