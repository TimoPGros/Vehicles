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
		return kilometers;
	}

	public Color getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public void drive(int actualKilometers) {
		this.kilometers = this.kilometers + actualKilometers;
	}

	public int milage() {
		return this.kilometers;
	}

	public void paint(int red, int green, int blue) {
		Color color = new Color(red,green,blue);
		this.color = color;
	}

}