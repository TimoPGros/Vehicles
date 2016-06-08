package Vehicles;

public class Bike implements Vehicle {
	private int kilometers;
	private Color color;
	private String brand;

	public Bike(int kilometers, Color color, String brand) {
		this.kilometers = kilometers;
		this.color = color;
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public Color getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public void drive(int actualKilometers) {
		this.kilometers = this.kilometers + actualKilometers;
	}

	@Override
	public int milage() {
		return this.kilometers;
	}

}