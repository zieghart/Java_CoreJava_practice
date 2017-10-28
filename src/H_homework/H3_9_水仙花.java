package H_homework;

public class H3_9_水仙花 {
	public static void main(String[] args){
		int i=100;
		int a,b,c;
		while(i<=999){
			//重点:抽取各位
	 		a=i%10;
			b=i%100/10;
			c=i/100;
			
			if(i==(a*a*a+b*b*b+c*c*c)){System.out.println(i);}
			
			
			i++;

		}	

	
		
		
	}

}
