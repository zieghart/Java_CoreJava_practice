package H_homework;//M1,分号

import java.util.Scanner;//M2,包别忘了

public class H3_1{						//M3糙,你main方法忘写了
public static void main(String[] args){
	Scanner in=new Scanner(System.in);	
	int x;
	int y=0;
	x=in.nextInt();
	if(x<=1)y=x;
	else if(x>1&&x<10)y=3*x-2;			//M 我他妈...这是&&啊
	else if(x>10)y=4*x;
	//else System.out.println("Error.");

	System.out.println(y);				//M  局部变量y必须初始化啊...
	in.close();							//M还是关闭吧
	
	}
}