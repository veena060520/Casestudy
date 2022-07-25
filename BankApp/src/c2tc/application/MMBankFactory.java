package c2tc.application;

import c2tc.framework.BankFactory;
import c2tc.framework.CurrentAcc;
import c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno,String accname,float accbalance) {
		SavingAcc sa=new SavingAcc(accno,accname,accbalance);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno,String accname,float accbalance) {
		CurrentAcc ca=new CurrentAcc(accno,accname,accbalance);
		return ca;
	}
}
