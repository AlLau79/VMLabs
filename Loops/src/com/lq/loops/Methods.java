package com.lq.loops;

public class Methods {
	
	public Methods() {
		
	}
	
	public String daysOfWeek() {
		
		String [] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		
		for (int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		
		for (String x : days) {
			System.out.println(x);
		}
		
		for (int j = days.length-1; j >= 0; j--) {
			System.out.println(days[j]);
		}
		return "";
	}
	
	public void whileLoop() {
		int n = 1;
		while(n <= 20) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
			n++;
		}
	}
	
	public void forLoop() {
		for (int i = 1; i <= 100; i++) {
			if(i < 50 || i > 60) {
				System.out.println(i);
			}
		}
	}
	
	public void switchThis() {
		int i = 1;
		String [] months = {"", "Jan", "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		while(i <= 12) {
			
			switch(i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31");
				break;
			case 4,6,9,11:
				System.out.println("30");
				break;
			case 2:
				System.out.println("28");
				break;
			default:
				System.out.println("YEET");
			}
			i++;
		}
	}
	
	public void challenge() {
		
		System.out.println("Start of output for Challenge Exercise");
		System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
		
	}
}
