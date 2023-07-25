package ITransformAssignmentSecond;

import java.util.ArrayList;
import java.util.List;

abstract class Account{
	
	private String name;
	
	private double balance;
	
    public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public abstract double calculateSalary();
	
	
	
}

class SavingAcc extends Account{
	
	private double deposite;

	public SavingAcc(String name, double balance,double deposite) {
		super(name, balance);
		this.deposite=deposite;
	}

	public double getDeposite() {
		return deposite;
	}

	public void setDeposite(double deposite) {
		this.deposite = deposite;
	}
	
	@Override
	public double calculateSalary() {
		return getBalance()+deposite;
	}
	
	
}

class CurrentAcc extends Account{
	
	private double credit;

	public CurrentAcc(String name, double balance, double credit) {
		super(name, balance);
		this.credit = credit;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	@Override
	public double calculateSalary() {
		return getBalance()+credit;
	}
	
	
}

public class Bank {
	
	private List<Account> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
	}
	
	public void addAccount(Account acc) {
		accounts.add(acc);
	}
	
	public double calculateTotalCashInBank() {
		double totalCash = 0.0;
		for(Account acc : accounts) {
			totalCash+=acc.calculateSalary();
		}
		
		return totalCash;
	}

	public static void main(String[] args) {
		
		SavingAcc acc = new SavingAcc("Diksha", 35000, 400);
		
		CurrentAcc acc1 = new CurrentAcc("Tanu",40000 , 4000);
		
		Bank b = new Bank();
		
		b.addAccount(acc);
		b.addAccount(acc1);

		System.out.println(acc.calculateSalary());
		
		System.out.println(acc1.calculateSalary());
		
		double totalCash = b.calculateTotalCashInBank();
		
		System.out.println(totalCash);
	}
}

