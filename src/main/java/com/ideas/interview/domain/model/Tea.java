package com.ideas.interview.domain.model;

import java.util.function.Predicate;

import com.ideas.interview.TeaType;

public class Tea implements Product {

	private int teaQuantity;
	private TeaType type;
	private int waterQuantity;
	private int sugarQuantity;
	private int milkQuantity;
	
	public Predicate<Integer> checkQuantity = (quantity) -> quantity > 0;

	public Tea(int teaQuantity, TeaType type, int waterQuantity, int sugarQuantity, int milkQuantity) {
		super();
		this.teaQuantity = teaQuantity;
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



	public int getTeaQuantity() {
		return teaQuantity;
	}

	public void setTeaQuantity(int teaQuantity) {
		this.teaQuantity = teaQuantity;
	}

	public TeaType getType() {
		return type;
	}

	public void setType(TeaType type) {
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
		if(this.type == TeaType.MILK_TEA) {
			if(checkQuantity.test(this.milkQuantity) && checkQuantity.test(this.sugarQuantity) && checkQuantity.test(this.teaQuantity) && checkQuantity.test(this.waterQuantity)) {
				milkQuantity--;
				sugarQuantity--;
				teaQuantity--;
				waterQuantity--;
			} else {
				return "Out of supplies, please refill";
			}
		} else if(this.type == TeaType.BLACK_TEA) {
			if(checkQuantity.test(this.teaQuantity) && checkQuantity.test(this.waterQuantity)) {
				teaQuantity--;
				waterQuantity--;
			} else {
				return "Out of supplies, please refill";
			}
		} else {
			return "We do not serve this product";
		}
		
		return "Preparing tea "+this.type;
	}

}
