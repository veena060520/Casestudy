package c2tc.framework;

public class BankAcc {
	private int accno;
	private String accname;
	private float accbalance;
	
	public BankAcc(int accno, String accname, float accbalance) {
		this.accno = accno;
		this.accname = accname;
		this.accbalance = accbalance;
	}
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public float getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(float accbalance) {
		this.accbalance = accbalance;
	}
	
	public void withdraw(float accbalance) 
	{
		System.out.println("The accbalance of the withdraw is"+accbalance);
	}
	public void deposite(float accbalance) 
	{
		System.out.println("The accbalance of the deposite is"+accbalance);
	}

	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accname=" + accname + ", accbalance=" + accbalance + "]";
	}
	
	
	}
