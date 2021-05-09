package activities;

interface BicycleParts{
	public int gears=0;
	public int speed=0;
	
}
interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

class Bicycle implements BicycleParts,BicycleOperations{
	public int gears;
	public int speed;
	public void applyBrake(int decrement) {
		this.speed=this.speed-decrement;
		
	}
	public void speedUp(int increment) {
		this.speed=this.speed+increment;
	}
	
	Bicycle(int gears,int speed){
		this.gears=gears;
		this.speed=speed;
	
	}
	public void bicycleDesc() {
		System.out.println("The current number of gears are "+ gears);
		System.out.println("The current speed is  "+ speed);
		
	}
}

class MountainBike extends Bicycle {
	public int seatHeight;
	MountainBike(int gears, int height, int speed){
		super(gears,speed);
		seatHeight=height;
		}
	
	public void setHeight(int newvalue) {
		seatHeight=newvalue;
	}
	
	public void bicycleDesc() {
		System.out.println("The current number of gears are "+ gears);
		System.out.println("The current speed is  "+ speed);
		System.out.println("The current height is  "+ seatHeight);
			
	}
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 MountainBike mb = new MountainBike(3, 0, 25);
		    mb.bicycleDesc();
		    mb.speedUp(20);
		    mb.applyBrake(5);
		    mb.bicycleDesc();
	}

}