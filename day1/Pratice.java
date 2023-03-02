package week1.day1;

public class Pratice {
	int regNo=12345;
	public void applybreak() {
		String colour="Blue";
		System.out.println("BREAK");
		System.out.println(colour);
	}
public void sournHorn() {
	System.out.println("sound");
}
void type() {
	System.out.println("default");
}
public static void main(String[] args) {
	Pratice par=new Pratice();
	par.applybreak();
	par.sournHorn();
	System.out.println(par.regNo);
	System.out.println("KARAN");
}
}
