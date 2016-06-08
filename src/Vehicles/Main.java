package Vehicles;
public class Main {

	
	public static void main(String[] args){
		Color color = new Color(0, 0, 255);
		Car car = new Car(3, 5, 191, color, "Seat");
		
		System.out.println(car.getKilometers());
		car.drive(11);
		System.out.println(car.getKilometers());
	}
}
