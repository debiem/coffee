package com.ideas.interview.domain.model;

import java.util.function.Predicate;

import com.ideas.interview.CoffeType;

public class Coffee implements Product {

	private int coffeeQuantity;
	private CoffeType type;
	private int waterQuantity;
	private int sugarQuantity;
	private int milkQuantity;
	
	public Predicate<Integer> checkQuantity = (quantity) -> quantity > 0;

	public Coffee(int coffeeQuantity, CoffeType type, int waterQuantity, int sugarQuantity, int milkQuantity) {
		super();
		this.coffeeQuantity = coffeeQuantity;
		this.type = type;
		this.waterQuantity = waterQuantity;
		this.sugarQuantity = sugarQuantity;
		this.milkQuantity = milkQuantity;
	}
	
	

	public int getMilkQuantity() {
		return milkQuantity;
	}



	public void setMilkQuantity(int milkQuantity) {
		this.milkQuantity = milkQuantity;
	}



	public int getCoffeeQuantity() {
		return coffeeQuantity;
	}

	public void setCoffeeQuantity(int coffeeQuantity) {
		this.coffeeQuantity = coffeeQuantity;
	}

	public CoffeType getType() {
		return type;
	}

	public void setType(CoffeType type) {
		this.type = type;
	}

	public int getWaterQuantity() {
		return waterQuantity;
	}

	public void setWaterQuantity(int waterQuantity) {
		this.waterQuantity = waterQuantity;
	}

	public int getSugarQuantity() {
		return sugarQuantity;
	}

	public void setSugarQuantity(int sugarQuantity) {
		this.sugarQuantity = sugarQuantity;
	}

	@Override
	public String prepare() {
		if(this.type == CoffeType.BLACK_COFFEE) {
			if(checkQuantity.test(this.coffeeQuantity) && checkQuantity.test(this.waterQuantity)) {
				coffeeQuantity--;
				waterQuantity--;
			} else {
				return "Out of supplies, please refill";
			}
		} else if(this.type == CoffeType.MILK_COFFEE) {
			if(checkQuantity.test(this.coffeeQuantity) && checkQuantity.test(this.waterQuantity) && checkQuantity.test(this.milkQuantity) && checkQuantity.test(this.sugarQuantity)) {
				coffeeQuantity--;
				waterQuantity--;
				milkQuantity--;
				sugarQuantity--;
			} else {
				return "Out of supplies, please refill";
			}
		} else {
			return "We do not serve this product";
		}
		
		return "Preparing Coffee "+this.type;
	}

}
