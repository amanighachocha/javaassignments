
public class Account {
	private int accountNumber;
	private double balance = 0.0;
	
	public Account(int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber(){
		return this.accountNumber;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void credit(double amount){
		this.balance += amount;
	}
	
	public void debit(double amount){
		if(balance >= amount){
			this.balance -= amount;
		}else{
			System.out.println("Amount withdrawn exceeds the current balance!");
		}
	}
	
	public String toString(){
		return "A/C no:"+this.accountNumber+", Balance=$"+this.balance;
	}

}
