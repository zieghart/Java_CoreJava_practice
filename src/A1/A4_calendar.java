package A1;


import java.time.LocalDate;


public class A4_calendar {
	public static void main(String[] args)
	{
		//���1
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		
		//�õ�����ʱ��
		//LocalDate today=LocalDate.of(2017,5,20);
		LocalDate today=LocalDate.now();
		int month=today.getMonthValue();
		
		//ת����һ��	
		int int_today=today.getDayOfMonth();
		today=today.minusDays(int_today-1);
		
		//���ݵ�һ�����ڼ���ӡ�ո�
		int today_week=today.getDayOfWeek().getValue();
		for(int i=0;i<today_week-1;i++)
			System.out.print("    ");
		
		//���·��ж�ѭ��
		while(today.getMonthValue()==month)
		{
			//��ӡDay����
			int day=today.getDayOfMonth();
			System.out.printf("%3d",day);
			
			//���ǽ���,��ӡ�Ǻ�,����ո�
			if(day==int_today)
				System.out.print("*");
			else
				System.out.print(" ");
			
			//����+1
			today=today.plusDays(1);
			
			//+1������һ,�ʹ�ӡ����
			today_week=today.getDayOfWeek().getValue();
			if(today_week==1)
				System.out.println();
		}
		
	}

}
