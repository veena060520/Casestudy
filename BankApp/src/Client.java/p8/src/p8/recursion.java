package p8;

public class recursion {

	public static void main(String[] args) {
		int num=123456,reverse=0;
		while(num!=0)
		{
			int remainder =num % 10;
			reverse =reverse *10+remainder;
			num=num/10;
			
		}
        System.out.println("The reverse of the given num is:" +reverse);
	}

}
