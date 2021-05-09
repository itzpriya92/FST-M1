package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int maxPassengers) {
    	this.maxPassengers=maxPassengers;
    	this.passengers =new ArrayList<>();
    }
    
    public void  onboard(String passenger) {
    	this.passengers.add(passenger);
    }
    
    public Date takeoff() {
    	this.lastTimeTookOf =new Date();
    	return lastTimeTookOf;
    }
    
    public void land() {
    	this.lastTimeLanded =new Date();
    	this.passengers.clear();
    
    }
    
    public Date getLastTimeLanded() {
    	return lastTimeLanded;
        }
    
    public List<String> getPassengers(){
    	return passengers; 
    }
}

public class Activity6 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		Plane plane =new Plane(10);
		plane.onboard("Sukanya");
		plane.onboard("Nitya");
		plane.onboard("Namish");
		plane.onboard("praveen");
		
		System.out.println("takeoff time for the plane is "+plane.takeoff());
		System.out.println("List of passengers in the plane is "+plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Landing time of plane is "+ plane.getLastTimeLanded());
		
		

	}

}