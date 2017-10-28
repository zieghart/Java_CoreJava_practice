package H_homework;

import java.util.*;

public class H3_2_switch{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();	//M 括号 - -
		
		if(x>100||x<0){
			System.out.println("输入有误啊!");
			System.exit(1);//M 你在思考case里怎么排除无效数据吗?exit就行了..
		}
		
		
			
		int y=x/10;
		switch(y){			//M switch是有{}的啊!!
			case 10: System.out.println("优秀");
				break;
			case 9:  System.out.println("优秀");
				break;
			case 8:  System.out.println("良好");
				break;		
			case 7:  System.out.println("中等");
				break;			
			case 6:  System.out.println("及格");
				break;
                        default:System.out.println("不及格");//M 这个default是代表其余情况!
		}
				
		in.close();
	}

	

}