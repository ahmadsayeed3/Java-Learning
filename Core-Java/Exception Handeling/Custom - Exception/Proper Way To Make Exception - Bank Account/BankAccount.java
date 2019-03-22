// Proper Way to Make an Exception

import java.io.*;

class InSufficientFundsException extends Exception{
	private double amount;
	
	public InSufficientFundsException(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}
}

class BankTransaction{
	private double balance;
	private int accountNumber;
	
	public BankTransaction(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public void withdraw(double amount) throws InSufficientFundsException{
		if(amount <= balance){
			balance -= amount;
		}else{
			double needs = (amount - balance);
			throw new InSufficientFundsException(needs);
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
}

public class BankAccount{
	public static void main(String...a){
		BankTransaction bt = new BankTransaction(1402003464);
		
		System.out.println("Depositing $500");
		bt.deposit(500.00);
		
		
		try{
			//for(int i=0; i< )
			System.out.println("\n Withdrawing $100");
			bt.withdraw(100.00);
			System.out.println("\n Withdrawing $200");
			bt.withdraw(200.00);
			System.out.println("\n Withdrawing $200");
			bt.withdraw(400.00);
			
		}catch(InSufficientFundsException e){
			System.out.println("Sorry! But you are shot " + e.getAmount());
			e.printStackTrace();
		}
		
		System.out.println("Program is continue...\nProgram is continue...\nProgram is continue...\n");
	}
}