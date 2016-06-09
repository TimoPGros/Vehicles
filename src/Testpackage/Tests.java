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
	public void ColorNegTestBlue() {
		Color color1 = new Color(300, 300, 300);
		Color color2 = new Color(-1,-1,-1);
		assertTrue("acceptet negative blue value", color2.getBlue() >= 0);
		assertFalse("acceptet too high blue value", color1.getBlue() > 255);
	}
	
	@Test
	public void testBikeColor(){
		assertEquals(bike.getColor().getRed(), color.getGreen());
		assertEquals(bike.getColor().getBlue(), color.getBlue());
	}
	
	@Test
	public void testBikePaint(){
	    bike.paint(255, 0, 255);
	    assertEquals(bike.getColor(), testColor);
	    
	}
	
	@Test
	public void testCarPaint(){
	    car.paint(255, 0, 255);
	    assertEquals(car.getColor(), testColor);	    
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
