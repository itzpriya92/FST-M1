package activities;

public class Car {
 String color;
 String transmission;
 int make;
 int tyres;
 int doors;
 
 Car(){
	tyres=4;
	doors=4;
 }
 public void displayCharacteristics() {
	 System.out.println("The values of color is " +color);
	 System.out.println("The values of transmission is " +transmission);
	 System.out.println("The values of make is " +make);
	 System.out.println("The values of tyres is " +tyres);
	 System.out.println("The values of doors is " +doors);
 }
 
 public void accelarate() {
	 System.out.println("Car is moving forward.");
 }
 public void brake() {
	 System.out.println("The car has stopped");
 }
}