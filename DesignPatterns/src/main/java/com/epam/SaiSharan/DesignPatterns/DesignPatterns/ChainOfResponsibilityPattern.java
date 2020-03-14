package com.epam.SaiSharan.DesignPatterns.DesignPatterns;
import java.util.*;
public class ChainOfResponsibilityPattern {
	public static void main(String[] args)
	{
		int repeat=1;
		Scanner sc=new Scanner(System.in);
		HotelList hotelsListObject = new HotelList();
		while(repeat==1)
		{
			hotelsListObject.ShowHotels();
			System.out.print("Do you want to Order Again?(1/0): ");
			repeat=sc.nextInt();
			System.out.println();
		}
		sc.close();
	}
}
