package com;

class Bicycle
{
	int gear; 
	int speed;
	void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	void accelerate(int increment)
	{
		speed+=increment;
	}
	public String toString() {
		return "Bicycle[gear="+gear+", speed="+speed+", 
	}
}

public class SLInheritance {
	public static void main(String[] args) {
		Bicycle obj = new Bicycle();
		obj.gear=5;
		obj.speed=20;
		obj.accelerate(5);
		obj.applyBreak(5);
		System.out.println(obj.toString());
		}
	}
