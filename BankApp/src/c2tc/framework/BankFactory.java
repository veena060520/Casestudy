package c2tc.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accno,String accname,float accbalance);
	 public CurrentAcc getNewCurrentAccount(int accno,String accname,float accbalance);
}

