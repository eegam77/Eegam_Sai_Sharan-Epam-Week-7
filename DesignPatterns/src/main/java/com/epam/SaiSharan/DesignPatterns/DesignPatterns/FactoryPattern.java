package com.epam.SaiSharan.DesignPatterns.DesignPatterns;

public class FactoryPattern extends FactoryPatternImplementation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This class implements FactoryPatternImplementation class. We can use tits properties and create a new vehicle.");
		FactoryPattern object=new FactoryPattern();
		
		object.horsePower=3.6;
		object.vehicletype="Geared";
		object.vehicleName="Maruti Swift";
		object.wheeleCount=4;
		System.out.println("The wehicle type is:"+object.vehicletype+"\n"+"Vehicle name is:"+object.vehicleName+"\n"+"number of Wheels: "+object.wheeleCount+"\nHorse  power:"+object.horsePower);
		
	}

}
