package Lesson27;

public class Laptop extends Device {

	@Override

	void turnOn() {
		System.out.println("Компьютер включён");

	}

	@Override
	void turnOff() {
		System.out.println("Компьютер выключен");

	}
}
