package com.lq.lab5;

public class Box {
	private double length, width, height;

	
	public Box(double l, double w, double h) {
		length = l;
		width = w;
		height = h;
	}
	
	public Box() {
		length = 1.0;
		width = 1.0;
		height = 1.0;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return 2*(width * length * height);
	}

	public double getSurfaceArea() {
		return (width * length) * 6;
	}

	public void printBox() {
		if(width <= 0 || length <= 0 || height <= 0) {
			System.out.println("invalid parameters");
		}
		else {
			System.out.println("Length = " + length + "\nWidth = " + width + "\nHeight = " + height +
								"\nVolume = " + getVolume() + "\nSurface Area = " + getSurfaceArea());
		}
	}
}
