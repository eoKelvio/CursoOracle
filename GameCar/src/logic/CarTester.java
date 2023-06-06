package logic;

public class CarTester {

	public static void main(String[] args) {
		
		Car c1 = new Car("red",5,5,5,5);
		c1.accelerate();
		c1.accelerate(-8);
		System.out.println(c1.getSpeed());
		
	}

}
