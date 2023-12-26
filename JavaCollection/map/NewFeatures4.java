package day3.map;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NewFeatures4
{
	public static void main(String[] args) 
	{
		LocalDate obj = LocalDate.now();
		System.out.println("Date:- "+obj);
		
		LocalTime obj2 = LocalTime.now();
		System.out.println("Time:- "+obj2);	
			
		LocalDateTime obj3 = LocalDateTime.now();
		System.out.println("Date and Time:- "+obj3);
		
		
		ZoneId zone1 = ZoneId.of("Europe/Paris");
		LocalDateTime obj4 = LocalDateTime.now(zone1);
		System.out.println("Date and Time:- "+obj4);
		
		
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		System.out.println(obj4.format(formate));
		
		
		LocalDate obj5 = LocalDate.of(2021, 1, 1);
		
		Period gap = Period.between(obj, obj5);
		System.out.println(gap);
		
		LocalTime obj6 = LocalTime.of(14, 00);
		
		Duration gap1 = Duration.between(obj6, obj2);
		System.out.println(gap1);
		
		LocalDateTime obj7 = LocalDateTime.of(2000,1,1,10,30);
		Duration gap2 = Duration.between(obj7, obj3);
		System.out.println(gap2);
		
		
	}
}
