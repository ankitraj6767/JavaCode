package com.blueYonder.day09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CaluclateBetweenDates {
	
	
	public static String Calculator(String date1, String date2) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate startDate= LocalDate.parse(date1,formatter);
			LocalDate endDate= LocalDate.parse(date2,formatter);
			
			long differenceInDays=Math.abs(endDate.toEpochDay()-startDate.toEpochDay())+1;
			
			return differenceInDays +" "+(differenceInDays==1 ?"day": "days");
			
					
		} catch (Exception e) {
			return "Invalid Date";
		}
		
		
	}

}
