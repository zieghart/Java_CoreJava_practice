package A1;

import java.io.IOException;  //ע�������...��һ��
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class A1_File_IO { //����Ȩ��_��_����

	public static final double PI=3.1415926; //public:�������࿪�� , �ೣ��:�������з�������
	
	public static void main (String[] args) throws IOException//�ļ�IO�ر��쳣
											//����Ȩ��_����ģʽ_����ֵ_����_����
										   //static������ͨ������.������()�ķ�ʽ����,������Ҫ����
										   //main����public������String���� 
	{
	
			//�ļ��������
			Scanner in=new Scanner(Paths.get("src\\A1\\other.txt"),"UTF-8");
			String a=in.next();
			System.out.println(a);
			
			PrintWriter out=new PrintWriter("src\\A1\\other.txt","UTF-8");
			out.println("fuck");
			
			in.close();
			out.close();
	}
	
	
	
	

}
