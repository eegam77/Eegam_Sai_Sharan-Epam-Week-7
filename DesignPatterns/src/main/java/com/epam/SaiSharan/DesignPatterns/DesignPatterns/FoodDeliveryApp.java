package com.epam.SaiSharan.DesignPatterns.DesignPatterns;

public class FoodDeliveryApp {
	Restaurent restaurentObject = new Restaurent();
	public void OrderFood(String item)
	{
		System.out.println(item+" Order Passed to the Restaurent, Waiting for the Confirmation");
		restaurentObject.TakeOrder(item);
	}
}
