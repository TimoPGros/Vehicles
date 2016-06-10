package Vehicles;

public class Car implements Vehicle {
	private int doors, seats, speed, kilometers;
	Color color;
	String brand;

	public Car(int doors, int seats, int speed, Color color, String brand) {
		this.doors = doors;
		this.seats = seats;
		this.speed = speed;
		this.color = color;
		this.brand = brand;
		this.kilometers = 0;
	}
 
	public String getBrand() {
		return this.brand;
	}

	public int getDoors() {
		return doors;
	}

	public int getSeats() {
		return seats;
	}

	public int getSpeed() {
		return speed;
	}

	public int getKilometers() {
		return kilometers;
	}

	public Color getColor() {
		return color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car))
			return false;
		Car other = ((Car) obj);
		return (this.doors == other.getDoors() && this.seats == other.getSeats() && this.brand == other.getBrand()
				&& this.speed == other.getSpeed() && this.color.equals(other.getColor()));
	}

	public void drive(int actualKilometers) {
		this.kilometers = this.kilometers + actualKilometers;
	}

	public int mileage() {
		return this.kilometers;
	}

	public void paint(int red, int green, int blue) {
		Color color = new Color(red,blue,green);
		this.color = color;
	}

}
