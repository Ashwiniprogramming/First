package com.xworkz.mutipleinheritanceininterface;

public class Twowheeler implements MotorBike,Cycle {
	int totaldistance;
	int avgspeed;
	
	@Override
	public void totaldistance() {
		totaldistance=speed*distance;
		System.out.println("total distance travelled:" +totaldistance);
	}
	
	@Override
	public void speed() {
		int avgspeed=totaldistance/speed;
		System.out.println("Average speed is :" +avgspeed);
	}

}
