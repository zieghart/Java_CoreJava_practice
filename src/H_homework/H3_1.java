package H_homework;//M1,�ֺ�

import java.util.Scanner;//M2,��������

public class H3_1{						//M3��,��main������д��
public static void main(String[] args){
	Scanner in=new Scanner(System.in);	
	int x;
	int y=0;
	x=in.nextInt();
	if(x<=1)y=x;
	else if(x>1&&x<10)y=3*x-2;			//M ������...����&&��
	else if(x>10)y=4*x;
	//else System.out.println("Error.");

	System.out.println(y);				//M  �ֲ�����y�����ʼ����...
	in.close();							//M���ǹرհ�
	
	}
}