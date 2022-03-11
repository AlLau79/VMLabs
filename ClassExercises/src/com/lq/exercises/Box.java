package com.lq.exercises;

public class Box {

	public double width,length,height;
	
	public Box(double w, double l, double h) {
		width = w;
		length = l;
		height = h;
	}
	public Box(double s) {
		width = s;
		length = s;
		height = s;
	}
	
	public Box() {
		width = 0;
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
}
