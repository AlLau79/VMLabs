package com.lq.exercises;

public class Cube extends Box {

	public double width,length,height;

	public Cube(double l) {
		this.setLength(l);
	}
	
	public void setHeight(double h) {
		setSide(h);
	}
	
	public void setWidth(double w) {
		setSide(w);
	}
	
	public void setLength(double l) {
		setSide(l);
	}
	
	private void setSide(double l) {
		if (l != super.getLength() && l >0) {
			super.setWidth(l);
			super.setHeight(l);
			super.setLength(l);
		}
			
	}
	
	public double getSide() {
		return length;
	}
}
