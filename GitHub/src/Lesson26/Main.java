package Lesson26;

public class Main extends Car {
	  public static void main(String[] args) {
	        Car car1 = new Car("Mersedes", "E 63 AMG", 2020);
	        Car car2 = new Car("BMW", "M5", 2018);

	        car1.displayInfo();
	        System.out.println(car1.toString());

	        car2.displayInfo();
	        System.out.println(car2.toString());
	    }
}
