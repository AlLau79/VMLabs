package com.lq.lab5;

public class Box {

	private double width, length, height;


	public Box(double num) {
		width = num;
		length = num;
		height = num;

	}

	public Box(double w, double l, double h) {
		width = w;
		length = l;
		height = h;
	}

	public void setWidth(double w) {
		width = w;
	}

	public void setLength(double l) {
		length = l;
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {
		return width * length * height;
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
