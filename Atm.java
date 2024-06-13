package bank;

public class Atm {
  int amount=1000;
  synchronized void with_draw(int amount) throws InterruptedException 
  {
	  if(this.amount<amount)
	  {  
		  System.out.println("Insufficient Balance");
		  wait(10000,500);
		  System.out.println("Amount Credited");
		  this.amount-=amount;
		  System.out.println("Withdraw successful \n Balance is: "+this.amount);		  
	  }
	  else
	  {
		  this.amount-=amount;
		  System.out.println("Withdraw successful \n balance is: "+this.amount);
	  }	  
  } 
   synchronized void deposit(int amount)
   {
	   this.amount+=amount;
	   System.out.println("Deposited Successfully \n Balance is: "+this.amount);
   }
}
