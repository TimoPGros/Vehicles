package Testpackage;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Vehicles.Car;
import Vehicles.Color;

public class Tests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void ColorNegTestBlue() {
		Color color = new Color(300, 300, 300);
		assertTrue("acceptet negative blue value", color.getBlue() >= 0);
		assertTrue("acceptet too high blue value", color.getBlue() < 256);
	}

}
