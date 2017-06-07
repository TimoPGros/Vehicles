package Vehicles;

public class Bike implements Vehicle {
	private int kilometers;
	private Color color;
	private String brand;

	public Bike(Color color, String brand) {
		this.kilometers = 0;
		this.brand = brand;
	}

	public int getKilometers() {
		return this.kilometers;
	}

	public Color getColor() {
		return this.color;
	}

	public String getBrand() {
		return this.brand;
	}

	public void drive(int actualKilometers) {
		this.kilometers = this.kilometers + actualKilometers;
	}

	public int mileage() {
		return this.kilometers;
	}

	public void paint(int red, int green, int blue) {
		Color color = new Color(red,green,blue);
		this.color = color;
	}

}