package com.chirag.ib.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HotelBookingsPossible {

	static enum EventType
	{
		DEPART,
		ARRIVE
	}
	
	static class BookingEvent implements Comparable<BookingEvent>
	{
		int day;
		EventType event;
		
		public BookingEvent(int day, EventType event)
		{
			this.day = day;
			this.event = event;
		}

		public int compareTo(BookingEvent o)
		{
			int res = Integer.compare(this.day, o.day);
			return res!=0 ? res : this.event.compareTo(o.event);
		}
		
		public String toString()
		{
			return "[" + this.day + ", " + this.event + "]";
		}
	}
	
	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K)
	{
		if(arrive==null || depart==null || arrive.size()!=depart.size())
			return false;
		
		int noOfBookings = arrive.size();
		ArrayList<BookingEvent> bookingEvents = new ArrayList<BookingEvent>(arrive.size());
		for(int i=0; i<noOfBookings; i++)
		{
			bookingEvents.add(new BookingEvent(arrive.get(i), EventType.ARRIVE));
			bookingEvents.add(new BookingEvent(depart.get(i), EventType.DEPART));
		}
			
		Collections.sort(bookingEvents);
		
		int curSimulntaneousBookings = 0;
		int bookingEventsSize = bookingEvents.size();
		
		for(int i=0; i<bookingEventsSize; i++)
		{
			if(bookingEvents.get(i).event.equals(EventType.ARRIVE))
				curSimulntaneousBookings++;
			else
				curSimulntaneousBookings--;
			
			if(curSimulntaneousBookings>K)
				return false;
		}
		
		return true;
	}
	
	/*public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K)
	{
		if(arrive==null || depart==null || arrive.size()!=depart.size())
			return false;
		
		int noOfBookings = arrive.size();
		int[] bookingsCount = new int[10];
		
		for(int i=0; i<noOfBookings; i++)
		{
			if(bookingsCount.length<depart.get(i)+1)
				bookingsCount = Arrays.copyOf(bookingsCount, depart.get(i)+1);
			
			for(int j=arrive.get(i); j<depart.get(i); j++)
				bookingsCount[j]++;
		}
		
		for (Integer bookingCount : bookingsCount)
		{
			if(bookingCount>K)
				return false;
		}
		
		return true;
	}*/
	
	public static void main(String[] args)
	{
		HotelBookingsPossible obj = new HotelBookingsPossible();
		
		ArrayList<Integer> arrive = new ArrayList<Integer>(Arrays.asList(1, 3, 5));
		ArrayList<Integer> depart = new ArrayList<Integer>(Arrays.asList(3, 6, 8));
		System.out.println(obj.hotel(arrive, depart, 1));
		
		arrive = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
		depart = new ArrayList<Integer>(Arrays.asList(2, 6, 6, 6, 8));
		System.out.println(obj.hotel(arrive, depart, 3));
		
		arrive = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		depart = new ArrayList<Integer>(Arrays.asList(10, 2, 6, 14));
		System.out.println(obj.hotel(arrive, depart, 2));
	}

}
