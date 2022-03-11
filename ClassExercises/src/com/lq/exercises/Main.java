package com.lq.exercises;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box c = new Cube(5.0);
		Box b = new Cube(8.0);
		
		System.out.println("Cube 1 length is " + c.getLength());
		System.out.println("Cube 1 width is " + c.getWidth());
		System.out.println("Cube 1 height is " + c.getHeight());

		System.out.println("Cube 2 length is " + b.getLength());
		System.out.println("Cube 2 width is " + b.getWidth());
		System.out.println("Cube 2 height is " + b.getHeight());
		
		c.setLength(6.0);
		
		System.out.println("Cube 1 length is " + c.getLength());
		System.out.println("Cube 1 width is " + c.getWidth());
		System.out.println("Cube 1 height is " + c.getHeight());
	}

}
