
public class Animal {
	private double weight;
	String picture;
	
	void eat() {
		System.out.println(" eate()가 호출되었습니다.");
	}
	void sleep() {
		System.out.println(" sleep()가 호출되었습니다.");
	}
}
class Lion extends Animal{
	private int legs = 4;
	void roar() {
		System.out.println(" roar()가 호출되었습니다.");
	}
}
class Eagle extends Animal{
	private int wings = 2;
	void fly() {
		System.out.println(" fly()가 호출되었습니다.");
	}
}
