package com.lq.test;

public class MethodHead {

	public MethodHead() {
		
	}
	
	public String dataTypes() {
		int width, area, height;
		double radius = 10.0;
		double pi = 3.14;
		boolean result = true;
		
		width = 8;
		height = 12;
		area = 96;
		
		return "\nThe value of width is " + width + "\nThe value of height is " + height + "\nThe value of area is " + area +
				"\nThe value of radius is " + radius + "\nThe value of pi is " + pi + "\nThe value of result is " + result;
	}
	
	public void arrays() {
		int [] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		for(int i = 0; i < months.length; i++) {
			System.out.println(months[i] + " has " + daysInMonths[i] + " days.");
		}
	}
}
