package c2tc.application;
import c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accname, float accbalance) {
		super(accno, accname, accbalance);
	}

	@Override
	public void deposite(float accbalance) {
		System.out.println("You have balance money after withdraw of accbalance"+accbalance);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getAccno()=" + getAccno() + ", getAccname()="
				+ getAccname() + ", getAccbalance()=" + getAccbalance() + "]";
	}
	

}
