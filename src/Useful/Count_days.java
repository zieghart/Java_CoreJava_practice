package Useful;

import java.util.Scanner;

public class Count_days {  //����һ��ҳ��,������ÿ�쿴1~MAXҳ,��ɸ���Ҫ����/����
	
	private static final int PAGES_MAX = 15;

	public static void main(String[] args){
		System.out.println("Please give me the number of pages ");
		Scanner in=new Scanner(System.in);
		while(true){
			
			while(!in.hasNextInt()) {
				System.out.println("������һ��������");
				in.next();
				} 
		
			int a ;
			a=in.nextInt();
			
			System.out.println();
			System.out.print("Pages      ");
			
			for(int i=0;i<PAGES_MAX;i++){
				System.out.printf("%-7d",i+1);
				
			}
					
			
			System.out.println();
			System.out.println();
			System.out.print("Days       ");
			for(int i=0;i<PAGES_MAX;i++){
				System.out.printf("%-7.0f",a*1.0/(i+1));
				
			}
			
			System.out.println();
			System.out.println();
			System.out.print("Month      ");
			for(int i=0;i<PAGES_MAX;i++){
				System.out.printf("%-7.1f",a*1.0/(i+1)/30);
				
			}
			System.out.println();
			System.out.println();
			
		}
	}	

}
