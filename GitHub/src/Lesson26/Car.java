package Lesson26;

public class Car {

	    String brand;
	    String model;
	    int year;

	    public Car(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    public void displayInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }

	    @Override
	    public String toString() {
	        return "Car {Brand - " + brand + ", Model - " + model + ", Year - " + year + "}";
	    }

	
	}


