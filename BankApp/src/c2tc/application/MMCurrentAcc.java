package c2tc.application;

import c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accname, float accbalance) {
		super(accno, accname, accbalance);
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public void withdraw(float accbalance) {
		System.out.println("You have balance money after withdraw of accbalance"+accbalance+"with creditlimit"+creditlimit );
		
	}
}

