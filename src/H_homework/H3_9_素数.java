package H_homework;

import java.util.Scanner;

public class H3_9_���� {//�ص�����˼��,���ж�
	public static void main(String[] args){
		
		int m,n=0;
		
		Scanner in =new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
		
		//����������Ҫ�ж����ޱ�����С!!!!!!!!!!!!!!!
		if(n<m){
			System.out.println("������ϡ����޲���ȷ��");
			System.exit(1);
		}
		
		boolean flag=true;
		
		while(m<=n){
			for(int i=2;i<=(int)Math.sqrt(m);i++)//ǿ��ת��,i=2	
					if(m%i==0)flag=false;
	
			if(flag==true)System.out.print(m+"  ");
			flag=true;
			m++;
		}
		in.close();
	
	}

}
