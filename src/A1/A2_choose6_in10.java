package A1;

import java.util.Arrays;
import java.util.Random;

public class A2_choose6_in10 {
	
	public static void main(String[] args)
	{
		//��������
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
			arr[i]=i+1;
		System.out.println(Arrays.toString(arr));
		
		int[] arr2=new int[6];
		int number=0;
		while(number!=6){

			int temp=(int)(Math.random()*(10-number));
			//��һ
			arr2[number]=arr[temp];
			
			//ѹ��
			arr[temp]=arr[9-number];
			
			
			number++;
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		//if(!Arrays.equals(arr,arr2))
		//	System.out.println("yes");

	}

	
	
}
