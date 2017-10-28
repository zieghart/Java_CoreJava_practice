package A7_CoreJava_supplement;

import java.io.*;
import java.io.IOException;
import java.nio.channels.FileLock;

public class A1_FileIO {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f1=new File("src\\FileTest\\dream.txt");
		System.out.println("[" +f1.getName()+"]'s path: "+f1.getPath());
		
		//FileReader-�ַ���
		FileWriter out=new FileWriter(f1);
		FileReader in=new FileReader(f1);
		
		char[] a="�����Ǹ��ı����������".toCharArray();
		for(int i=0;i<a.length;i++){
			a[i]=(char) (a[i]^'7');						//λ�������
		}
		
		out.write(a,0,10);								//д���ļ�,һ��Ҫclose
		out.write(a,0,10);			
		out.close();
		
		char[] temp=new char[10];						//��ȡ�ļ�.
		while((in.read(temp,0,10))!=-1)
			System.out.println(temp);
		in.close();
		
		
		//BufferedReader-������-��ȡһ��,�̳������Ǹ�
		FileWriter out_=new FileWriter("src\\FileTest\\dream.txt");
		BufferedWriter out2=new BufferedWriter(out_);
		
		FileReader in_=new FileReader("src\\FileTest\\dream.txt");
		BufferedReader in2=new BufferedReader(in_);
		
		out2.write("�����Ǹ��ܸı����������");				//д��һ��
		out2.newLine();
		out2.close();
		
		System.out.println(in2.readLine());				//��ȡһ��
		in2.close();
	
		
		//RandomAccessFile-��ǿ����,��д��,readLineҪת��P307
		//���Զ�λ������ȥ,���ҿ���ָ��r����rw
		
		//DataInputStream-������- ���Բ����ֽڶ�ȡ��������,����û��nextLine
		
		//�ļ���,����IO�������ò���.
		RandomAccessFile input=new RandomAccessFile("src\\FileTest\\dream.txt","rw");
		FileLock lock=input.getChannel().tryLock();		//������
		Thread.sleep(500000);		
		lock.release(); 								//����
		
		
		
	}

}
