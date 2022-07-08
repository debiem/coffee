package com.ideas.interview;

import com.ideas.interview.domain.model.Product;

public class Controller {
	private final Display display;
	private final Barista barista;
	private CoffeType coffeeType;

	public Controller(Display display, Barista barista) {
		this.display = display;
		this.barista = barista;
		display.show("Please select a coffee type");
	}

	
	public void userWants(CoffeType coffeeType) {
		this.coffeeType = coffeeType;
		display.show("Great Choice!");
	}

	public void dispense(Product p) {
		barista.serve(p);
		display.show("Please collect your delicious coffee");
	}
}
