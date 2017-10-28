package H_homework;

import java.util.Scanner;

public class H3_9_素数 {//重点是先思考,再行动
	public static void main(String[] args){
		
		int m,n=0;
		
		Scanner in =new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
		
		//输入上下限要判断下限比上限小!!!!!!!!!!!!!!!
		if(n<m){
			System.out.println("输入的上、下限不正确！");
			System.exit(1);
		}
		
		boolean flag=true;
		
		while(m<=n){
			for(int i=2;i<=(int)Math.sqrt(m);i++)//强制转换,i=2	
					if(m%i==0)flag=false;
	
			if(flag==true)System.out.print(m+"  ");
			flag=true;
			m++;
		}
		in.close();
	
	}

}
