package c2tc.framework;

public class CurrentAcc extends BankAcc{
	protected final float creditlimit=50;
	public CurrentAcc(int accno, String accname, float accbalance) {
		super(accno, accname, accbalance);
	}
	
	
}
