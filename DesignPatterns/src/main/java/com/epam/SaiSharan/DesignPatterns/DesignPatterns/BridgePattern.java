package com.epam.SaiSharan.DesignPatterns.DesignPatterns;
import java.util.*;
public class BridgePattern extends CostOfGold {
	public static void main(String[] args)
	{
		CostOfGold g= new CostOfGold();
		int myGold=0,choice,numberOffUnits;
		int repeat=1;
		Scanner sc=new Scanner(System.in);
		while(repeat==1)
		{
		System.out.println("Do you want to Sell or Buy Gold(0/1). Enter ) 0 for selling and 1 for buying. ");
		System.out.print("Enter 2 for viewing number of gold coins you have:");
		choice=sc.nextInt();
		System.out.println();
		if(choice==0)
		{
			System.out.println("You have "+myGold+" units of Gold" );
			System.out.print("Enter the number of units you want to sell");
			numberOffUnits=sc.nextInt();
			System.out.println();
			if(numberOffUnits>=myGold)
			{
				g.SellGold(numberOffUnits);
				myGold-=numberOffUnits;
			}
			else
			{
				System.out.println("Sorry, You cannot sell more than "+myGold+" gold units" );
			}
		}
		if(choice==1)
		{
			System.out.print("Enter the number of units you want to buy: ");
			numberOffUnits=sc.nextInt();
			System.out.println();
			myGold+=numberOffUnits;
			g.BuyGold(numberOffUnits);
		}
		if(choice==2)
		{
			System.out.println("You have"+myGold+" units of gold.");
		}
		System.out.print("Do you want to continue?(1/0) : ");
		repeat=sc.nextInt();
		System.out.println();
		}
		sc.close();
	}
}
