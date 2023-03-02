package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int i=4;
	boolean flag=false;
	for (int k1 = 2; k1 <=i/2; k1++) {
		if (i%k1 == 0) {
		flag =true;
		break;
	}
	}
	if(flag)
	{
		System.out.println("NOT A PRIME ");
	}
	else
	{
		System.out.println("ITS PRIME");
	}
}
}
  