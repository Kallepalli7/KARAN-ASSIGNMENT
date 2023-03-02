package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("APPLIED BREAK");
	}
	public void soundHorn() {
		System.out.println("HORN");
	}
	public static void main(String[] args) {
		Car car=new Car();
		car.applyBreak();
		car.soundHorn();
		System.out.println();
	}
}
