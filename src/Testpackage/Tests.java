package Testpackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Vehicles.Bike;
import Vehicles.Car;
import Vehicles.Color;

public class Tests {
	Color color;
	Car car;
	Bike bike;
	Color testColor;
	
	@Before
	public void setUp() throws Exception {
		color = new Color(0,0,255);
		car = new Car(3, 5, 191, color, "Seat");
		bike = new Bike(color, "Northwave");
		testColor = new Color(255,0,255);
	}

	@Test
	public void EqualCars(){
		Car car2 = new Car(3,5,191,color, "Seat");
		assertEquals("Cars should be equal",car,car2);
	}
	
	@Test
	public void EqualBikes(){
		Bike bike2=new Bike(color, "Northwave");
		assertEquals("Bikes should be equal",bike ,bike2);
	}
	
	@Test
	public void ColorNegTestBlue() {
		Color color1 = new Color(300, 300, 300);
		Color color2 = new Color(-1,-1,-1);
		assertTrue("accepted negative blue value", color2.getBlue() >= 0);
		assertFalse("accepted too high blue value", color1.getBlue() > 255);
	}
	
	@Test
	public void testBikeColor(){
		assertEquals("Color (Red) is not equal" ,bike.getColor().getRed(), color.getRed());
		assertEquals("Color (Blue) is not equal" ,bike.getColor().getBlue(), color.getBlue());
	}
	
	@Test
	public void testBikePaint(){
	    bike.paint(255, 0, 255);
	    assertEquals(bike.getColor(), testColor);
	    
	}
	
	@Test
	public void testCarPaint(){
	    car.paint(255, 0, 255);
	    assertEquals("Car should have this color by now",car.getColor(), testColor);	    
	}	
	
	@Test
	public void testDriveNegative(){
		try{
		car.drive(-10);
		fail("Can't drive negative kilometers");
		}
		catch (Exception e){};
	}
	
	
	@Test
	public void testDrivePositive(){
		int kilometers = car.getKilometers();
		int way = 11;
		car.drive(way);
		assertTrue(kilometers+way == car.getKilometers());
	}
	
	

	
}
