package c2tc.framework;
 public class SavingAcc extends BankAcc{
	 public SavingAcc(int accno, String accname, float accbalance) {
		super(accno, accname, accbalance);
		// TODO Auto-generated constructor stub
	}

	private   static boolean isSalary=true;
	 
	 public static boolean isSalary() {
		return isSalary;
	}

       public static void setSalary(boolean isSalary) {
		SavingAcc.isSalary = isSalary;
	}

    @Override
	public String toString() {
		return "SavingAcc[getAccno()=" + getAccno()+ ", getAccname()=" + getAccname() + ", getAccbalance()="+ getAccbalance()+"]";
    }
 }
