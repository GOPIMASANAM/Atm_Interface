package bank;

public class Machine  extends Atm{

	public static void main(String[] args)
	{
		Atm a=new Atm();
		 Thread wt=new Thread()
		{
			public void run()
			{
				try
				{
					a.with_draw(15000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();					
				}
			}
		};
		 wt.start();
		 Thread dt=new Thread()
		{
			public void run()
			{
				a.deposit(10000);
			}
		};
         dt.start();
	}

}
