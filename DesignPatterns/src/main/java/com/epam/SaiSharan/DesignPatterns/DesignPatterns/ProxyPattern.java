package com.epam.SaiSharan.DesignPatterns.DesignPatterns;
import java.util.*;
public class ProxyPattern {
	public static void main(String[] args)
	{
		FoodDeliveryApp orderObject = new FoodDeliveryApp();
		int repeat=1;
		Scanner sc=new Scanner(System.in);
		while(repeat==1)
		{
		System.out.println("Welcome to the Food Delivery App\n");
		System.out.print("1.Biryani\n2.Fried Rice\n3.Noodles\nSelect the food item : ");
		
		int choice;
		System.out.println();
		choice=sc.nextInt();
		try {
		switch(choice)
		{
		case 1:orderObject.OrderFood("Biryani");break;
		case 2:orderObject.OrderFood("Fried Rice");break;
		case 3:orderObject.OrderFood("Noodles");break;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.print("Do you want to Order again?(1/0): ");
		repeat=sc.nextInt();
		}
		sc.close();
	}
}
