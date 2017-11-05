package A1;

import java.io.IOException;  //注意这个了...记一记
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class A1_File_IO { //访问权限_类_名字

	public static final double PI=3.1415926; //public:对所有类开放 , 类常量:该类所有方法可用
	
	public static void main (String[] args) throws IOException//文件IO必备异常
											//访问权限_调用模式_返回值_名字_参数
										   //static方法可通过类名.方法名()的方式调用,而不需要对象
										   //main必须public，输入String数组 
	{
	
			//文件输入输出
			Scanner in=new Scanner(Paths.get("src\\A1\\other.txt"),"UTF-8");
			String a=in.next();
			System.out.println(a);
			
			PrintWriter out=new PrintWriter("src\\A1\\other.txt","UTF-8");
			out.println("fuck");
			
			in.close();
			out.close();
	}
	
	
	

}
