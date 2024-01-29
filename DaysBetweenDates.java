package com.blueYonder.day09;

import java.util.Scanner;

public class DaysBetweenDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first date (YYYY-MM-DD): ");
		String date1= sc.next();
		System.out.println("Enter the second date (YYYY-MM-DD): ");
		String date2= sc.next();
		//CaluclateBetweenDates dates= new CaluclateBetweenDates();
		
		String res=CaluclateBetweenDates.Calculator(date1, date2);
		System.out.println(res);
		sc.close();

	}

}
