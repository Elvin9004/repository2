package Lesson27;

public class Phone  extends Device  {
	@Override

	void turnOn() {
		System.out.println("Телефон включён");

	}

	@Override
	void turnOff() {
		System.out.println("Телефон выключен");

	}
}
