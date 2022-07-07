package com.ideas.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AcceptanceTest {

	private Controller controller;
	private Display display;
	private Barista barista;

	@Test
	public void dispenseBlackCoffeeForFree() {
		powerUp();
		assertEquals("Please select a coffee type", display.currentMessage());
		userWants(CoffeeType.BLACK);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(CoffeeType.BLACK, barista.servedCoffee());
		assertEquals("Please collect your delicious coffee", display.currentMessage());
	}

	private AcceptanceTest userWants(CoffeeType coffeeType) {
		controller.userWants(coffeeType);
		return this;
	}

	private void powerUp() {
		display = new Display();
		barista = new Barista();
		controller = new Controller(display, barista);
	}
}
