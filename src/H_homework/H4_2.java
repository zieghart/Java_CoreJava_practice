package H_homework;


public class H4_2{						//toString 要返回字符串= =,不是打印的. 
	public static void main(String[] args){
		Student jack=new Student("Jack");
		Student rose=new Student("Rose");
		jack.atoString();
		rose.atoString();
		jack.changeAge(100);
		jack.atoString();


	}

}

class Student {
	private static int s_Id=1;
	private int id;
	private String name;
	private String sex;
	private int age;
	
	public Student(String name){
		this.id=s_Id;
		this.name=name;
		this.sex="man";
		this.age=18;	
		s_Id++;
		s_Id=1;
	}

	public String getName(){

	return this.name;

	}	
	public int getId(){
		

	return this.id;

	}	
	
	public String getSex(){

	return this.sex;

	}	
	public int getAge(){

	return this.age;

	}	

	public void changeAge(int age){
		
	this.age=age;
	}

	public void atoString(){

	System.out.println(id+" "+name+" "+age+" "+sex);

	}
}