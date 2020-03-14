package com.epam.SaiSharan.DesignPatterns.DesignPatterns;

public class SingletonImplementation {
    private static SingletonImplementation single_instance=null; 

	public static SingletonImplementation SingletonImplementation() 
    { 
        // To ensure only one instance is created 
        if (single_instance == null) 
        { 
            single_instance = new SingletonImplementation(); 
            System.out.println("An object has been created to your singleton class");
        } 
        else
        {
        	System.out.println("An object is already existing for your singleton class. You can create only one object!!!");
        }
        return single_instance; 
    } 
}
