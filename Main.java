package com.pizza;

public class Main {
	private static boolean veg;
	//private static boolean veg;

	public static void main(String args[]) {
		//Pizza basePizza = new Pizza(veg=false);
		//basePizza.addExtraCheese();
		//basePizza.addExtraToppigs();
		//basePizza.TakeAway();
		//basePizza.getBill();
	
	DeluxPizza dp = new DeluxPizza(veg= false);
	dp.addExtraCheese();
	dp.addExtraToppings();
	dp.TakeAway();
	dp.getBill();
	}	
}

