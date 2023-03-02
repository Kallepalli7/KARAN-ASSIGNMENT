package week1.day1;

public class Mobilephone {
	
	private void makeCall(String s,float f) {
		
		
		System.out.println("makeCall");
		System.out.println("My moble model"+s);
		System.out.println("My mobile weight"+f);

	}
private void makeCall(String s,double f) {
		
		
		System.out.println("makeCall");
		System.out.println("My moble model "+s);
		System.out.println("My mobile weight"+f);

	}
	
	private void sendMsg(boolean b,int i) {
		System.out.println("sendMsg");
		System.out.println("My mobile charged"+b);
		System.out.println("My mobile cost"+i);
	}                         

	public static void main(String[] args) {
		
		Mobilephone m1=new Mobilephone();
		
		m1.makeCall("Samsung", 3.0d);
		m1.sendMsg(false, 10000);
		m1.sendMsg(true, 10000);
m1.makeCall("samsung", 4.0f);
		
		
	}

}
