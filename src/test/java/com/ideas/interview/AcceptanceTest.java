package com.ideas.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.ideas.interview.domain.model.Coffee;
import com.ideas.interview.domain.model.Product;

public class AcceptanceTest {

	private Controller controller;
	private Display display;
	private Barista barista;

	/*
	 * @Test public void dispenseBlackCoffeeForFree() {
	 * System.out.println("Running test"); powerUp();
	 * assertEquals("Please select a coffee type", display.currentMessage());
	 * userWants(CoffeeType.BLACK); assertEquals("Great Choice!",
	 * display.currentMessage()); controller.dispense();
	 * assertEquals(CoffeeType.BLACK, barista.servedCoffee());
	 * assertEquals("Please collect your delicious coffee",
	 * display.currentMessage()); }
	 * 
	 * @Test public void testDispensingRepeatedly() {
	 * System.out.println("Running test"); powerUp();
	 * assertEquals("Please select a coffee type", display.currentMessage());
	 * userWants(CoffeeType.BLACK); assertEquals("Great Choice!",
	 * display.currentMessage()); for(int i =0 ; i < 12 ; i++) {
	 * controller.dispense(); } assertEquals(CoffeeType.BLACK,
	 * barista.servedCoffee()); assertEquals("Please collect your delicious coffee",
	 * display.currentMessage()); }
	 * 
	 * private AcceptanceTest userWants(CoffeeType coffeeType) {
	 * controller.userWants(coffeeType); return this; }
	 */

	@Test
	public void testVendingMachineForCoffee() {
		powerUp();
		Product p = new Coffee(barista.getCoffeInGrams(), CoffeType.MILK_COFFEE, barista.getWaterInLitres(), barista.getSugarQuantity(), barista.getMilkInLitres());
		assertEquals("Preparing Coffee "+CoffeType.MILK_COFFEE, p.prepare());
	}

	private void powerUp() {
		display = new Display();
		barista = new Barista(10, 10, 10, 10, 10);
		controller = new Controller(display, barista);
	}
}
