package A1;


import java.time.LocalDate;


public class A4_calendar {
	public static void main(String[] args)
	{
		//输出1
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		
		//得到现在时间
		//LocalDate today=LocalDate.of(2017,5,20);
		LocalDate today=LocalDate.now();
		int month=today.getMonthValue();
		
		//转到第一天	
		int int_today=today.getDayOfMonth();
		today=today.minusDays(int_today-1);
		
		//根据第一天星期几打印空格
		int today_week=today.getDayOfWeek().getValue();
		for(int i=0;i<today_week-1;i++)
			System.out.print("    ");
		
		//以月份判断循环
		while(today.getMonthValue()==month)
		{
			//打印Day属性
			int day=today.getDayOfMonth();
			System.out.printf("%3d",day);
			
			//若是今天,打印星号,否则空格
			if(day==int_today)
				System.out.print("*");
			else
				System.out.print(" ");
			
			//日子+1
			today=today.plusDays(1);
			
			//+1后是周一,就打印换行
			today_week=today.getDayOfWeek().getValue();
			if(today_week==1)
				System.out.println();
		}
		
	}

}
