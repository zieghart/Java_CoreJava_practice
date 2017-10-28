package A6_Thread;


import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//逻辑不用看,就看注释.

public class A3_ReentrantLock_Bank{
		   public static final int NACCOUNTS = 100;
		   public static final double INITIAL_BALANCE = 1000;
		   public static final double MAX_AMOUNT = 1000;
	
		   
		   public static void main(String[] args)
		   {
		      Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
		      for (int i = 0; i < NACCOUNTS; i++)
		      {
		         int fromAccount = i;
		         Runnable r = () -> {//线程
		            try
		            {
		               while (true)
		               {
		                  int toAccount = (int) (bank.size() * Math.random());
		                  double amount = MAX_AMOUNT * Math.random();
		                  bank.transfer(fromAccount, toAccount, amount);
		                  
		               }
		            }
		            catch (InterruptedException e)
		            {
		            }            
		         };
		         Thread t = new Thread(r);
		         t.start();
		      }
		   }
}
	
class Bank {
	private final double[] accounts;
	private Lock bankLock;
	private Condition sufficientFunds;			//条件变量_资金充足
	
	
	public Bank(int n,double initiaBanlance){
		accounts=new double[n];
		Arrays.fill(accounts,initiaBanlance);
		bankLock = new ReentrantLock();			//创建锁
		sufficientFunds=bankLock.newCondition();//初始化条件变量
	}

	public void transfer(int from,int to,double amount)throws InterruptedException
	{
		bankLock.lock();
		try{
			while(accounts[from]<amount)		
				sufficientFunds.await();		//堵塞本线程
			
			System.out.print(Thread.currentThread());
			accounts[from]-=amount;
			System.out.printf(" %10.2f from %d to %d",amount,from,to);
			accounts[to]+=amount;
			System.out.printf("   Total : %10.2f %n",getTotalBalance());
			Thread.sleep(2000);
			
			sufficientFunds.signalAll();		//signall,释放其它线程
		}
		finally{
			bankLock.unlock();
		}
	}

	public double getTotalBalance(){
		bankLock.lock(); 				//调用它的人lock了,他也要lock
		try{
			double sum=0;
			for(double a:accounts)
				sum+=a;
			
			return sum;
			
		}
		finally{
			bankLock.unlock();
		}
		
		
	}
	
	public int size(){
		return accounts.length;
	}
	
	
	
	
	
		

}
