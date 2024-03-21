package com.dayFive;

class Bicycle {
	int gear;
	int speed;

	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}
class MountainBike extends Bicycle{
	int seatHeight;

	public MountainBike(int gear, int speed,int seatHeight ) {
		super(gear, speed );
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return super.toString()+ "seat height "+seatHeight;
	}
	
}

public class Main {
	public static void main(String[] args) {
		 MountainBike mb = new MountainBike(3, 100, 25);
		 System.out.println(mb.toString());
	}
}
