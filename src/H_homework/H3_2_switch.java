package H_homework;

import java.util.*;

public class H3_2_switch{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();	//M ���� - -
		
		if(x>100||x<0){
			System.out.println("��������!");
			System.exit(1);//M ����˼��case����ô�ų���Ч������?exit������..
		}
		
		
			
		int y=x/10;
		switch(y){			//M switch����{}�İ�!!
			case 10: System.out.println("����");
				break;
			case 9:  System.out.println("����");
				break;
			case 8:  System.out.println("����");
				break;		
			case 7:  System.out.println("�е�");
				break;			
			case 6:  System.out.println("����");
				break;
                        default:System.out.println("������");//M ���default�Ǵ����������!
		}
				
		in.close();
	}

	

}