package com.epam.SaiSharan.DesignPatterns.DesignPatterns;
import java.util.*;
public class HotelList extends BookHotel {
	Scanner sc=new Scanner(System.in);
	BookHotel bookRoomObject= new BookHotel();
	public void ShowHotels()
	{	
		int d;
		System.out.println("Welcome to the Hotel Booking Portal\n\nThe List Of Premium Hotels are:\n");
		System.out.print("1.Hotel Mythri - 5 Star\n2.Hotel Paradise - 4 Star\n3.Hotel Royal Residency - 5Star\n\nEnter Your Choice :");
		d=sc.nextInt();
		System.out.println("\nHang on a second, We are confirming with our Hotel Partner...\n");
		try {
			switch(d)
			{
			case 1:bookRoomObject.RoomBooking("Hotel Mythri");break;
			case 2:bookRoomObject.RoomBooking("Hotel Paradise");break;
			case 3:bookRoomObject.RoomBooking("Hotel Royal Residency");break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
