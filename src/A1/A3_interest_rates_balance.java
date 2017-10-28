package A1;

public class A3_interest_rates_balance {
	
	public static void main(String[] args)
	{
		//�������ʱ�
		double[] rate={1.1,1.11,1.12,1.13,1.14,1.15};
		
		//���1
		for(double element:rate)
			System.out.printf("%-2.0f%%       ",(element-1)*100);
		System.out.println();
		
		//�����˵���ά����,���2
		double[][] balance=new double[10][6];
		for(int i=0;i<balance[0].length;i++)
		{
			balance[0][i]=10000;
			System.out.printf("%-10.2f",balance[0][i]);
		}
		System.out.println();
		
		//Ƕ��ѭ����ֵ,���3
		for(int i=1;i<balance.length;i++)
		{
			for(int j=0;j<balance[0].length;j++)
			{
				balance[i][j]=balance[i-1][j]*rate[j];
				System.out.printf("%-10.2f",balance[i][j]);
			}
			System.out.println();
		}
	}
}
