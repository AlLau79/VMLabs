package com.lq.inh;

public class Car implements ICar{
	
	private int speed, maxSpeed, gas;
	private boolean engineState;
	private String model;
	
	public Car() {
		
	}
	
	public void setState(boolean s) {
		engineState = s;
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	
	public void setMaxSpeed(int m) {
		maxSpeed = m;
	}
	
	public void setGas(int g) {
		gas = g;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	public boolean getState() {
		return engineState;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public String getModel(){
		return model;
	}
	public int getGas() {
		return gas;
	}
	
	public int getSpeed() {
		return speed;
	}
}
