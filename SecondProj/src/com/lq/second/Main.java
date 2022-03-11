package com.lq.second;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		
		if (name.equalsIgnoreCase("John")) {
			System.out.println("Later!");
		} else {
			System.out.println("Good-bye");
		}
	}

}
