package A7_CoreJava_supplement;

import java.io.*;
import java.io.IOException;
import java.nio.channels.FileLock;

public class A1_FileIO {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File f1=new File("src\\FileTest\\dream.txt");
		System.out.println("[" +f1.getName()+"]'s path: "+f1.getPath());
		
		//FileReader-字符流
		FileWriter out=new FileWriter(f1);
		FileReader in=new FileReader(f1);
		
		char[] a="张鎏是个改变世界的男人".toCharArray();
		for(int i=0;i<a.length;i++){
			a[i]=(char) (a[i]^'7');						//位运算加密
		}
		
		out.write(a,0,10);								//写入文件,一定要close
		out.write(a,0,10);			
		out.close();
		
		char[] temp=new char[10];						//读取文件.
		while((in.read(temp,0,10))!=-1)
			System.out.println(temp);
		in.close();
		
		
		//BufferedReader-缓冲流-读取一行,继承上面那个
		FileWriter out_=new FileWriter("src\\FileTest\\dream.txt");
		BufferedWriter out2=new BufferedWriter(out_);
		
		FileReader in_=new FileReader("src\\FileTest\\dream.txt");
		BufferedReader in2=new BufferedReader(in_);
		
		out2.write("张鎏是个能改变世界的男人");				//写入一行
		out2.newLine();
		out2.close();
		
		System.out.println(in2.readLine());				//读取一行
		in2.close();
	
		
		//RandomAccessFile-更强的流,不写了,readLine要转码P307
		//可以定位定来定去,而且可以指定r或者rw
		
		//DataInputStream-数据流- 可以不管字节读取数据类型,好像没有nextLine
		
		//文件锁,部分IO流好像用不了.
		RandomAccessFile input=new RandomAccessFile("src\\FileTest\\dream.txt","rw");
		FileLock lock=input.getChannel().tryLock();		//加锁了
		Thread.sleep(500000);		
		lock.release(); 								//解锁
		
		
		
	}

}
