package com.ideas.interview;

import java.util.function.Predicate;

import com.ideas.interview.domain.model.Product;

public class Barista {

	//private CoffeeType servedCoffee;
	private int milkInLitres;
	private int coffeInGrams;
	private int waterInLitres;
	private int sugarQuantity;
	private int teaQuantity;
	
	
	
	public int getMilkInLitres() {
		return milkInLitres;
	}



	public void setMilkInLitres(int milkInLitres) {
		this.milkInLitres = milkInLitres;
	}



	public int getCoffeInGrams() {
		return coffeInGrams;
	}



	public void setCoffeInGrams(int coffeInGrams) {
		this.coffeInGrams = coffeInGrams;
	}



	public int getWaterInLitres() {
		return waterInLitres;
	}



	public void setWaterInLitres(int waterInLitres) {
		this.waterInLitres = waterInLitres;
	}



	public int getSugarQuantity() {
		return sugarQuantity;
	}



	public void setSugarQuantity(int sugarQuantity) {
		this.sugarQuantity = sugarQuantity;
	}



	public int getTeaQuantity() {
		return teaQuantity;
	}



	public void setTeaQuantity(int teaQuantity) {
		this.teaQuantity = teaQuantity;
	}



	public Barista(int milkInLitres, int coffeInGrams, int waterInLitres, int sugarQuantity,
			int teaQuantity) {
		super();
		this.milkInLitres = milkInLitres;
		this.coffeInGrams = coffeInGrams;
		this.waterInLitres = waterInLitres;
		this.sugarQuantity = sugarQuantity;
		this.teaQuantity = teaQuantity;
	}



	public void serve(Product product) {
		product.prepare();
	}

}
